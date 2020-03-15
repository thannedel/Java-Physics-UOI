// shot projectile, no Friction (t=2v0*sin(A)/g  R=v0cos(A)t)
//A=30°,40°,45°,50°,60° v0=100m/sec
//t=; range=;

import java.util.Scanner;

public class Projectile {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Give the Angle: ");
        String goniaA = myObj.nextLine();
        double A = Double.parseDouble(goniaA);
        A *= Math.PI/180.;
        double v0 = 100.;
double g=9.81;
        double t;
        double R;
        t = 2*v0*Math.sin(A)/g;
        R = v0*Math.cos(A)/t;
        System.out.println("time= " + t + " s");
        System.out.println("range= " + R + " m");
    }
}
