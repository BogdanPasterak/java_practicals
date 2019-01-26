package practical_2;

public class CurrencyConverter {
	
	// fields
	private double rateEURToGBP = 0.90;
	private double rateEURToUSD = 1.14;
	private double rateGBPToEUR = 1.11;
	private double rateGBPToUSD = 1.28;
	private double rateUSDToEUR = 0.87;
	private double rateUSDToGBP = 0.78;
	
	public CurrencyConverter(double rateEURToGBP, double rateEURToUSD, double rateGBPToEUR,
			double rateGBPToUSD, double rateUSDToEUR, double rateUSDToGBP) {
		this.rateEURToGBP = rateEURToGBP;
		this.rateEURToUSD = rateEURToUSD;
		this.rateGBPToEUR = rateGBPToEUR;
		this.rateGBPToUSD = rateGBPToUSD;
		this.rateUSDToEUR = rateUSDToEUR;
		this.rateUSDToGBP = rateUSDToGBP;
	}
	
	
	// functions
	public double convertEURtoGBP(double amountToConvert) {
		return amountToConvert * rateEURToGBP;
	}

	public double convertEURtoUSD(double amountToConvert) {
		return amountToConvert * rateEURToUSD;
	}
	
	public double convertGBPtoEUR(double amountToConvert) {
		return amountToConvert * rateGBPToEUR;
	}

	public double convertGBPtoUSD(double amountToConvert) {
		return amountToConvert * rateGBPToUSD;
	}

	public double convertUSDtoEUR(double amountToConvert) {
		return amountToConvert * rateUSDToEUR;
	}

	public double convertUSDtoGBP(double amountToConvert) {
		return amountToConvert * rateUSDToGBP;
	}


}
