import java.util.Random;
class spam{
    spam(){
        Random numGenerator = new Random();
        int randomNum = numGenerator.nextInt(101);
        System.out.println(randomNum);
    }
}

public class Main {
    public static void main(String[] args) {
        spam s = new spam();
        
    }
}
