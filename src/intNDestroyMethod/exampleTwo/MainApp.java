package intNDestroyMethod.exampleTwo;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import intNDestroyMethod.exampleOne.BeanLifeCycle;

public class MainApp {
	
	public static void main(String[] args) {
	
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	ExampleBeanInt obj = (ExampleBeanInt) context.getBean("exampleBeanInt");
	obj.getMessage();


}
}
