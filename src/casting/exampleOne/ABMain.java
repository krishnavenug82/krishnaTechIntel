package casting.exampleOne;

public class ABMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		Bclass bone = new Aclass();
		System.out.println(bone.hashCode());
		
		Aclass aone = (Aclass) bone;
		System.out.println(aone.hashCode());
		
		System.out.println(bone.equals(aone));*/
		
		Bclass bone = new Bclass ();
		
		Aclass aone = new Aclass();
		
		System.out.println(bone.equals(aone));
		
		
	
		
	}

}
