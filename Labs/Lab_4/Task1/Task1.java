public class Task1 {
    public static void main(String[] args) {
        System.out.println("The Fabonacci series is:");
        int num1 = 0, num2 = 1;
        System.out.print("0  1");
        for(int i = 1; i <= 19; i++){
            int newNum = num1 + num2;
            System.out.print("  " + newNum);
            num1 = num2;
            num2 = newNum;
        }

        System.out.println("*-----------------------------------------------------------------*");
        System.out.println("MUAZ BIN GULFAM");
        System.out.println("BSCS-58");
        System.out.println("*-----------------------------------------------------------------*");
    }
}
