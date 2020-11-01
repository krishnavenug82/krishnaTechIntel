package memoryOutOfErrorExa;

public class MainClassOneMemoryOutOfError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		ClassOneMemoryOutOfError classOneMemoryOutOfError = new ClassOneMemoryOutOfError();
		int result = classOneMemoryOutOfError.mulTwonumber(10000000, 16598791);
		System.out.println(result);

		/*Integer[] array = new Integer[100000* 50000000];
		int length = array.length;

		for (int i = 0; i < length; i++) {
			System.out.println(i);

		}*/

	}
}
