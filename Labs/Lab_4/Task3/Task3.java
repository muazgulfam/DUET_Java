import java.lang.Math;
public class Task3 {
    public static void main(String[] args) {
        int a[] = new int[10];
        for(int i = 0; i < 10; i++){
            a[i] = (int)(Math.random()*100);
        }
        System.out.println("Values are");

        for(int i = 0; i < 10; i++){
            System.out.println(a[i]);
        }
    }
}
