//square root calculator

import java.util.Scanner;

public class Riza {
    public static void main(String[] args) {
        System.out.println("eisagete enan arithmo: ");
        Scanner myObject = new Scanner(System.in);
        String arithmos = myObject.nextLine();
        Double x = Double.parseDouble(arithmos);
        if(x>=0) {
            double riza = Math.sqrt(x);
            System.out.println(riza);
        }else{
            System.out.println("den orizetai riza arnitikou arithmou");
        }

    }
}
