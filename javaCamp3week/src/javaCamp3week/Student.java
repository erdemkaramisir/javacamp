package javaCamp3week;

	public class Student extends User {
	
		private String takeLesson;
	
	
		public Student() {
			
		}
	
		public Student(String id, String firstName, String lastName, String eMail, String takeLesson){
			super(id, firstName, lastName, eMail);
			this.takeLesson = takeLesson;
		}
	
		public String getTakeLesson() {
			return takeLesson;
		}
	
		public void setTakeLesson(String takeLesson) {
			this.takeLesson = takeLesson;
		}

	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

