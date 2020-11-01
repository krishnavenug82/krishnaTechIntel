package f5KeyExample.consumer;

public class Income {

	int fixedComponent;
	int variableComponent;

	public int fixedIncome(int fixedIncome) {
		this.fixedComponent = fixedIncome;
		return fixedIncome;
	}

	public int variableIncome(int variableIncome) {
		this.variableComponent = variableIncome;
		return variableIncome;
	}

	public int annualIncome() {
		int ctc = fixedComponent + variableComponent;
		return ctc;
	}

}
