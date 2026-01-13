import java.util.Scanner;
public class Main{
    public static void main (String[] args) {
        int Male, Female, Students;
        float boypercent, girlpercent;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of males = ");
        Male = input.nextInt();
        System.out.print("Enter the number of females = ");
        Female = input.nextInt();
        Students = Male + Female;
        boypercent = ((float)Male/Students)*100;
        girlpercent = ((float)Female/Students)*100;
        System.out.print("Number of students = ");
        System.out.printf("%2d", Students);
        System.out.println(" ");
        System.out.print("Male: ");
        System.out.printf("%3.2f", boypercent);
        System.out.println("%");
        System.out.print("Female: ");
        System.out.printf("%1.2f", girlpercent);
        System.out.println("%");