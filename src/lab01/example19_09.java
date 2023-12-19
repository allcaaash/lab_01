package lab01;

import java.util.Scanner;

public class example19_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int userNum = in.nextInt();
        int firstNum = --userNum;
        int secondNum = ++userNum;
        int thirdNum = ++userNum;
        int fourthNum = (int)Math.pow(firstNum + secondNum + thirdNum, 2);
        System.out.printf("%s, %s, %s, %s", firstNum, secondNum, thirdNum, fourthNum);

        in.close();
    }
}
