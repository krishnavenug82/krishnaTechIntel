package instanceExample.regularClassWithInstance;

public class MainClassAA {

	void sampleMethod(ClassSuperGrantPar consumerName) {
		
		
		if (consumerName instanceof ClassChild) {			
			
			ClassChild consumers = (ClassChild) consumerName;
			consumers.chdMethod();
			
		} else;

	}

	public static void main(String argument[]) {

		MainClassAA mainClassAAVar = new MainClassAA();
		//mainClassAAVar.sampleMethod(new ClassChild());
		mainClassAAVar.sampleMethod(new ClassParent());

		/*
		 int varC = 0; 
		 Integer intVar = (Integer) varC; 
		 ClassChild varA = new ClassChild(); 
		 ClassParent varb = new ClassParent(); 
		 System.out.println((varA
		 instanceof ClassChild)); 
		 System.out.println((intVar instanceof Object));
		 ClassOnw classOnw = new ClassOnw(); classOnw.consuumer(new ClassChild());
		 classOnw.consuumer(new ClassParent());
		 */

	}
}
