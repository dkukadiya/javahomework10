
import java.util.Scanner;
public class Marksheetonsubjectbasic
{ public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the  english marks: ");
        int engmark=sc.nextInt();
        System.out.println("Enter the  maths marks: ");
        int mathsmark = sc.nextInt();
        System.out.println("Enter the  Science marks: ");
        int science=sc.nextInt();
        String  result= sc.nextLine();
        if((engmark<35)  || (mathsmark<35) || (science<35))
        {
            result = "fail";
            System.out.println("Result is: Fail");
        }
         else
        {
            System.out.println("Result is: pass");
        }
    }}



