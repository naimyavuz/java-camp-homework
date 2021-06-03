package core.concretes;



import core.abstracts.VerificationService;
import entities.concretes.User;
import entities.concretes.VerificationCode;

public class EmailVerification implements VerificationService {

	private VerificationService[] verificationServices;
	private VerificationCode verificationCodes;
	
	
	public EmailVerification(VerificationService[] verificationServices, VerificationCode verificationCodes) {
		super();
		this.verificationServices = verificationServices;
		this.verificationCodes = verificationCodes;
	}

	public EmailVerification() {
	
	}
	
	
	@Override
	public void send(User user) {
		System.out.println("Verification code sent to your email, please verify before login.");
	}

	@Override
	public boolean verify(User user, VerificationCode verificationCode) {
		
		if(verificationCode.getVerificationCode() == user.getUserVerificationCode()) {
			
			System.out.println("Email verified. You can login.");
			return true;
		}
		
		else {
			System.out.println("Verification code is invalid");
			}
		return false;
	}
	

	
}
