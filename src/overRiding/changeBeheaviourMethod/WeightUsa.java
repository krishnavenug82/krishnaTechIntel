package overRiding.changeBeheaviourMethod;

public class WeightUsa extends Weigh {

	public int weight(String name) {

		if (name == "elephant") {
			return 12000;
		} else if (name == "lion") {
			return 1000;
		}

		return 0;
	}

}
