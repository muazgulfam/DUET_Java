import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your email address   ");
        String email = input.nextLine();

        int i;

//Determining UserName
        System.out.print("Your userName is: "); 
        for(i = 0; i < email.indexOf('@'); i++){
            System.out.print(email.charAt(i));
        }

        System.out.println("");

//Determining Domain
        System.out.print("The Domain is: ");
        for(i = (email.indexOf('@')) + 1; i < email.indexOf('.'); i++ ){
            System.out.print(email.charAt(i));
        }

        System.out.println("");

//Determining Domain
        System.out.print("The Extension is: ");
        for(i = (email.indexOf('.')) + 1; i < email.length(); i++ ){
            System.out.print(email.charAt(i));
        }
    }
}
