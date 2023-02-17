import java.util.Random;
import java.util.Scanner;

class GuessTheNumber{
    public int userInput;
    public int randomNumber;
    public int noOfGuesses = 0;
    public int guessesLeft = 5;

    GuessTheNumber(){
        Random numGenerator = new Random();
        randomNumber = numGenerator.nextInt(51);
        //System.out.println("The number is " + randomNumber);
    }

    void takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess the mysterious number  ");
        userInput = sc.nextInt();
    }

    Boolean isNumCorrect(){
        guessesLeft--;
        noOfGuesses++;
        if(userInput == randomNumber){
            System.out.println("Congrats!! You guessed it in " + noOfGuesses + " guesses");
            return true;
        }
        else if(userInput > randomNumber){
            System.out.println("The number you guessed is bigger than the mysterious number");
        }
        else if(userInput < randomNumber){
            System.out.println("The number you guessed is smaller than the mysterious number");
        }
        System.out.println("You have " + guessesLeft + " guesses left\n");
        return false;
    }

    void gameLost(){
        if(noOfGuesses == 5){
            System.out.println("oops!! you couldn't guess the mystry number");
            System.out.println("The mysterious number was " + randomNumber);
        }
    }
}


public class Game{
    public static void main(String[] args) {
        System.out.println("You have 5 attempts to guess the mysterious number\n(Hint: The number is between 0 to 50)\n");
        GuessTheNumber Number = new GuessTheNumber();
       Boolean a = false;
       for(int i = 0; i < 5; i++){
            Number.takeInput();
            a = Number.isNumCorrect();
            if(a == true){
                break;
            }
            else{Number.gameLost();}
       }
        
    }
}