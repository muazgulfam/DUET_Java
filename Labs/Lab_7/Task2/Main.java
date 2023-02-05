class Calculate{
    //First Method
    public int add(int x, int y){
        int a = x + y;
        return a;
    }
    public double add(double x, double y){
        double a = x + y;
        return a;
    }
    public byte add(byte x, byte y){
        byte a = (byte) (x + y);
        return a;
    }

    //Second Method
    public int subtract(int x, int y){
        int a = x - y;
        return a;
    }
    public double subtract(double x, double y){
        double a = x - y;
        return a;
    }
    public byte subtract(byte x, byte y){
        byte a = (byte) (x - y);
        return a;
    }
}

public class Main {
    public static void main(String[] args) {
    //Created an object
       Calculate calculation1 = new Calculate();
       //For int
       int a = calculation1.add(2, 4);
       //For double
       double b = calculation1.add(5.225, 3.0258);
       //For double with 2nd method
       double c = calculation1.subtract(200.22596, 48.2217);
       //For Bit with 2nd method
       byte d = (byte) calculation1.subtract(1, 1);

       //Desplaying Values
       System.out.println("The value of a is " + a);
       System.out.println("The value of b is " + b);
       System.out.println("The value of c is " + c);
       System.out.println("The value of d is " + d);
    }
}
