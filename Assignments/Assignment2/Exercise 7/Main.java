import java.util.Scanner;

class AreaOfCircle{
    int radius;
    AreaOfCircle(){
        System.out.print("Please enter the Radius of Circle ");
        Scanner sc = new Scanner(System.in);
        radius = sc.nextInt();
    }
    public void area(){
        double Area = 2 * 3.1415926 * radius;
        System.out.println("The Area of circle is " + Area);
    }
}

public class Main{
    public static void main(String[] args) {
        AreaOfCircle Circle = new AreaOfCircle();
        Circle.area(); 
    }
}