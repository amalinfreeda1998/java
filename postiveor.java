import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        int b;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number you want to check:");
        b = scan.nextInt();
        if(n > 0)
        {
            System.out.println("The given number "+b+" is Positive");
        }
        else if(b < 0)
        {
            System.out.println("The given number "+b+" is Negative");
        }
        else
        {
            System.out.println("The given number "+b+" is neither Positive nor Negative ");
        }
    }
}