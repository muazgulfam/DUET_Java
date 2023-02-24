import java.util.Scanner;

class FahrenheitToCelsius{
    double Fahrenheit, celsius;
    public void TakeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Fahrenheit temperature to convert it in Celsius ");
        Fahrenheit = sc.nextDouble();
    }
    public double Conversion(){
        celsius = (Fahrenheit - 32) * (0.5555);
        System.out.print("Temperature in Celsius is ");
        return celsius;
    }
}

public class Main {
    public static void main(String[] args) {
        FahrenheitToCelsius Temp1 = new FahrenheitToCelsius();
        Temp1.TakeInput();
        System.out.println(Temp1.Conversion());
    }
}
