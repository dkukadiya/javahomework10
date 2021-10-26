import java.util.Scanner;
public class leapyear
{
   public static void main(String[] args)
   {
       int year;
       System.out.println("Enter the any year: ");
       Scanner sc=new Scanner(System.in);
       year=sc.nextInt();
   if (((year % 4 == 0) && (year % 100 !=  0)) || (year % 400 == 0))
       System.out.println("The Given year is leap year");
   else
       System.out.println("The Given  year is not leap year");
   }
}

