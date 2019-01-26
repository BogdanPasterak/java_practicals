package practical_1;

public class CurrencyConverter {
	// fields
	double rateEURToGBP = 0.90;
	double rateEURToUSD = 1.14;
	double rateGBPToEUR = 1.11;
	double rateGBPToUSD = 1.28;
	double rateUSDToEUR = 0.87;
	double rateUSDToGBP = 0.78;
	
	// functions
	public double convertEURtoGBP(int amountToConvert) {
		return amountToConvert * rateEURToGBP;
	}

	public double convertEURtoUSD(int amountToConvert) {
		return amountToConvert * rateEURToUSD;
	}
	
	public double convertGBPtoEUR(int amountToConvert) {
		return amountToConvert * rateGBPToEUR;
	}

	public double convertGBPtoUSD(int amountToConvert) {
		return amountToConvert * rateGBPToUSD;
	}

	public double convertUSDtoEUR(int amountToConvert) {
		return amountToConvert * rateUSDToEUR;
	}

	public double convertUSDtoGBP(int amountToConvert) {
		return amountToConvert * rateUSDToGBP;
	}

	
}
