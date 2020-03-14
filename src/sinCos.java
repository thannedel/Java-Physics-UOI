import java.util.Scanner;

public class sinCos {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Dose ti gonia A: ");
        String goniaA = myObj.nextLine();
        double A = Double.parseDouble(goniaA);
        A *=Math.PI/180.;

        System.out.println("Dose ti gonia B: ");
        String goniaB = myObj.nextLine();
        double B = Double.parseDouble(goniaB);
        B *=Math.PI/180;

        double rightSide = Math.sin(A+B);
        double leftSide = Math.sin(A)*Math.cos(B) + Math.cos(A)*Math.sin(B);
        System.out.println("sin(A+B) = " + leftSide);
        System.out.println("sin(A)cos(B) + cos(A)sin(B) = " + rightSide);
    }
}
