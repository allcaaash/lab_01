package lab01;

import java.util.Scanner;

public class example19_06 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String lastName = "";
        String firstName = "";
        String secondName = "";

        System.out.print("Enter your last name: ");
        lastName = scanner.next();

        System.out.print("Enter your first name: ");
        firstName = scanner.next();

        System.out.print("Enter your second name: ");
        secondName = scanner.next();

        System.out.format("Hello %s %s %s", lastName, firstName, secondName);
    }
}
