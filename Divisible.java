import java.util.Scanner;

public class Divisible
{
    public static void main(String[] args)
    {
        int num1,
            num2;

        Scanner userInput = new Scanner(System.in);

        System.out.println("Please input an integer: ");
        num1 = userInput.nextInt();

        System.out.println("Please input a second integer: ");
        num2 = userInput.nextInt();

        if ((num1 % num1) != 0)
            {
                System.out.println(num1 + " is not evenly divisible by " + num2 + ".");
                System.out.println("The remainder is " + (num1 % num2) + ".");
            }
        else 
        {
            System.out.println(num1 + " is evenly divisible by " + num2 + ".");
        }

        //this is a comment that changes the file
        userInput.close();
        System.exit(0);
    }
}
