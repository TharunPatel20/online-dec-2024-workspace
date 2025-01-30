package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mybeans.Department;
import mybeans.Employee;
import mybeans.Person;

@Configuration
public class MyJavaBasedConfiguration {

	@Bean
	public Person person() {
		return new Person(101, "Jackie", "Chan");
	}
	
	@Bean
	public Department department() {
		return new Department(201, "IT");
	}
	
	@Bean
	public Employee employee() {
		return new Employee(501, "Will Smith", department());
	}
}
