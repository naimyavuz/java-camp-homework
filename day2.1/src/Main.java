
public class Main {

	public static void main(String[] args) {
		
		
		LessonManager lessonManager = new LessonManager();
		lessonManager.addLesson();
		System.out.println("-------");
		lessonManager.getList();
		
		TeacherManager teacherManager = new TeacherManager();
		teacherManager.addTeacher();
		teacherManager.getList();
		
		
		
	}

}
