import java.util.Scanner;

public class Main {

    public static int num1, num2, divisor = 1000;
    public static int LastDigit(int a){
        
        for(int i = 1; divisor >= 1; i++){
            num1 = a / divisor;
            a = a % divisor;
            divisor /= 10;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 4 digit number  ");
        int a = sc.nextInt();

        System.out.println(LastDigit(a));
    }
}
