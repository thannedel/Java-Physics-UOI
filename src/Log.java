//log(A^n)=n*logA

import java.util.Scanner;

public class Log {
    public static void main(String[] args) {
        System.out.println("Give the numbers A and n: ");
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double n = sc.nextDouble();
        sc.close();

        double left_side = Math.log(Math.pow(A,n));
        double right_side = n*Math.log(A);

        System.out.println("left_side " +left_side);
        System.out.println("right_side " + right_side);
    }
}
