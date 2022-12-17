import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of days to classify it in months and days\t");
        int nodays = input.nextInt();

        System.out.println("*-----------------------------------------------------------------*");
        System.out.println("MUAZ BIN GULFAM");
        System.out.println("BSCS-58");
        System.out.println("*-----------------------------------------------------------------*");

        int months = 0, days = 0;
        do{
            months = nodays / 30;
            days = nodays % 30;
            System.out.println(nodays + " days = " + months + " Months and " + days + " days");
        }
        while(months == 1);
    }
}
