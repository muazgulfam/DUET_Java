import java.util.Scanner;

public class Main {
    public static double ClalculateBMI(double weight, double height){
        double BMI = (weight * 703) / height;
        System.out.print("BMI is: ");
        return  BMI;
    }
    public static void findStatus(double BMI){
        System.out.print("THe result is: ");
        if(BMI < 18.5){
            System.out.println("Under Wieght");
        }
        else if( BMI <= 24.9){
            System.out.println("Normal");
        }
        else if(BMI <= 29.9){
            System.out.println("OverWeight");
        }
        else if(BMI >= 30){
            System.out.println("Obese");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Weight in pounds  ");
        double a = sc.nextDouble();
        System.out.print("Enter the height in inches  ");
        double b = sc.nextDouble(); 

        double c = ClalculateBMI(a, b);
        System.out.println(c);
        findStatus(c);
    }
}
