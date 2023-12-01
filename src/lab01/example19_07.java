package lab01;

import java.util.Scanner;

public class example19_07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";
        int age = 0;

        System.out.print("Enter your name: ");
        name = scanner.next();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.printf("Your name - %s, your age - %s y.o", name, age);
    }
}
