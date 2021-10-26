import java.util.Scanner;
public class Calculator
{
    public static void main(String[]args)
    {
        int num1;
        int num2;
        char symbol;
        int sum,sub,multi,div;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First number:");
        num1 = sc.nextInt();
        System.out.println("Enter the Second number:");
        num2=sc.nextInt();
        System.out.println("please Enter any Symbol(+,-,*,/):");
        symbol=sc.next().charAt(0);
        if(symbol == '+')
        {
             sum=num1+num2;
             System.out.println( "The Addition of two number:" + sum);
        }
        else if(symbol == '-')
        {
            sub=num1-num2;
            System.out.println( "The Substraction of two number:" + sub);
        }
        else if(symbol== '*')
        {
            multi=num1*num2;
            System.out.println("The multifiction of two number: " + multi);
        }
        else if(symbol== '/')
        {
            div=num1/num2;
            System.out.println("The Division of two number:" + div);
        }
        else
        {
            System.out.println("Invaild Symbol");
        }
    }
}

