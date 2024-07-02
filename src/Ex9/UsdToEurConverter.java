package Ex9;

public class UsdToEurConverter implements CurrencyConverter {
    private static final double USD_TO_EUR_RATE = 0.85; // Example rate, should be updated with the current rate

    @Override
    public void convert(double amount, String fromCurrency, String toCurrency) {
        if ("USD".equals(fromCurrency) && "EUR".equals(toCurrency)) {
            double convertedAmount = amount * USD_TO_EUR_RATE;
            System.out.println("Converting " + amount + " " + fromCurrency + " to " + toCurrency + ": " + convertedAmount + " " + toCurrency);
        } else {
            System.out.println("Conversion from " + fromCurrency + " to " + toCurrency + " is not supported.");
        }
    }
}
