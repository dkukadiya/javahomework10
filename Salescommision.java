import java.util.Scanner;
public class Salescommision
{
    public static void main(String[] args)
    {
        String salesid;
        String sellername;
        float amount;
        float salary;
        float commission;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Sales id:");
        salesid= sc.nextLine();
        System.out.println("Enter the Sales Name:");
        sellername= sc.nextLine();
        System.out.println("Enter the  Sales Amount:");
        amount= sc.nextFloat();
        System.out.println("Enter the Salary basic:");
        salary= sc.nextFloat();
        if( amount>= 50000)
        {
            commission = amount * 35 / 100;
            System.out.println("COMMISSION IS:" + commission);
        }
         else if( amount >=30000)
         {
            commission = amount * 20 / 100;
            System.out.println(" COMMISSION IS:" + commission);
        }
        else if(amount >=20000)
        {
            commission = amount * 10 / 100;
            System.out.println( "COMMISSION IS:" + commission);
        }

        else if(amount >=10000)
        {
            commission = amount * 5 / 100;
            System.out.println( "COMMISSION IS:"+ commission);
        }
        else if (amount<10000)
         {
             commission=amount*2/100;
             System.out.println( "COMMISSION IS:" + commission);
         }
}}
