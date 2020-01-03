package assignment1;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

	private String teacherName;


	public Teacher() {
		super();
	}

	ArrayList<Student> students;

	public Teacher(ArrayList<Student> students) {
		this.students = students;
	}

	public void showStudents() {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}



	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public void showTeacher() { 
		System.out.println("My name is " + this.teacherName); 
	}

	

}
