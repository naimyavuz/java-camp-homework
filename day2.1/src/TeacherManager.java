
public class TeacherManager {
	
	Teacher teacher1, teacher2;
	
	public void addTeacher() {
		
		teacher1 = new Teacher(1, "Engin");
		System.out.println("Öðretmen atandý: " + teacher1.name);
		teacher2 = new Teacher(2, "Demir");
		System.out.println("Öðretmen atandý: " + teacher2.name);
		
	}
	
	Teacher[] teachers = {teacher1, teacher2};
	public void getList() {
		
		
		System.out.println("-------");
		
		for(Teacher teacher : teachers) {
			
			System.out.println(teacher.id + " " + teacher.name);
		}
		
	}
}
