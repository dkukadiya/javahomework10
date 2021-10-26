import sun.awt.Symbol;

import java.util.Scanner;
public class MarksheetonGrade
{
     public static void main(String[] args)
     {
         float percentage;
         float total;
         System.out.println("Enter the  Student name: ");
         Scanner sc =new Scanner(System.in);
         String name =sc.nextLine();
         System.out.println("Enter the  Student rollno: ");
         int rollno=sc.nextInt();
         System.out.println("Enter the  english marks: ");
         int engmarks=sc.nextInt();
         System.out.println("Enter the  maths marks: ");
        int   mathsmarks=sc.nextInt();
         System.out.println("Enter the  Science mark: ");
        int sciencemarks=sc.nextInt();
        total=(engmarks+mathsmarks+sciencemarks);
         System.out.println("Total marks:"  + total);
         percentage=(total/300)*100;
         System.out.println("Student's percentage: " + percentage);
         if(percentage >= 35)
         {
             System.out.println("Student is pass");
             if( percentage >=80)
             {
                 System.out.println(" Student grade is A+");
             }
            else if (percentage>=60)
            {
                 System.out.println(" Student grade is A");
             }
             else if(percentage>=50)
             {
                 System.out.println(" Student grade is B");
             }
           else if(percentage>=35)
            {
                 System.out.println(" Student grade is C");
             }
           else
               System.out.println(" Student is fail");
         }
}}


