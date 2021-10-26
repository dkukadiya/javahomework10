
import java.util.Scanner; //creating Scanner

public class Ternaryoperator
{
    public static void main(String[] args)
{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number1 to test:");
        int number1 =sc.nextInt();
        System.out.println("Enter any number2 to test:");
         int number2 =sc.nextInt();
         //ternary opretor to check number
    String result1= number1%2==0 ?  " This is Even no " :   " This is odd no ";
    String result2= number2%2==0 ?  "This is Even no "   :   " This is odd no ";
    System.out.println(number1 + " is" + result1);
    System.out.println(number2 + " is" + result2);
}
}
