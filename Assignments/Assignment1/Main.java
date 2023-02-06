class Person{
//instance variables
    private String firstName;
    private String lastName;

    Person(String a, String b){
        firstName = a;
        lastName = b;
    }
//accessor/mutator methods
    public void setFirstName(String a){
        firstName = a;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(String a){
        lastName = a;
    }
    public String getLastName(){
        return lastName;
    }

    public void displayDetails(){
        System.out.println("First Name: " + firstName);
        System.out.println("Lat Name: " + lastName);
    }
}

class Student extends Person{
    private int studentID;
    private String course;
    private String instructor;

    //accessor/mutator methods
    public void setStudentID(int a){
        studentID = a;
    }
    public int getStudentID(){
        return studentID;
    }
    public void setCourse(String a){
        course = a;
    }
    public String getCourse(){
        return course;
    }
    public void setInstructor(String a){
        instructor = a;
    }
    public String getInstructor(){
        return instructor;
    }

    //Constructor
    Student(String a, String b, int c, String d, String e){
        super(a, b);
        studentID = c;
        course = d;
        instructor = e;
    }

    //Display Method
    public void displayDetails(){
        System.out.println("First Name: " + getFirstName());
        System.out.println("Lat Name: " + getLastName());
        System.out.println("Student ID: " + getStudentID());
        System.out.println("Course: " + getCourse());
        System.out.println("Teacher Name: " + getInstructor());

    }
}

//Child class extending its parent class 
class Teacher extends Person{
    String subjectName;
    int salary;
    Teacher(String a, String b, String c, int d){
        super(a, b);
        subjectName = c;
        salary = d;
    }

    public void displayDetails(){
        System.out.println("First Name: " + getFirstName());
        System.out.println("Lat Name: " + getLastName());
        System.out.println("Subject Name: " + subjectName);
        System.out.println("Salary: " + salary);
    }
}

public class Main{
    public static void main(String[] args) {
    //Obect of Student Class
        Student human1 = new Student("Muaz", "Gulfam", 58, "Computer Science", "Dr. Asif");
        System.out.println("Details of First Student");
        human1.displayDetails();
        Student human2 = new Student("Jhonny", "Decaprio", 69, "Computer Science", "Mr. Saleem");
        System.out.println("\nDetails of Second Student");
        human2.displayDetails();

    //Object of Teacher class
        Teacher human3 = new Teacher("Inzamam", "Malik", "Artificial Intelligence", 100);
        System.out.println("\nDetails of First Teacher");
        human3.displayDetails();
        Teacher human4 = new Teacher("Zeeshan", "Usmani", "Data Science", 10000);
        System.out.println("\nDetails of Second Teacher");
        human4.displayDetails();
    }
}