import java.util.Scanner;

public class BirhYear {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Give your name: ");
        String name = myObj.nextLine();
        System.out.println("Give your age: ");
        String age = myObj.nextLine();
        int yourAge = Integer.parseInt(age);
        System.out.println("Give the current Year: ");
        String year = myObj.nextLine();
        int currentYear = Integer.parseInt(year);

        int yearOfBirth = currentYear - yourAge;
        System.out.println("Hello "+ name +", the year of your birth is: " + yearOfBirth);
    }
}
