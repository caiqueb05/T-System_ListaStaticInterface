package Ex9;

public class Main {
    public static void main(String[] args) {
        CurrencyConverter usdToEurConverter = new UsdToEurConverter();
        usdToEurConverter.convert(100, "USD", "EUR");

        CurrencyConverter eurToThbConverter = new EurToThbConverter();
        eurToThbConverter.convert(100, "EUR", "THB");
    }
}
