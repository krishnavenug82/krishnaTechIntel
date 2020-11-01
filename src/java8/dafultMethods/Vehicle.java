package java8.dafultMethods;

public interface Vehicle {
	
	default void print() {
	      System.out.println("I am a vehicle!");
	   }

}
