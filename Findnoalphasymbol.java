import java.util.Scanner;
public class Findnoalphasymbol
{
    public static void main(String[] args)
    {
        char value;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Value:" );
        value=sc.next().charAt(0);
        if((value >= 'a' && value <= 'z') || (value >= 'A' && value <= 'Z'))
        {
            System.out.println(value + " is A ALPHABET.");

        } else if(value >= '0' && value <= '9') {
            System.out.println(value + " is A DIGIT.");
        } else
        {
            System.out.println(value + " is A SPECIAL CHARACTER.");
        }}}


