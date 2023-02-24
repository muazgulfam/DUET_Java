class Numbers{
    int num1, num2, num3, min;
    Numbers(int a, int b, int c){
        this.num1 = a;
        this.num2 = b;
        this.num3 = c;
    }
    int minimum(){
        if(num1 < num2){
            if(num1 < num3){
                min = num1;
            }
            else{min = num3;}
        }
        else{
            if(num2 < num3){
                min = num2;
            }
            else{min = num3;}
        }
        return min;
    }
}

public class MinNum{
    public static void main(String[] args) {
        Numbers smallestNumber = new Numbers(2,10,15);
        System.out.println("The smallest number is " + smallestNumber.minimum());
    }
}