import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number 1) Celsius 2) Fahrenheit 3)Kelvin 4)Exit");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Enter the Celsius number to convert into Fahrenheit");
                System.out.println("Fahrenheit=" +celsiusToFahrenheit(sc.nextDouble()));
                System.out.println("Enter the Celsius number to convert into Kelvin");
                System.out.println("Kelvin=" +celsiusToKelvin(sc.nextDouble()));
                break;
            case 2:
                System.out.println("Enter the Fahrenheit number to convert into Celsius");
                System.out.println("Celsius=" +fahrenheitToCelsius(sc.nextDouble()));
                System.out.println("Enter the Fahrenheit number to convert into Kelvin");
                System.out.println("Kelvin=" +fahrenheitToKelvin(sc.nextDouble()));
                break;
            case 3:
                System.out.println("Enter the Kelvin number to convert into Celsius");
                if (num < 0) {
                    System.out.println("Invalid temperature! Kelvin cannot be negative.");
                    return;
                }
                System.out.println("Celsius=" +kelvinToCelsius(sc.nextDouble()));
                System.out.println("Enter the Kelvin number to convert into Fahrenheit");
                System.out.println("Fahrenheit=" +kelvinToFahrenheit(sc.nextDouble()));
                break;
            default:
                System.out.println("Operation End");
                break;
        }
    }
    static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }
    static double celsiusToKelvin(double  celsius) {
        return (celsius + 273.15);
    }
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    static double fahrenheitToKelvin(double fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9 + 273.15);
    }
    static double kelvinToCelsius(double kelvin) {
        return (kelvin - 273.15);
    }
    static double kelvinToFahrenheit(double kelvin) {
        return ((kelvin - 273.15) * 9 / 5 + 32);
    }
}

