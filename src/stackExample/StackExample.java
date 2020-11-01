package stackExample;

import java.util.Stack;

public class StackExample {

	public static void main(String args[]) {
		
		Stack<String> stackOfCards = new Stack<>();
		stackOfCards.push("Krishna");
		stackOfCards.push("Radha");
		stackOfCards.push("Anjeneya");		
		System.out.println(" Push "+ stackOfCards);
		
		
		String stackPop = stackOfCards.pop();
		System.out.println(" pop = " + stackPop);
		//System.out.println(" Push "+ stackOfCards);
		
		String stackPop1 = stackOfCards.pop();
		System.out.println(" peek = " + stackPop1); 
	//	System.out.println(" Push "+ stackOfCards);
		
		//System.out.println(stackOfCards.elementAt(0));
		
		//System.out.println(stackOfCards.empty());
		
	}
	
}
