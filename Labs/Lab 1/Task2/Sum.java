import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number  ");
        int num1 = input.nextInt();
        System.out.print("Enter your second number  ");
        int num2 = input.nextInt();

        if((num1 >= 1 & num1 <= 50000) & (num2 >= 1 & num2 <= 50000)) {
            int sum = num1 + num2;

//Figuring out the of sum
            String str = Integer.toString(sum);
            int length = str.length();
            //System.out.println(length);

            if(length == 6){
                int unit = sum / 100000;
                int div1 = sum % 100000;
                int ten = div1 / 10000;
                int div2 = div1 % 10000;
                int hundred = div2 / 1000;
                int div3 = div2 % 1000;
                int thousand = div3 / 100;
                int div4 = div3 % 100;
                int tenThousand = div4 / 10;
                int div5 = div4 % 10;
                int hundredThousand = div5 / 1;

                System.out.println("Sum is: " + sum);
                System.out.println("The result in vertical order is:");

                System.out.println(hundredThousand);
                System.out.println(tenThousand);
                System.out.println(thousand);
                System.out.println(hundred);
                System.out.println(ten);
                System.out.println(unit);
            }
            else if(length == 5){
                int ten = sum / 10000;
                int div2 = sum % 10000;
                int hundred = div2 / 1000;
                int div3 = div2 % 1000;
                int thousand = div3 / 100;
                int div4 = div3 % 100;
                int tenThousand = div4 / 10;
                int div5 = div4 % 10;
                int hundredThousand = div5 / 1;

                System.out.println("Sum is: " + sum);
                System.out.println("The result in vertical order is:");

                System.out.println(hundredThousand);
                System.out.println(tenThousand);
                System.out.println(thousand);
                System.out.println(hundred);
                System.out.println(ten);
            }
            else if(length == 4){
                int hundred = sum / 1000;
                int div3 = sum % 1000;
                int thousand = div3 / 100;
                int div4 = div3 % 100;
                int tenThousand = div4 / 10;
                int div5 = div4 % 10;
                int hundredThousand = div5 / 1;

                System.out.println("Sum is: " + sum);
                System.out.println("The result in vertical order is:");

                System.out.println(hundredThousand);
                System.out.println(tenThousand);
                System.out.println(thousand);
                System.out.println(hundred);
            }
            else if(length == 3){
                int thousand = sum / 100;
                int div4 = sum % 100;
                int tenThousand = div4 / 10;
                int div5 = div4 % 10;
                int hundredThousand = div5 / 1;

                System.out.println("Sum is: " + sum);
                System.out.println("The result in vertical order is:");

                System.out.println(hundredThousand);
                System.out.println(tenThousand);
                System.out.println(thousand);
            }
            else if(length == 2){
                int tenThousand = sum / 10;
                int div5 = sum % 10;
                int hundredThousand = div5 / 1;

                System.out.println("Sum is: " + sum);
                System.out.println("The result in vertical order is:");

                System.out.println(hundredThousand);
                System.out.println(tenThousand);
            }
            else if(length == 1){
                //int hundredThousand = sum / 1;

                System.out.println("Sum is: " + sum);
                System.out.println("The result in vertical order is:");

                //System.out.println(hundredThousand);
                System.out.println(sum);
            }

        }
        else {System.out.println("Invalid number! Please enter both the numbers in between 1 and 50000");}

        System.out.println("*----------------------------------------------------------------------*");
        System.out.println("MUAZ BIN GULFAM");
        System.out.println("BSCS-58");
       
    }
}
