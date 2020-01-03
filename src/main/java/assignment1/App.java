package assignment1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import assignment1.Student;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new 
				ClassPathXmlApplicationContext("beans.xml");
		
		Teacher teacher = (Teacher)context.getBean("teacherBean");
		
		teacher.showTeacher();
		teacher.showStudents();
		
		((ClassPathXmlApplicationContext)(context)).close();
		
	}

}


