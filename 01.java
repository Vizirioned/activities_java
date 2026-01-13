import java.util.Scanner;


public class Main{
    
    public static void main(String[]args)   {
        int rate, OT, hours;
        String Name;
        double paybasic, otpay, ptimepay, ratehour, grosspay, ftimepay; 
        char PorF;
        Scanner bes = new Scanner(System.in);
    // name
        System.out.print("Enter employee name: ");
        Name = bes.nextLine();
        //p or f
    System.out.print("Press F for Full Time or P for Part Time: ");
    PorF = bes.next().charAt(0);
    
    switch(PorF){
        
        //part time
        
        case 'P':
        
         System.out.println("---Part Time Employee---");
         System.out.print("Enter rate per hour: ");
         ratehour = bes.nextDouble();
         System.out.print("Enter no. of hours worked: ");
         hours = bes.nextInt();
         System.out.print("Enter no. of overtime: ");
         OT = bes.nextInt();
              System.out.println("________________________________");
                System.out.println("Employee Name:      "+ Name);
                  ptimepay = hours*ratehour;
                System.out.println("Basic Pay:          "+ ptimepay);
                  otpay = OT*(ratehour*1.25);
                System.out.println("Ovetime Pay:        "+ otpay);
              System.out.println("________________________________");
              grosspay = ptimepay + otpay;
                System.out.print("Gross Pay:          "+ grosspay);
                break;
                
        
        
        //full time
        
        case 'F':
            System.out.println("---Full Time Employee---");
            System.out.print("Enter Basic Pay: ");
            paybasic = bes.nextDouble();
              System.out.println("________________________________");
                 System.out.println("Employee Name:     "+ Name);
                 System.out.println("Basic Pay:         "+ paybasic);
              System.out.println("________________________________");
                     ftimepay = paybasic;
                 System.out.print("Gross Pay:         "+ ftimepay);
                 break;
                  
                   
                   
                   default:
                   
                 System.out.println("Please type the right input");
            
            
            
        
    }
    
    
    
    }
}