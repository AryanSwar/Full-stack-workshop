package in.sp.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import in.sp.beans.Student;

@Configuration
public class applicationContext {
	@Bean
	public Student stdId1() 
	{
		Student std = new Student();
		std.setName("Aryan");
		std.setEmail("aryan@gmail.com");
		std.setRollno(108);
		return std;
	}


}
