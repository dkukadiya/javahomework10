import java.util.Scanner;
public class Eligibleforvote
{
    public static void main(String[] args)
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println(" Please Enter any personS age:");
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("Person should be eligible for vote");
        }
        else
        {
            System.out.println("Person shouldn't eligible for vote");
        }
    }
}




