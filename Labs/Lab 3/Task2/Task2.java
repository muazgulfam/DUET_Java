import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number ");
        int fnum = input.nextInt();
        System.out.print("Enter your second number ");
        int lnum = input.nextInt();
        System.out.print("Select any operator of your choice '+', '-', '*', '/' or %  ");
        char Operator = input.next().charAt(0);

        int result = 0;

        if(Operator ==  '+'){
             result = fnum + lnum;
        }
        else if(Operator ==  '-'){
             result = fnum - lnum;
        }
        else if(Operator ==  '*'){
            result = fnum * lnum;
       }
       else if(Operator ==  '/'){
            result = fnum / lnum;
       }
       else if(Operator ==  '%'){
            result = fnum % lnum;
       }
       System.out.println("Your result is: " + result);
       //System.out.println(fnum + Operator + lnum + " = " + result);
    }
}
