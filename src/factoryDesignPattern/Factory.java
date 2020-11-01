package factoryDesignPattern;

import java.time.LocalDate;

public class Factory {

	public static Object createObject(String className) {
		
		if(className.equals("1")) {
			One o=new One();
			o.setGrandParentCreatedon(LocalDate.now());
			return 0 ;
			
		}
		if(className.equals("2")) {
			return new Two();
		}
		if(className.equals("3")) {
			return new Three();
		}
		return null;
		
	}
}
