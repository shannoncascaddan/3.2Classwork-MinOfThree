import java.util.Scanner;

public class minOfThree
{
    //Reads 3 ints and determines smallest value
    public static void main(String[] args)
    {
        int num1, num2, num3, min = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        if (num1 < num2)
        {
            if (num1 < num3)
            {
                min =  num1;
            }//end inner if
            else
            {
                min= num3;
            }//end inner else
        }//end outer if
        else
        {
            if (num2 < num3)
            {
                min = num2;
            }//end inner if #2
            else
            {
                min = num3;
            }//end inner else #2
        }//end outer else1
        System.out.println("Minimum Value: " + min);
    }//end method
}// end class
