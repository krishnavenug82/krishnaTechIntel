package scenarioBasedExample.hashCodeCreation.exampleThree;

public class MainClassOneTwoThree {
	
public static void main(String args[]) {
		
		ChildClass clOne = new ChildClass();
		System.out.println("Instance of ClassOne  = " + clOne.hashCode());
		
		ParentClass clTwo = new ParentClass();
		System.out.println("Instance of ClassTwo  = " +clTwo.hashCode());
		
		GrantParentClass clThree = new GrantParentClass();
		System.out.println("Instance of ClassThree  = " +clThree.hashCode());
		
		ParentClass clFour = clOne;
		System.out.println("ClassOne Upcasting = "+ clFour.hashCode());
		
		ChildClass clFive =  (ChildClass) clFour;
		System.out.println("ClassOne Downcasting = "+ clFive.hashCode());
		
		GrantParentClass clsix =  new ChildClass();
		System.out.println("ClassOne Upcasting with grandparent = "+ clsix.hashCode());
		
		ChildClass clSeven = (ChildClass) clsix;
		System.out.println("ClassOne Downcasting with grandparent = "+ clSeven.hashCode());
		
		GrantParentClass clEight = new ParentClass(); 
		System.out.println("Classtwo Upcasting with grandparent = "+ clEight.hashCode());
		
		ParentClass clNine = (ParentClass) clEight;
		System.out.println("Classtwo Downcasting with grandparent = "+ clNine.hashCode());
	}

}
