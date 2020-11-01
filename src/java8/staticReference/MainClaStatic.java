package java8.staticReference;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class MainClaStatic {
	
	public static void main(String args[]) {
		//BiFunction<Integer, Integer, Integer> product = Multiplication::multiply;  
		BiConsumer<String, String> product = Multiplication::multiplys; 
		BiPredicate<String,String> ro = Multiplication::multiplys;
		product.accept("Srikrishna","");  
		System.out.println("Product of given number is: "+pr);  
	}

}
