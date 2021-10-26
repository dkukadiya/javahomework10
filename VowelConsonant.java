import  java.util.Scanner;

public class VowelConsonant {
    public  static  void main(String[]args)
    {
        char alpha; //Declartion of varible
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any Single Charcter from the  Alphabet:");
        alpha=sc.next().charAt(0);
        if  (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha== 'o' || alpha == 'u' || alpha=='A' || alpha =='E'|| alpha == 'I' || alpha=='O'|| alpha == 'U')
        {
            System.out.println(alpha + " is vowel");
        } else
        {
            System.out.println(alpha + " is consonant");
        }
    }}
