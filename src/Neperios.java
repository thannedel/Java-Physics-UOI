//f(x)=(e^sqrt(2x-10)-4)/ln(x)


import java.util.Scanner;

public class Neperios {
    public static void main(String[] args) {
        System.out.println("Dose to x: ");
        Scanner myObj = new Scanner(System.in);
        String arithmos = myObj.nextLine();
        Double x = Double.parseDouble(arithmos);
        double y = 2. * x - 10.;
        if (y >= 0) {

            double fx = (Math.exp(Math.sqrt(y)) - 4.) / Math.log(x);
            System.out.println(fx);
        } else {
            System.out.println("mi egkyri timh tou x");
        }
    }
}