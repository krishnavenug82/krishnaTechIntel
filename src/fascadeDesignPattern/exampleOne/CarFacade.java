package fascadeDesignPattern.exampleOne;

public class CarFacade {

		    
	    public void buildCar(){
	        System.out.println("Build car started");
	        
	        CarEngine engine = new CarEngine();
	        engine.setEngine();
	        
	        CarBody body = new CarBody();
	        body.setBody();
	        
	        CarAccessories accessories = new CarAccessories();
	        accessories.setAccessories();
	        
	        System.out.println("Build car completed");
	    }
}
