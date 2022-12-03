import java.util.Scanner;
public class testing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        System.out.println("enter a number");
        int num1 = input.nextInt();
       
        //int a = num & num1;
        //System.out.println(a);
        //int b = num &= num1;
        //System.out.println(b);

//Checking if the number is Integer
        if (num == (int)num){
            System.out.println("Run");
        }
        else{System.out.println("Error");}

        
    }
}
