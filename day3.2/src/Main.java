
public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setInstructorId(1);
		instructor1.setName("Engin");
		instructor1.setSurname("Demiroğ");
		instructor1.setAge(30);
		instructor1.setExperienceTime(1500);
		instructor1.setEmail("engindemiro.gmail.com");
		
		Student student1 = new Student();
		student1.setId(2);
		student1.setName("Naim");
		student1.setSurname("Yavuz");
		student1.setAge(21);
		student1.setEmail("naimyavuz59@gmail.com");
		student1.setGrade(100);
		
		User[] users = {instructor1, student1};
		
		System.out.println("Öğretmenin adı: " + instructor1.getName() + " " + instructor1.getSurname());
		
		StudentManager studentManager = new StudentManager();
		studentManager.GradeStudent(student1);
		System.out.println("------------------------");
		
		UserManager userManager = new UserManager();
		userManager.addMultiple(users);
		
	}

}