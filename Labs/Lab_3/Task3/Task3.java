import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks in Basic Electeronics\t");
        int beMark = input.nextInt();

        System.out.print("Enter your marks in Pro Practice in Computing\t");
        int ppcMark = input.nextInt();

        System.out.print("Enter your marks in Technical Writing\t");
        int tcMark = input.nextInt();

        System.out.print("Enter your marks in Pakistan Studies\t");
        int pstMark = input.nextInt();

        System.out.print("Enter your marks in Object Oriented Programming\t");
        int oopMark = input.nextInt();
        
        if(beMark <= 100 && ppcMark <= 100 && tcMark <= 100 && pstMark <= 100 && oopMark <= 100){
            int obtainedMarks = beMark + ppcMark + tcMark + pstMark + oopMark;
            Double totalMarks = 500.0;
            Double percentage = (double) ((obtainedMarks * 100) / totalMarks);

            String grade = "0";
            if(percentage >= 85){
                grade = "A+";
            }
            else if(percentage >= 80){
                grade = "A";
            }
            else if(percentage >= 75){
                grade = "B+";
            }
            else if(percentage >= 70){
                grade = "B";
            }
            else if(percentage >= 65){
                grade = "C+";
            }
            else if(percentage < 60){
                grade = "Fail";
            }

            System.out.println("MarkSheet\n\n");
            System.out.println("Basic Electronics              " + beMark );
            System.out.println("Pro. Practice in Computing     " + ppcMark);
            System.out.println("Technical Writing              " + tcMark);
            System.out.println("Pakistan Studies               " + pstMark);
            System.out.println("Object Oriented Programming    " + oopMark);
            System.out.println("Total marks for 5 subject is   500");
            System.out.println("Obtained Marks                 " + obtainedMarks);
            System.out.println("Percentage                     " + percentage);
            System.out.println("Grade                          " + grade); 
        }
        else{System.out.println("\nInvalid marks \nsPlease enter correct marks! Total marks per subject is 100");}
    }
}
