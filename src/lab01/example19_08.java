package lab01;

import java.util.Scanner;

public class example19_08 {
    public static String[] _months = new String[] {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day = "";
        String month = "";
        int date = 0;

        System.out.print("Enter the current day of the week (example: Thursday): ");
        day = scanner.next();

        boolean isCorrectDay = check(day, 0);
        while (!isCorrectDay){
            System.out.println("Wrong day of the week. Try again: ");
            day = scanner.next();
            isCorrectDay = check(day, 0);
        }

        System.out.print("Enter the name of the current month (example: November): ");
        month = scanner.next();

        boolean isCorrectMonth = check(month, 1);
        while (!isCorrectMonth){
            System.out.println("Wrong name of the current month. Try again: ");
            month = scanner.next();
            isCorrectMonth = check(month, 1);
        }

        System.out.print("Enter the date of the current month (example: 16): ");
        date = scanner.nextInt();

        boolean isCorrectDate = check(date, month);
        while (!isCorrectDate){
            System.out.println("Wrong date of the current month. Try again: ");
            date = scanner.nextInt();
            isCorrectDate = check(date, month);
        }

        System.out.format("You have entered: %s-%s-%s", day, month, date);
        System.out.print("\n");
    }

    public static boolean check(String line, int value){

        line = line.toUpperCase();

        switch (value){
            case 0:

                String[] daysOfWeek = new String[] {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

                for (int i = 0; i < daysOfWeek.length; i++){
                    if (daysOfWeek[i].equals(line)){
                        return true;
                    }
                }

                break;
            case 1:

                for (int i = 0; i < _months.length; i++){
                    if (_months[i].equals(line)){
                        return true;
                    }
                }

                break;
        }

        return false;
    }

    public static boolean check(int date, String month){

        if (date > 0 && date <= 31){
            if ((date == 31) && (month.equals(_months[3]) || month.equals(_months[5]) || month.equals(_months[8]) || month.equals(_months[10]))){
                return false;
            }
            else if ((date > 29) && (month.equals(_months[1]))){
                return false;
            }
            else{
                return true;
            }
        }
        else{
            return false;
        }
    }
}
