class EvenOrOdd{
    int num;
    EvenOrOdd(int a){
        this.num = a;
    }
    void Check(){
        if(num % 2 == 0){
            System.out.println("The given number is Even");
        }
        else{System.out.println("The given number is Odd");}
    }
}

public class Main {
    public static void main(String[] args) {
        EvenOrOdd number = new EvenOrOdd(8);
        number.Check();
    }
}
