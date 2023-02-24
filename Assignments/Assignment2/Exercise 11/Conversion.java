import java.util.Scanner;

class BinaryConversion{
    long a, x[] = new long[4];
    ;
    public void TakeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number in Giga Byte to covert it in MB, KB, Byte and Bits  ");
        a = sc.nextInt();
    }
    public void GB(){
        for(int i = 0; i < 3; i++){
            x[i] = a * 1024;
            a = x[i];
            if(i == 2){
                x[3] = a * 8;
            }
        }
        
    }
    public void DesplayResult(){
        /*for(int i = 0; i < 4; i++){
            System.out.println(x[i]);
        }*/
        System.out.println(x[0] + " MB");
        System.out.println(x[1] + " KB");
        System.out.println(x[2] + " Bytes");
        System.out.println(x[3] + " Bits");
    }

}

public class Conversion {
    public static void main(String[] args) {
        BinaryConversion GBToBit = new BinaryConversion();
        GBToBit.TakeInput();
        GBToBit.GB();
        GBToBit.DesplayResult();
    }
}
