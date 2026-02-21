public class TemperatureConverter {
    // Converts Celsius to Fahrenheit
    public static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Converts Fahrenheit to Celsius
    public static double toCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Overloaded method to determine direction
    public static double convert(String type, double value) {
        if (type.equalsIgnoreCase("Ctof")) {
            return toFahrenheit(value);
        } else if (type.equalsIgnoreCase("Ftoc")) {
            return toCelsius(value);
        }
        return 0;
    }

    public static void main(String[] args) {
        double cVal = 100.0;
        System.out.println((int)cVal + "°C");
        System.out.println(Math.round(toFahrenheit(cVal)) + "°F");

        double fVal = 100.0;
        System.out.println((int)fVal + "°F");
        System.out.println(Math.round(toCelsius(fVal)) + "°C");

        // Using overloaded convert method
        System.out.println(Math.round(convert("Ctof", 100)) + "°F");
        System.out.println(Math.round(convert("Ftoc", 100)) + "°C");
    }
}