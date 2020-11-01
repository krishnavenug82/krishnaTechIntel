package hashcodeparentchild;

public class Main {

	public static void main(String[] args) {

		Child c=new Child();
		Parent p=c;
		 c.equals(null);
		 c.equals(p);
		 c.equals(c);
		
		
		System.out.println("parent and child is contwise equal ? :"+ c.equals(p));
	}

}
