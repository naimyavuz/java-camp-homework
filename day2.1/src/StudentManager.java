
public class StudentManager {

	Student student1, student2;
	
	public void register() {
		
		student1 = new Student(1, "Naim", 21);
		System.out.println("Öğrenci kaydedildi: "+ student1.name);
		student2 = new Student(2, "Yavuz", 18);
		System.out.println("Öğrenci kaydedildi: "+ student2.name);
	}
}
