import java.util.Scanner;

public class Interchangedvalue
{
      public  static void main(String[]args)
      {
          int a;
          int b;
          int c;
          System.out.println("Enter the value of a : ");
          Scanner sc=new Scanner(System.in);
          a=sc.nextInt();
          System.out.println("Enter the value of b : ");
          b=sc.nextInt();
          System.out.println("before swapping numbers: "+a+"  "+ b);
          /*swapping */
          c= a;
          a = b;
          b= c;
          System.out.println("After swapping: "+a +"   " + b);
          System.out.println();
      }
}
