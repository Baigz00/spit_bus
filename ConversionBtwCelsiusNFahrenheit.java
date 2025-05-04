public class ConversionBtwCelsiusNFahrenheit {
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit;
        for(celsius = 40.0; celsius > 30; celsius--){
            fahrenheit = (9.0 / 5) * celsius + 32;
        }
        return celsius;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius;
        for(fahrenheit = 120.0; fahrenheit >= 30; fahrenheit-- ){
            celsius = (5.0 / 9 ) * (fahrenheit - 32);
        }
        return fahrenheit;
    }
}
