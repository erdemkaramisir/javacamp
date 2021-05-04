package javaCamp3week;

public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println("Almış olduğunuz Kurslar :"+student.getTakeLesson() );
	}
}
