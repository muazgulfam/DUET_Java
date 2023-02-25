class IntChar{
    public void meth1(int n, char c){
        System.out.println(n + " " + c);
    }
    public void meth2(char c , int n){
        System.out.println(c + " " + n);
    }
}


public class Main {
    public static void main(String[] args) {
        IntChar Testing = new IntChar();
        Testing.meth1(1, '$');
        Testing.meth2('$', 2);
    }
}
