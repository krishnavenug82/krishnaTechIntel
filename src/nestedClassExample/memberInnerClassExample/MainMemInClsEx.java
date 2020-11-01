package nestedClassExample.memberInnerClassExample;

public class MainMemInClsEx {
	
	public static void main(String args[]) {
		
		MemInClsEx.ClassOne ver = new MemInClsEx().new ClassOne();
		ver.consumer();
		
		
	}

}
