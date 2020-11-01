package ApplicationContext.exampleOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
	      ApplicationContext context = new FileSystemXmlApplicationContext
	         ("H:\\Java_Hadoop\\EclipseWorkSpace\\krishnaTechIntel\\src\\Beans.xml");	      
	      HelloWorld obj = (HelloWorld) context.getBean("helloWorlds");
	      obj.getMessage();
	   }

}
