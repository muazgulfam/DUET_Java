import java.lang.Math;

public class Practice1 {
    public static void main(String[] args) {
    int a[] = new int[10];
        for(int i = 0; i < 10; i++){
            a[i] = (int)(Math.random()*100);
        }
        System.out.println("Values are");

        for(int b = 0; b < 10; b++){
            System.out.println(a[b]);
        }
    }
}
