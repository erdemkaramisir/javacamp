package javaCamp3week;

public class Instructor extends User {
	
	
	private String giveLesson;
	
	
	public Instructor() {
		
		
	}
	
	
	public Instructor(String id, String firstName, String lastName, String eMail, String giveLesson) {
		super(id, firstName, lastName, eMail);
		this.giveLesson = giveLesson;
	}

	public String getGiveLesson() {
		return giveLesson;
	}

	public void setGiveLesson(String giveLesson) {
		this.giveLesson = giveLesson;
	}

	
	
	
}
