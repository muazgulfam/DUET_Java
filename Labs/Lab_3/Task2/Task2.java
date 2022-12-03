import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first number \t");
        int fnum = input.nextInt();
        System.out.print("Select any operator of your choice '+', '-', '*', '/' or % \t");
        char Operator = input.next().charAt(0);
        System.out.print("Enter your second number \t");
        int lnum = input.nextInt();

        int result = 0;

        if(Operator == '+' || Operator == '-' || Operator == '*' || Operator == '/' || Operator == '%')  {

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
        }
        else{System.out.println("\nInvalid operator! \nPlease select only '+'  '-'  '*'  '/'  '%' ");}

        System.out.println("\nYour result is: " + result);
       //System.out.println(fnum + Operator + lnum + " = " + result);
    }
}
