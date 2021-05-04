package javaCamp3week;

public class Main {

	public static void main(String[] args) {
		
					
		Student student= new Student();
						
		student.setId("1");
		student.setFirstName("Erdem");
		student.setLastName("Karamisir");
		student.seteMail("erdemkaramisir@gmail.com");
		student.setTakeLesson("Java");
		
		
		Instructor instructor= new Instructor();
	
		instructor.setId("2");
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiroğ");
		instructor.seteMail("engindemirog@gmail.com");
		instructor.setGiveLesson("Java");
	
		
		UserManager userManager= new UserManager();
		
		userManager.add(student);
		userManager.add(instructor);
		
		InstructorManager instructorManager= new InstructorManager();
		instructorManager.add(instructor);
	
		StudentManager studentManager=new StudentManager();
		studentManager.add(student);
		
		
		
	
	}

		
}
