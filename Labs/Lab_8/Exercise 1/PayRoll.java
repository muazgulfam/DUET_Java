import javax.naming.spi.DirObjectFactory;

class Employee{
    private String FirstName, LastName;
    private long CNIC;

    public void SetFirstName(String a){
        this.FirstName = a;
    }
    public String GetFirstName(){
        return FirstName;
    }
    public void SetLastName(String b){
        this.LastName = b;
    }
    public String GetLastName(){
        return LastName;
    }
    public void SetCNIC(long c){
        this.CNIC = c;
    }
    public Long GetCNIC(){
        return CNIC;
    }
    
    public void DesplayRecord(){
        System.out.println("Name: " + GetFirstName() + " " + GetLastName());
        System.out.println("CNIC: " + GetCNIC());
    }

    public double earning(){
        return 0.00;
    }
}

class SalariedEmployee extends Employee{
    private double WeeklySalary = 0.00;

    public void SetWeeklySalary(double a){
        this.WeeklySalary = a;
    }
    public double getWeeklySalary(){
        return WeeklySalary;
    }

    public double earning(){
        return getWeeklySalary();
    }
}

class HourlyEmployee extends Employee{
    private double wage = 0, hours = 0;

    public void SetWage(double a){
        this.wage = a;
    }
    public double GetWage(){
        return wage;
    }
    public void SetHours(double b){
        this.hours = b;
    }
    public double GetHours(){
        return hours;
    }

    @Override
    public double earning() {

        if(hours <= 40){
            return wage * hours;
        }
        else{return 40 * wage + (hours - 40) * wage * 1.5;}
    }
}

class CommissionEmployee extends Employee{
    private double grossSales, comissionRate;

    public void setgrossSales(double a){
        this.grossSales = a;
    }
    public double getgrossSales(){
        return grossSales;
    }
    public void setcomissionRate(double b){
        this.comissionRate = b;
    }
    public double getcomissionRate(){
        return comissionRate;
    }

    @Override
    public double earning() {
        super.earning();
        return grossSales * comissionRate;
    }
}

class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    public void setbaseSalary(double a){
        this.baseSalary = a;
    }
    public double getbaseSalary(){
        return baseSalary;
    }

    @Override
    public double earning() {
        return baseSalary + super.earning();
    }
}

public class PayRoll {
    public static void main(String[] args) {
        Employee firstEmployee = new SalariedEmployee();
        firstEmployee.SetFirstName("MUAZ");
        firstEmployee.SetLastName("Gulfam");
        firstEmployee.SetCNIC(4240125);
        firstEmployee.DesplayRecord();
        //firstEmployee.SetWeeklySalary(1000.00);
         System.out.println(firstEmployee.earning());
    }
}
