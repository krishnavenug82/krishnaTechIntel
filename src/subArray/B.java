package subArray;

import org.springframework.stereotype.Component;

@Component
public class B {
	
	public static void main(String args[]) {
		String a = "string";
		String b = new String ("string");
		String c = a;
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(b.equals(c));
	}

}
