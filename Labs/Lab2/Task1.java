import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer:  ");
        int num1 = input.nextInt();

        System.out.println("\nSelect an Operator given below");
        System.out.println("\nArithmetic Operator: '+'   '-'   '*'   '/'   '%'   '+='   '-='   '*='   '/='   '%='   '++'   '--'");
        System.out.println("Relational Operator: '=='  '!='  '>'  '<'  '>='  '<='");
        System.out.print("Bitwise and Logical Operator: '~'  '&'  '|'  '^'  '>>'  '<<'  '>>>'  '&='  '|='  '^='  '>>='  '<<='  '>>>='       ");
        //char operator = input.next().charAt(0);
        String operators = input.next();

//Converting character into String
        //String operators = String.valueOf(operator);
        //System.out.println(((Object)operators).getClass().getSimpleName());

//Figuring the length
        //System.out.println("The length is: " + operators.length());

//Arithmetic Operators
        if(operators.equals("+")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            int sum = num1 + num2;
            System.out.println( "Your Sum is " + sum);
        }

        if(operators.equals("-")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            int sub = num1 - num2;
            System.out.println( "Your answer is: " + sub);
        }

        else if(operators.equals("*")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            int product = num1 * num2;
            System.out.println( "Your product is: " + product);
        }

        else if(operators.equals("/")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            int div = num1 / num2;
            System.out.println( "Your answer is: " + div);
        }

        else if(operators.equals("%")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            int remainder = num1 % num2;
            System.out.println( "Your answer is: " + remainder);
        }

        else if(operators.equals("++")){ 
            System.out.println(  "Your Answer is: " + ++num1);
        }

        else if(operators.equals("--")){
            System.out.println(  "Your Answer is: " + --num1);
        }

        else if(operators.equals("+=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            int result = num1 += num2;
            System.out.println( "Your answer is: " + result);
        }

        else if(operators.equals("-=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            int result = num1 -= num2;
            System.out.println( "Your answer is: " + result);
        }

        else if(operators.equals("*=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            int result = num1 *= num2;
            System.out.println( "Your answer is: " + result);
        }

        else if(operators.equals("/=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            int result = num1 /= num2;
            System.out.println( "Your answer is: " + result);
        }

        else if(operators.equals("%=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            int result = num1 %= num2;
            System.out.println( "Your answer is: " + result);
        }

//Relational Operator
        if(operators.equals("==")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            if(num1 == num2){
                System.out.println("Your answer is: True ");
            }
            else {System.out.println( "Your answer is: False");}
        }

        else if(operators.equals("!=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            if(num1 != num2){
                System.out.println("Your answer is: True ");
            }
            else {System.out.println( "Your answer is: False");}
        }

        else if(operators.equals(">")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            if(num1 > num2){
                System.out.println("Your answer is: True ");
            }
            else {System.out.println( "Your answer is: False");}
        }

        else if(operators.equals("<")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            if(num1 < num2){
                System.out.println("Your answer is: True ");
            }
            else {System.out.println( "Your answer is: False");}
        }

        else if(operators.equals(">=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            if(num1 >= num2){
                System.out.println("Your answer is: True ");
            }
            else {System.out.println( "Your answer is: False");}
        }

        else if(operators.equals("<=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            if(num1 <= num2){
                System.out.println("Your answer is: True ");
            }
            else {System.out.println( "Your answer is: False");}
        }

//Bitwise Operator
        else if(operators.equals("~")){
                System.out.println(~num1);  
        }

        else if(operators.equals("&")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            System.out.println(num1 & num2);
        }

        else if(operators.equals("|")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            System.out.println(num1 | num2);
        }

        else if(operators.equals("^")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            System.out.println(num1 ^ num2);
        }

        else if(operators.equals(">>")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            System.out.println(num1 >> num2);
        }

        else if(operators.equals("<<")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            System.out.println(num1 << num2);
        }

        else if(operators.equals(">>>")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            System.out.println(num1 >>> num2);
        }

        else if(operators.equals("&=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            System.out.println(num1 &= num2);
        }

        else if(operators.equals("|=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            System.out.println(num1 |= num2);
        }

        else if(operators.equals("^=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            System.out.println(num1 ^= num2);
        }

        else if(operators.equals(">>=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            System.out.println(num1 >>= num2);
        }

        else if(operators.equals("<<=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            System.out.println(num1 <<= num2);
        }

        else if(operators.equals(">>>=")){
            System.out.print("Enter your second integer:  ");
            int num2 = input.nextInt();
            System.out.println(num1 >>>= num2);
        }

    }
}