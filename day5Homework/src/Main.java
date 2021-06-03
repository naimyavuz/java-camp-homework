import business.concretes.UserManager;
import core.abstracts.LoggerService;
import core.abstracts.ValidationService;
import core.abstracts.VerificationService;
import core.concretes.EmailValidater;
import core.concretes.EmailVerification;
import core.concretes.GoogleLoggerManagerAdapter;
import core.concretes.LoggerManager;
import core.concretes.NameValidater;
import core.concretes.PasswordValidater;
import core.concretes.RepetitionControl;
import dataAccess.concretes.HibernateUserDao;
import dataAccess.concretes.XYZUserDao;
import entities.concretes.User;
import entities.concretes.VerificationCode;

public class Main {

	public static void main(String[] args) {

		HibernateUserDao hibernateUserDao = new HibernateUserDao();
		XYZUserDao xyzUserDao = new XYZUserDao();
		EmailVerification emailVerification = new EmailVerification();
		EmailValidater emailValidater = new EmailValidater();
		
		VerificationService verificationService;
		LoggerService loggerService;
		
		ValidationService[] validationServices = {new NameValidater(), new PasswordValidater()};
		ValidationService validationService1 = new NameValidater();
		ValidationService validationService2 = new PasswordValidater();
		ValidationService validationService3 = new RepetitionControl();
		
		UserManager userManager1 = new UserManager(new HibernateUserDao(), new GoogleLoggerManagerAdapter());
		UserManager userManager2 = new UserManager(new XYZUserDao(), new GoogleLoggerManagerAdapter());
		UserManager userManager3 = new UserManager(new HibernateUserDao(), new LoggerManager());
		UserManager userManager4 = new UserManager(new XYZUserDao(), new LoggerManager());
		
		//Email doðrulamasý
		System.out.println("------------EMAIL CORRECTION------------");
		String email1 = "naim@";
		while(!emailValidater.check(email1)) {
			email1 = "naim@xyz.com";
		}
		
		System.out.println("--------------USER 1--------------");
		User user1 = new User(1, "NAÝM", "YAVUZ", "qwerty", email1, (int)(Math.random()*1000000));
		
		//USER 1
		//Name Check
		validationService1.check(user1);
		//Password Check
		validationService2.check(user1);
		validationService3.check(user1);
		//Hibernate and Google
		userManager1.add(user1);
		//XYZ and Google
		userManager2.add(user1);
		//Hibernate and Default
		userManager3.add(user1);
		//XYZ and Default
		userManager4.add(user1);
		
		
		emailVerification.send(user1);
		VerificationCode verificationCode1 = new VerificationCode(user1.getUserVerificationCode());
		System.out.println("Verification code is : " + user1.getUserVerificationCode());
		emailVerification.verify(user1, verificationCode1);
		
		//Using the same email with user1
		System.out.println("--------------USER 2--------------");
		User user2 = new User(1, "NAÝM", "YAVUZ", "qwerty", email1, (int)(Math.random()*1000000));
		validationService1.check(user2);
		validationService2.check(user2);
		validationService3.check(user2);
		
		System.out.println("--------------USER 3--------------");
		String email3 = "abc";
		while(!emailValidater.check(email3)) {
			email3 = "abc@example.com";
		}
		
		User user3 = new User(1, "NAÝM", "YAVUZ", "qwerty", email1, (int)(Math.random()*1000000));
		validationService1.check(user2);
		validationService2.check(user2);
		validationService3.check(user2);
		userManager3.add(user3);
		
		emailVerification.send(user1);
		VerificationCode verificationCode = new VerificationCode(user3.getUserVerificationCode());
		emailVerification.verify(user3, verificationCode);
		
	}

}
