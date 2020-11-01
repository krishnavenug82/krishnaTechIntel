package fascadeDesignPattern.exampleOne;

public class FacadePatternDemo {
	
	public static void main(String[] args) {
        CarFacade facade = new CarFacade();
        facade.buildCar();
    }

}
