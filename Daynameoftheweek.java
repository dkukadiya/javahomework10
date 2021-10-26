import java.util.Scanner;
public class Daynameoftheweek
{
    public static void main(String[] args)
    {
        int number;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number:");
        number = sc.nextInt();
        if (number==1)
        {
            System.out.println("Day is Monday");
        }
        else if(number==2)
        {
            System.out.println("Day is  Tuesday");
        }
        else if (number==3)
        {
            System.out.println("Day is Wednesday");
        }
        else if(number==4)
        {
            System.out.println("Day is Thursday");
        }
        else if(number==5)
        {
            System.out.println("Day is Friday");
        }
        else if(number==6)
        {
            System.out.println("Day is Saturday");
        }
        else if (number==7)
        {
            System.out.println("Day is Sunday");
        }
        else
        {
            System.out.println("Input  invalid number");
        }
    }
}

