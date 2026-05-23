import java.util.Scanner;
public class TemperatureConverter {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        double farenheit;
        double kelvin;

        System.out.println("=== Temperature Converter ===");

        farenheit = (celsius * 9.0/5.0) + 32;
        kelvin = celsius + 273.15;

        System.out.printf("Celsius: %.2f °C \n", celsius);
        System.out.printf("Farenheit: %.2f °F \n", farenheit);
        System.out.printf("Kelvin: %.2f °K \n", kelvin);
    }
}
