import java.util.Scanner;
public class Positivenegativefindno {
    public static void main(String[] args)
    {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number:");
        num=sc.nextInt();
        //checks the number is grater than 0 or not
        if(num>0)
        {
            System.out.println("The number is positive.");
        }
//checks the number is less than 0 or not
        else if(num<0)
        {
            System.out.println("The number is negative.");
        }
// when the above two conditions return false then number is zero
        else
        {
            System.out.println("The number is zero.");
        }

    }
}
