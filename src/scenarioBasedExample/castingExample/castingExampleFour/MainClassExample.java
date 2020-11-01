package scenarioBasedExample.castingExample.castingExampleFour;

/*parentExample.childmethod();  Scenarios  access the child class variable from parentclass variable
garentpatent.peanetmethod();*/

public class MainClassExample {

	public static void main(String args[]) {

		ChildExample childExample = new ChildExample();
		ChildExample childExample1 = null;;

		/*ParentExample parentExample = childExample;
		parentExample.grandparent();
		parentExample.parent();

		childExample1 = (ChildExample) parentExample;
		childExample1.child();

		GrandParent grandParent = new GrandParent();

		// Approach 1 child object creations
		childExample1 = childExample;

		// Approach 2 child object creations
		childExample1 = (ChildExample) parentExample;

		// Approach 3 child object creations
		// childExample1 = new ChildExample();
		*/
		
		// Secenario 2
		ParentExample parentExample1 = childExample1;		
		childExample1 = (ChildExample) parentExample1;

	}

}
