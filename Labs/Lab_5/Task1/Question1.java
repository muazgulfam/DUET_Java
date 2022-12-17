import java.lang.Math;
public class Question1 {
    public static void main(String[] args) {
        float studentsMarks[] = new float [50];
        int i, j, k, l, m;
        float sum = 0;
        double average;

//Entering Random marks in array
        for(i = 0; i < studentsMarks.length; i++){
            studentsMarks[i] = (float) Math.random() * 100;
        }

//Printing The marks in 2 decimal places
        for(j = 0; j < studentsMarks.length; j++){
            System.out.printf("%.2f", studentsMarks[j]);
            System.out.print(" ");
        }

//Average
        for(k = 0; k < studentsMarks.length; k++){
            sum += studentsMarks[k];
        }
        average = sum / studentsMarks.length;
        System.out.print("\n\nThe average mark is: ");
        System.out.printf("%.2f", average);

//Maximum Marks
        float max = studentsMarks[0];
        for(l = 0; l < studentsMarks.length; l++){
            if(studentsMarks[l] > max){
                max = studentsMarks[l];
            }
        }
        System.out.print("\nHighest mark is ");
        System.out.printf("%.2f", max);
        //System.out.print("The highest marks is ");
        //System.out.printf("%.2", max);

//Minimum Marks
        float min = studentsMarks[0];
        for(l = 0; l < studentsMarks.length; l++){
            if(studentsMarks[l] < min){
            min = studentsMarks[l];
            }
        }
        System.out.print("\nLowest mark is ");
        System.out.printf("%.2f", min);

    }
}
