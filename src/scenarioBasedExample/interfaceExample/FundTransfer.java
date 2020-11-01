package scenarioBasedExample.interfaceExample;

public class FundTransfer implements CurrencyConversion {

	public int swiftFundTransferToBeneficary(int amountToBeconverted, int currentConversionRate) {

		return convertCurrency(amountToBeconverted, currentConversionRate);
	}

	@Override
	public int convertCurrency(int amountToBeconverted, int currentConversionRate) {
		// TODO Auto-generated method stub

		return (amountToBeconverted * currentConversionRate);
	}

}
