package arrayCounterMap;

public class ArrayCounterMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] consumer = { 15, 25, 33, 4, 15, 14, 25, 33, 25, 45 };

		int count = 0;

		for (int i = 0; i < consumer.length; i++) {

			int occurance = consumer[i];
			if (occurance == consumer[i]) {
				count++;
			}
		}

		System.out.println(count);

	}

}
