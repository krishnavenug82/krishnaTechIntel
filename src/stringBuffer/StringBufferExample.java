package stringBuffer;

public class StringBufferExample {
	
	public static void main (String args[]) {
		
		
		StringBuffer part = new StringBuffer("Srikrishna");
		
		StringBuffer spares  = new StringBuffer("Wheel");
		
		part.append(spares);
		
		System.out.println(part);
		
		StringBuffer sb = new StringBuffer("Geeks"); 
        System.out.println(" String buffer  before = " + sb); 
  
        char[] cstr = new char[] { 'f', 'o', 'r', 'G', 'e', 'e', 'k', 's', 
                                   'b', 'e', 'a', 'g', 'e', 'e', 'k' }; 
        sb.append(cstr, 0, 8); 
        System.out.println("After appending string buffer = " + sb); 
  
	}

}
