
public class LessonManager {
	
	Lesson lesson1,lesson2;
	
	public void addLesson() {
		
		lesson1 = new Lesson(1, "Java", 50, "Engin");
		System.out.println("Ders eklendi: " + lesson1.name);
		lesson2 = new Lesson(2, "C#", 30, "Engin");
		System.out.println("Ders eklendi: " + lesson2.name);
		
	}
	
	public void getList() {
		
		Lesson[] lessons = {lesson1, lesson2};
		
		for(Lesson lesson: lessons) {
			
			System.out.println(lesson.id + " " + lesson.name + " " + lesson.lessonTime + " " + lesson.lessonTeacher);
		}
		
		
	}	
}
