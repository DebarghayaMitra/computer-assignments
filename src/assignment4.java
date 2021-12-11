//importing required libraries
import java.util.Scanner;
//class begins
class assignment4
{
    //main begins
    public static void main(String[] args)
    {
        //printing the menu
        Scanner keyboard = new Scanner(System.in);
        System.out.println("The main menu");
        System.out.println("1. To print");
        System.out.println("   1");
        System.out.println("   2 3");
        System.out.println("   4 5 6");
        System.out.println("2. To print");
        System.out.println("   3 2 1");
        System.out.println("   3 2");
        System.out.println("   3");
        System.out.println("Enter your choice:-");
        int choice = keyboard.nextInt();
        //choice switching
        switch(choice)
        {
            case 1:
                //accepting the number of rows
                int k = 1;
                System.out.print("Enter the number of rows:- ");
                int rows = keyboard.nextInt();
                //printing the pattern
                System.out.println("Here is your pattern");
                for(int i = 1; i<=rows; i++)
                {
                    for(int j = 1; j<=i; j++)
                    {
                        System.out.print(k + " ");
                        k++;
                    }
                    System.out.println();
                }
                break;
            case 2:
                //accepting the number of rows
                System.out.print("Enter the number of rows:- ");
                rows = keyboard.nextInt();
                //printing the pattern
                System.out.println("Here is your pattern");
                for(int i = 1; i<=rows; i++)
                {
                    for(int j = 5; j>=i; j--)
                    {
                        System.out.print(j + " ");
                    }
                    System.out.println();
                }
                break;
            default:
                //error display
                System.out.println("Invalid Choice!");
        }
        //switch ends
        System.out.println();
        System.out.println();
        //closing resources
        keyboard.close();
    }
    //main ends
}
//class ends