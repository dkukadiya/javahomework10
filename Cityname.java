import java.util.Scanner;
public class Cityname
{
    public static void main(String[] args) {
        char alpha; // varible declare
        System.out.println("Enter the any alphabet: ");
        Scanner sc = new Scanner(System.in);
        alpha = sc.next().charAt(0);
        if ((alpha == 'a') || (alpha == 'A'))
        {
            System.out.println("This city is Ahemdabad:");
        } else if ((alpha == 'b') || (alpha == 'B'))
        {
            System.out.println("This city is Bombay:");
        }
        else if((alpha == 'c') || (alpha == 'C'))
        {
            System.out.println("This city is Chicago:");
        }
        else if((alpha == 'd') || (alpha == 'D'))
        {
            System.out.println("This city is Delhi:");
        }
        else if((alpha == 'e') || (alpha == 'E'))
        {
            System.out.println("This city is Erode:");
        }
        else if((alpha == 'f')  || (alpha == 'F'))
        {
            System.out.println("This city is Falna:");
        }
        else {
          System.out.println("Invaild  entry city name");
        }
    }}
