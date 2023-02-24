import java.util.Scanner;

class AreaOfTriangle{
    int breadth, height;
    AreaOfTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the Breadth of Triangle ");
        breadth = sc.nextInt();
        System.out.print("Please enter the Height of Triangle ");
        height = sc.nextInt();
    }
    public void area(){
        double Area =0.5 * height * breadth;
        System.out.println("The Area of Triangle is " + Area);
    }
}

public class Index{
    public static void main(String[] args) {
        AreaOfTriangle triangle = new AreaOfTriangle();
        triangle.area(); 
    }
}