package java8.biFunctionalExam;

import java.util.function.BiFunction;

public class MainbiFunClassExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// BiFunction to add 2 numbers 
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b; 
  
        // Implement add using apply() 
        System.out.println("Sum = " + add.apply(2, 3)); 
  
        // BiFunction to multiply 2 numbers 
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b; 
  
        // Implement add using apply() 
        System.out.println("Product = " + multiply.apply(2, 3)); 
        
        // BiFunction to divide 2 numbers 
        BiFunction<Integer, Integer, Integer> divide = (a, b) -> a / b; 
  
        // Implement add using apply() 
        System.out.println("Product = " + divide.apply(2, 3)); 
        
        
        
        ///******************** Add then *************************************
        
        BiFunction<Integer, Integer, Integer> composite1 = (a, b) -> a + b; 
        
        // Using addThen() method 
        composite1 = composite1.andThen(a -> 2 * a); 
  
        // Printing the results 
        System.out.println("Composite1 = " + composite1.apply(2, 3)); 
  
        // BiFunction to demonstrate composite functions 
        // Here it will find the sum of two integers 
        // and then return twice their sum 
        BiFunction<Integer, Integer, Integer> composite2 = (a, b) -> a * b; 
  
        // Using addThen() method 
        composite2 = composite2.andThen(a -> 3 * a); 
        composite2 = composite2.andThen(b -> 3 * b); 
  
        // Printing the result 
        System.out.println("Composite2 = " + composite2.apply(2, 3)); 
    } 
	

}
