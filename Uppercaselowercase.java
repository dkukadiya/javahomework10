import java.util.Scanner;

public class Uppercaselowercase
{
    public static void main(String[] args) {
       String ch; //declare variable
        String convert;
        Scanner sc = new Scanner(System.in); //declare scanner  object for input
         System.out.println(" Please Input any alphabet in Uppercase :");
         ch = sc.nextLine();
        convert = ch.toLowerCase();
        System.out.println( "Outcome will be Lowercase:" + convert);
    }}











