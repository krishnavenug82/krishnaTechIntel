package scenarioBasedExample.castingExample.castingExampleFive;

public class MainClassTest {

	static Test1 test1;
	static Test2 test2;
	static Test3 test3;

	public static Test1 getTest1() {
		return test1;
	}

	public static void setTest1(Test1 test1) {
		MainClassTest.test1 = test1;
	}

	public static Test2 getTest2() {
		return test2;
	}

	public static void setTest2(Test2 test2) {
		MainClassTest.test2 = test2;
	}

	public static Test3 getTest3() {
		return test3;
	}

	public static void setTest3(Test3 test3) {
		MainClassTest.test3 = test3;
	}

	public static void main(String args[]) {

		setTest1(new Test1()); 

		setTest2(new Test1());
		setTest2(new Test2());

		setTest3(new Test1());
		setTest3(new Test2());
		setTest3(new Test3());
		
		int a = 6;
		int b = 5; 
		int temp =0;
		
		System.out.println(" A = " + a + " Temp= " + temp+  " B = " + b );
		
		temp = 6;
		a = b;
		b = temp;
		
		System.out.println(" A = " + a + " Temp= " + temp+  " B = " + b );

	}

}
