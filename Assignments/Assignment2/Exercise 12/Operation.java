import java.util.Scanner;

class Math{
    double a, b;
    char operator;
    Math(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first Operand  ");
        a = sc.nextDouble();
        System.out.print("Enter the Operation you want to Perform  ");
        operator = sc.next().charAt(0);
        System.out.print("Enter your second operand  ");
        b = sc.nextDouble();
    }
    public double operate(){
        if(operator == '+'){
            return a + b;
        }
        else if(operator == '-'){
            return a - b;
        }
        else if(operator == '*'){
            return a * b;
        }
        else if(operator == '/'){
            return a / b;
        }
        return 0;


    }
}
public class Operation {
    public static void main(String[] args) {
        Math problem = new Math();
        System.out.println("The result is " + problem.operate());
    }
}
