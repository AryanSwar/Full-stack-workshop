package in.sp.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.sp.beans.Student;
import in.sp.resources.applicationContext;

public class Main {
public static void main(String[] args)
{
	ApplicationContext context=new AnnotationConfigApplicationContext(applicationContext.class);
	Student std = (Student) context.getBean("stdId1");
	std.display();
}
}