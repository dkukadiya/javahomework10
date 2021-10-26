import java.util.Scanner;
public class Averagenumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first no : ");
        int num1= sc.nextInt();
        System.out.println("Enter the second no : ");
        int num2= sc.nextInt();
        System.out.println("Enter the third no: ");
        int num3=sc.nextInt();
        System.out.println("Enter the fourth no: ");
        int num4=sc.nextInt();
        System.out.println("Enter the fifth no: ");
        int num5=sc.nextInt();
        System.out.println("Average of five numbers is: " +
                (num1 + num2 + num3 + num4 + num5) / 5);
    }
}
