package Ex9;

public class EurToThbConverter implements CurrencyConverter {
    private static final double EUR_TO_THB_RATE = 36.69;

    @Override
    public void convert(double amount, String fromCurrency, String toCurrency) {
        if ("EUR".equals(fromCurrency) && "THB".equals(toCurrency)) {
            double convertedAmount = amount * EUR_TO_THB_RATE;
            System.out.println("Converting " + amount + " " + fromCurrency + " to " + toCurrency + ": " + convertedAmount + " " + toCurrency);
        } else {
            System.out.println("Conversion from " + fromCurrency + " to " + toCurrency + " is not supported.");
        }
    }
}
