import java.util.Scanner;
public class Grosssalary
{
    public static void main(String[] args)
    {
        String id;
        String name;
        float salary;
        float grosssalary;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Employee id: ");
        id=sc.nextLine();
        System.out.println("Enter the Employee Name: ");
        name=sc.nextLine();
        System.out.println("Enter the employee  Basic salary:");
        salary=sc.nextFloat();
        float HRA;
        float DA;
        float TA;
        float PF;
        HRA=salary*10/100;
        DA=salary*8/100;
        TA=salary*9/100;
        PF=salary*20/100;
        grosssalary=salary + HRA + DA + TA - PF;
        System.out.println(grosssalary);
    }
}
