import java.util.Scanner;
public class Main{
     public static void main(String[] args) {
         
         boolean reservation = true;
         Scanner res = new Scanner(System.in);
         
         
         
         String[] RowColumn;
          String[] Rows = { "Row 1 ",
                            "Row 2 ",
                            "Row 3 ",
                            "Row 4 ",
                            "Row 5 ",
                            "Row 6 ",
                            "Row 7 ",
                            "Row 8 ",
                            "Row 9 ",
                            "Row 10 "
              
          };
        
        
        String [][] seatsTable = {
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},   
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"},
                {"|*", "*","*", "*"}

        };
         

         
        do{ 
           System.out.println("Bus Reservation");
          String[] columns = { "Col 1",
          "Col 2",
          "Col 3",
          "Col 4" 
              
          };
          
          
        for(int i = 0; i < columns.length; i++)
        {
            System.out.print("\t" + columns[i]);

        }

       
        System.out.println();   
        
        for(int row = 0; row < seatsTable.length; row++)
        {
            System.out.print(Rows[row]);
            
            for(int col = 0; col < seatsTable[row].length; col++)
            {
                
                System.out.print("\t" + seatsTable[row][col]);

            }

            System.out.println();
        }


        System.out.print("Enter row and column number to reserve separated by space (Enter a negative number to exit): ");
        
        RowColumn = res.nextLine().split(" ");
        
        int row1 = Integer.parseInt(RowColumn[0]);
        int col2 = Integer.parseInt(RowColumn[1]);
        if(Integer.parseInt(RowColumn[0]) > 0 && Integer.parseInt(RowColumn[1]) > 0){
             seatsTable[row1-1][col2-1] = "x";
        }
        
        
        
        else{
        reservation = false;

        }
        
        
        }
        while(reservation == true);
        
        }
}