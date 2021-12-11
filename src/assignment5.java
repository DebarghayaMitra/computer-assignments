//importing required libraries
import java.util.Scanner;
//class starts
class assignment5
{
    //main starts
    public static void main(String args[])
    {
        //taking input from user
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a lower limit number:-");
        int low = keyboard.nextInt();
        System.out.println("Enter a upper limit number:-");
        int high = keyboard.nextInt();
        if(low < high)
        {
            //displaying the required numbers
            System.out.println("The numbers between " + low + " and " + high + " are:-");
            for (int i = low+1; i<high; i++)
            {
                System.out.print(i + " ");
                if(i%10 == 0)
                {
                    System.out.println();
                }
            }
        }
        else if (low>=high)
        {
            //display error message
            System.out.println("Sorry! Limits are not valid.");
        }
        System.out.println();
        System.out.println();
        //closing resources
        keyboard.close();
    }
    //main ends
}
//class ends