import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String to check if the word is a Palindrome   ");
        String orignalword = input.nextLine();
        StringBuffer word_tobe_Checked = new StringBuffer(); 
        int i = 1;
        for(i = (orignalword.length()) - 1; i <= 0; i--){
            word_tobe_Checked.append(orignalword.charAt(i));
        }
        System.out.print(word_tobe_Checked);

        /*for(i = 0; i < orignalword.length(); i++){
            word_tobe_Checked.append(orignalword.charAt(i));
        }
        System.out.print(word_tobe_Checked);*/
    }
}
