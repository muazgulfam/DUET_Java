import java.util.Scanner;

class CheckLeapYear{
    int noOfDays;
    CheckLeapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of days  ");
        noOfDays = sc.nextInt();
    }
    public void Verify(){
        if(noOfDays == 365){
            System.out.println("It is a normal Year");
        }
        else if(noOfDays == 366){
            System.out.println("It is a Leap Year");
        }
        else{System.out.println("Please enter the correct number of days");}
    }
}

public class Main{
    public static void main(String[] args) {
        CheckLeapYear Leap = new CheckLeapYear();
        Leap.Verify();
    }
}