package intNDestroyMethod.exampleTwo;

import org.springframework.beans.factory.InitializingBean;

public class ExampleBeanInt implements InitializingBean{
	
	private String message;

	public String getMessage() {
		
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
