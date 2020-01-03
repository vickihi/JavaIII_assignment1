package assignment1;


public class Student {
	
	private String stdId;
	private String stdName;
	
	
	public Student() {
		super();
	}

	public Student(String stdId, String stdName) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
	}
	

	public String getStdId() {
		return stdId;
	}

	public void setStdId(String stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	@Override
	public String toString() {
		return "student_name is " + stdName + " student_Id is " + stdId;
	}

}
