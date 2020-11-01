package lambdaExression.withLambda;

public class Main4Commercial {

	public static void main(String[] args) {
		
		String sdd = ()->{
			
		}
		// TODO Auto-generated method stub

		Commercial comm1 = new Commercial() {

			@Override
			public void personal(int age, int yrs) {
				// TODO Auto-generated method stub
				//System.out.println("Adding body without Lamda" + name + "" + age);
				System.out.println("Adding body without Lamda" +"" + "" + age);
			}

		};
		comm1.personal( 158,1000);

		Commercial comm = (age, yrs) ->(age*yrs);
		
			//System.out.println("Adding body with Lamda " + name + "" + age);
		System.out.println("Adding body with Lamda " + yrs + "" + age);

		

		comm.personal(1000,52);

	}

}
