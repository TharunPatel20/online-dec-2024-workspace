import org.springframework.context.support.ClassPathXmlApplicationContext;

import mybeans.Employee;
import mybeans.Person;

public class Demo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Person person1 = context.getBean("person", Person.class);
		System.out.println(person1);
		
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);
	}
}
