package scope1.protecedScope1;

import scope.protecedScope.ScopeClass;

public class ScopeClass1 extends ScopeClass {

	public void method1() {
		super.name = "";

		method();
		System.out.println("Message frm ScopeClass1");
	}

	
}
