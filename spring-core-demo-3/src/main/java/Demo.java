import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import config.MyJavaBasedConfiguration;
import mybeans.Employee;
import mybeans.Person;

public class Demo {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyJavaBasedConfiguration.class);
		Person per1 = context.getBean("person", Person.class);
		System.out.println(per1);

		
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp);
	}

}
