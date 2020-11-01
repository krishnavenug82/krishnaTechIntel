package factoryDesignPattern;

import java.time.LocalDate;

public class Caller {

	public static void main(String[] args) {

		One one=new One();
		Two two=new Two();
		Three three=new Three();
		
		two=(Two)Factory.createObject("1");
		
		
		
		
		
	}

}
