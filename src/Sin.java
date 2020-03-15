//sin(3A)=3sinA-4sin^3A


import java.util.Scanner;

public class Sin {
    public static void main(String[] args) {
        System.out.println("Give the angle A: ");
        Scanner myObj = new Scanner(System.in);
        String goniaA = myObj.nextLine();
        double A = Double.parseDouble(goniaA);
        A *= Math.PI/180.;


        double leftSide = Math.sin(3.*A);
        double rightSide = (3.*Math.sin(A)-4.*Math.pow(Math.sin(A),3));
        System.out.println(leftSide);
        System.out.println(rightSide);
    }
}
