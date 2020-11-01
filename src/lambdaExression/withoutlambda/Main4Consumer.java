package lambdaExression.withoutlambda;

public class Main4Consumer {
	
	
	public void comm() {
		Main4Consumer m4c = new Main4Consumer();
		
		
	}
	
	public static void main (String args[]) {
		
	
		
		Consumer cons = new Consumer() {

			@Override
			public void client(String name) {
				// TODO Auto-generated method stub
				System.out.println(name);
				
			}

			@Override
			public String users(String user) {
				// TODO Auto-generated method stub
				return user;
			}
			
		};
		
		cons.client("Srikrishna");
		System.out.println(cons.users("Sriradhe"));
	}

}
