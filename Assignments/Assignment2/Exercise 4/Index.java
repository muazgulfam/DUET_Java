class NumType{
    int num;
    NumType(int num){
        this.num = num;
    }
    void Check(){
        if(num > 0){
            System.out.println("The number is Positive");
        }
        else if(num < 0){
            System.out.println("The number is Negative");
        }
        else{System.out.println("The number is Zero");}
    }
}

public class Index {
    public static void main(String[] args) {
        NumType numbers = new NumType(4);
        numbers.Check();
    }
}
