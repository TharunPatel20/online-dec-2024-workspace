

import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.Employee;
import mybeans.Person;

public class Demo {

	public static void main(String[] args) {
		
		Person person1 = new Person(101, "Emma", "Watson");
		System.out.println(person1);
		
		Person person2 = new Person();
		person2.setPersonId(102);
		person2.setPersonFirstname("Rupert");
		person2.setPersonLastname("Grint");
		System.out.println(person2);
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("anyName.xml");
		Person person3 = context.getBean("per1", Person.class);
		System.out.println(person3);
		
		// the beans created here are singleton
		Person person4 = context.getBean("per1", Person.class);
		System.out.println(person4);
		
		person4.setPersonId(111);
		System.out.println(person3);
		System.out.println(person4);
		
		Employee emp1 = context.getBean("emp", Employee.class);
		System.out.println(emp1);
		
	}

}
