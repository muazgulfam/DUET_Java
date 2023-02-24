import java.util.Scanner;

class Equation{
    int a, b;
    double c;
    Equation(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of 'a'");
       a = sc.nextInt();
       System.out.println("Enter the value of 'b'");
       b = sc.nextInt();
    }
    public double Eq(){
        c = ((a * a) + (b * b)) / (a * b);
        System.out.print("The value of 'C' is ");
        return c;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println("c = (a^2 + b^2) / ab \n\nTo solve this equation....");
        Equation myEq = new Equation();
        System.out.println(myEq.Eq());
    }
}
