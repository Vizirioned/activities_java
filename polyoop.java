import java.util.Scanner;
import java.util.Random;

public class Guessing {

    public static void main(String[] args) {
        int  userNumber;
        int guesses = 0;
        int  correct = 0;
        int random;
        final int MAX = 50;
        Scanner scan = new Scanner(System.in);

       random = (int)(Math.random()*50 + 1);
    
        System.out.println(random);
        
       System.out.println("Please pick a number between 1 and 50.");
     
  
  while (correct == 0){  
      
try {
            
             
            userNumber = scan.nextInt();
            guesses++;
            if (userNumber > 50)
                System.out.println("Out of range");
            else if (userNumber > random)
                System.out.println("Too high try again  .");
               
            else if (userNumber < random)
                System.out.println("Too low try again.");
            else if (userNumber == random) {
               
                System.out.println("You have guessed " + guesses + " times!");
                correct = 1;
                break;
                
            }
    }
            
            catch (Exception e) {
                System.out.println("invalid input");
                scan.next();
                
            } 
            
        }
            
            
        
            }
           
           
            

        
}

    