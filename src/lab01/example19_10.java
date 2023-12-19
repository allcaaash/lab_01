package lab01;

import java.util.Scanner;

public class example19_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a first number:");
        int firstNum = in.nextInt();
        System.out.println("Enter a second number:");
        int secondNum = in.nextInt();

        System.out.printf("%s + %s = %s\n", firstNum, secondNum, firstNum + secondNum);
        System.out.printf("%s - %s = %s\n", firstNum, secondNum, firstNum - secondNum);

        in.close();
    }
}
