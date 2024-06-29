package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.sp.beans.Student;

public class Main 
{
public static void main(String[] args) {
	String Config_loc="/in/sp/resources/applicationContext.xml";
	ApplicationContext context=new ClassPathXmlApplicationContext(Config_loc);
	
	Student stu1=(Student)context.getBean("stdId1");
	stu1.display();
	
	System.out.println("------------------");
	
	Student std2=(Student)context.getBean("stdId2");
	std2.display();
	
}
}
