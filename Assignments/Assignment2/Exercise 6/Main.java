class GradeCalculation{
    float percentage;
    double GPA;
    String Grade;
    GradeCalculation(Float a){
        percentage = a;
    }
    double GradePoint(){
        if(percentage >= 85){
            GPA = 4.0;
        }
        else if(percentage >= 80){
            GPA = 3.7;
        }
        else if(percentage >= 75){
            GPA = 3.3;
        }
        else if(percentage >= 70){
            GPA = 3.0;
        }
        else if(percentage >= 65){
            GPA = 2.7;
        }
        else if(percentage >= 61){
            GPA = 2.3;
        }
        else if(percentage >= 58){
            GPA = 2.0;
        }
        else if(percentage >= 55){
            GPA = 1.7;
        }
        else if(percentage >= 50){
            GPA = 1.0;
        }
        else{
            GPA = 0.0;
        }
        return GPA;
    }
    String Grade(){
        if(GPA == 4.0){
            Grade = "A";
        }
        else if(GPA == 3.7){
            Grade = "A-";
        }
        else if(GPA == 3.3){
            Grade = "B+";
        }
        else if(GPA == 3.0){
            Grade = "B";
        }
        else if(GPA == 2.7){
            Grade = "B-";
        }
        else if(GPA == 2.3){
            Grade = "C+";
        }
        else if(GPA == 2.0){
            Grade = "C";
        }
        else if(GPA == 1.7){
            Grade = "C-";
        }
        else if(GPA == 1.0){
            Grade = "D";
        }
        else{Grade = "F";}
        return Grade;
    }
}

public class Main {
    public static void main(String[] args) {
        GradeCalculation Amir = new GradeCalculation(56.455f);
        System.out.println("The Grade Point Average is " + Amir.GradePoint());
        System.out.println("The Grade awarded is " + Amir.Grade());
    }
}
