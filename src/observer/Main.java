package observer;

public class Main {
	public Main() {
		ObservableValue ov = new ObservableValue(0);
		TextObserver to = new TextObserver(ov);
		ov.addObserver(to);
	}

	public static void main(String[] args) {
		Main m = new Main();
	}
}