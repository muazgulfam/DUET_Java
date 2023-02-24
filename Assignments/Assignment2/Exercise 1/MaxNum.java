class Numbers{
    int num1, num2, num3, max;
    Numbers(int a, int b, int c){
        this.num1 = a;
        this.num2 = b;
        this.num3 = c;
    }
    int maximum(){
        if(num1 > num2){
            if(num1 > num3){
                max = num1;
            }
            else{max = num3;}
        }
        else{
            if(num2 > num3){
                max = num2;
            }
            else{max = num3;}
        }
        return max;
    }
}

public class MaxNum{
    public static void main(String[] args) {
        Numbers largestNumber = new Numbers(12,10,5);
        System.out.println("The largest number is " + largestNumber.maximum());
    }
}