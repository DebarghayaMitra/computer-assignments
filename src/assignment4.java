/*
Using switch statement , write a menu driven program for the following :
i) To print the Floyd’s triangle :
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15
ii) To print the following pattern
    5 4 3 2 1
    5 4 3 2
    5 4 3
    5 4
    5 
 */

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



/*

Variable Description
    Variable Type   Identifier      Description
1.  Scanner         keyboard        To access the Scanner input methods
2.  int             choice          To store the choice of user
3.  int             k               To store the incrementation of number in floyd's triangle
4.  int	            i               To control the outer loop in 1st and 2nd choice
5.  int             j               To control the inner loop in 1st and 2nd choice

*/