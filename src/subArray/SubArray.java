package subArray;

import java.util.Arrays;

public class SubArray {

	public <T> T[] subArray(T[] array, int beg, int end) {
		return Arrays.copyOfRange(array, beg, end);

	}

}
