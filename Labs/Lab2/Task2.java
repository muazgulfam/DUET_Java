import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a decimal number to convert it into Hexadecimal     ");
        int conversion = input.nextInt();
        System.out.print("Your answer in HexaDecimal is: ");
        System.out.println(Integer.toHexString(conversion)); 
    }
}
