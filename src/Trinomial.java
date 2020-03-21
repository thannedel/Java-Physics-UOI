import java.util.Scanner;

// trinomial ax^2 + bx + c = 0
public class Trinomial {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Give a: ");
        String arithmosA = myObj.nextLine();
        double a = Double.parseDouble(arithmosA);
        System.out.println("Give b: ");
        String arithmosB = myObj.nextLine();
        double b = Double.parseDouble(arithmosB);
        System.out.println("Give c: ");
        String arithmosC = myObj.nextLine();
        double c = Double.parseDouble(arithmosC);
        double x1,x2;

        double D = Math.pow(b,2.) - 4.*a*c;
        if(D == 0  ) {
        x1 = -b/2.*a;
            System.out.println("H lisi ths exisosis: " +a+"*x^2 + " +b+ "*x +" + c + " einai: x1=x2= " +x1);
        }
        else if (D>0){
            x1 = (-b + Math.sqrt(D))/2.*a;
            x2 = (-b - Math.sqrt(D))/2.*a;
            System.out.println("H lisi ths exisosis: " +a+"*x^2 + " +b+ "*x + " + c + " einai: x1= "+x1+ " kai x2= " +x2);
        }
        if (D < 0) {
            D = Math.abs(D);
            x1 = (-b + Math.sqrt(D))/2.*a;
            x2 = (-b - Math.sqrt(D))/2.*a;
            System.out.println("H migadiki lisi ths exisosis: " +a+"*x^2 + " +b+ "*x + " + c + " einai: x1= "+x1+"i kai x2= " +x2+"i");
        }
    }
}
