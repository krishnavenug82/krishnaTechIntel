package intNDestroyMethod.exampleOne;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		BeanLifeCycle obj = (BeanLifeCycle) context.getBean("beanLifeCycle");
		obj.getMessage();
		context.registerShutdownHook();
	}

}
