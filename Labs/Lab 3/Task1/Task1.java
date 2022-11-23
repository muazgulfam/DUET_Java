import java.util.Scanner;
public class Task1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your First name");
        String fname = input.next();
        System.out.print("Enter your last name");
        String lname = input.next();
        System.out.print("Enter your age");
        int age = input.nextInt();
        System.out.print("Enter your salary");
        int salary = input.nextInt();

        System.out.println("First name is: " + fname);
        System.out.println("Last name is: " + lname);
        System.out.println("Age is: " + age);
        System.out.println("Salary is: " + salary);
    }
        
        
    }
