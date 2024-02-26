import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Initialize Scanner object for input
        double celsius, fahrenheit; // Declare variables to store Celsius and Fahrenheit temperatures

        do {
            System.out.println("Enter the temperature in Celsius:"); // Prompt the user to enter temperature in Celsius
            // Loop until a valid double input is received
            while (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a valid temperature in Celsius:");
                scanner.next(); // Discard non-double input
            }
            celsius = scanner.nextDouble(); // Read the input as a double

            if (celsius < -273.15) { // Check if input is below absolute zero in Celsius
                System.out.println("Celsius temperature cannot be below absolute zero (-273.15°C).");
            }
        } while (celsius < -273.15); // Repeat until valid Celsius input is received

        fahrenheit = (celsius * 9 / 5) + 32; // Convert Celsius to Fahrenheit
        System.out.println("Temperature in Fahrenheit: " + fahrenheit); // Print the converted temperature
    }
}
