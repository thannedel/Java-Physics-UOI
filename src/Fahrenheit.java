import java.util.Scanner;

public class Fahrenheit {
    public static void main(String[] args) {
        System.out.println("Give the temperature in Celsius:wqi degrees: ");
        Scanner myTemp = new Scanner(System.in);
        String T = myTemp.nextLine();
        double temperature = Double.parseDouble(T);

        double TempInFahrenheit = 1.8*temperature + 32.;
        System.out.println("The temperature in the Fahrenheit scale is: " + TempInFahrenheit + " °F");
    }
}
