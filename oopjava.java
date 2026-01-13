import java.util.Scanner;

class Employee {
    
    private String name;
    
    public Employee(String name) {
   
    this.name = name;
    
}

public String getName() {
    return name;

 }
}

class FullTimeEmployee extends Employee {
    
    private double monthlySalary;
    
    public FullTimeEmployee(String name, double monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
}
    public double monthlySalary(){
        return monthlySalary;
    }

}

class ParttimeEmployee extends Employee {
    private double ratePerHour;
    private int hoursWorked;
    
    public ParttimeEmployee(String name, double ratePerHour, int hoursWorked){
        super(name);
        this.ratePerHour = ratePerHour;
        this.hoursWorked = hoursWorked;
    }
     public double ratePerHour(){
         return ratePerHour;
     }   
     public int  hoursWorked(){
         return hoursWorked;
         
     }
     
    }
    
    public class RunEmployee {
        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            
            System.out.println("Press F for Full Time or P for Part Time: ");
            String employeeType = scanner.nextLine().toUpperCase();
            
            Employee employee;
            
            if (employeeType.equals("P")) {
                System.out.println("Enter rate per hour and no. of hours worked seperated by space:");
                System.out.println("Sample: 107.50 13");
                double ratePerHour = scanner.nextDouble();
                int hoursWorked = scanner.nextInt();
                employee = new ParttimeEmployee(name, ratePerHour, hoursWorked);
                
                
                System.out.println("Name: " + name);
                System.out.println("Wage: " + ratePerHour * hoursWorked);
                
            } else if (employeeType.equals("F")) {
                System.out.print("Enter Monthly Salary: ");
                double monthlySalary = scanner.nextDouble();
                
                employee = new FullTimeEmployee(name, monthlySalary);
                
                  
                System.out.println("Name: " + name);
                System.out.println("Wage: " + monthlySalary);
                
                
                
            }
        }
    }
    

