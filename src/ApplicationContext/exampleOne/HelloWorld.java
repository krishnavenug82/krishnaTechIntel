package ApplicationContext.exampleOne;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld  implements InitializingBean, DisposableBean{
	 private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	
	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Initilization");
		
	}
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println("Destory");
		
	}
}
