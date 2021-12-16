/*
Using switch statement, write a menu driven program for the following :
i) To find and display the sum of the series given below :
    S=x¹ - x² + x³ - x⁴ + x⁵ ……………………… -x²⁰
    (where x=2)
ii) To display the following series : 1 11 111 1111 11111
For an incorrect option, an appropriate error message should be displayed.

*/

//importing required libraries
import java.util.Scanner;
import static java.lang.StrictMath.pow;
//class begins
class assignment3
{
    //main begins
    public static void main(String[] args)
    {
        //input for menu
        Scanner keyboard = new Scanner(System.in);
        System.out.println("The main menu");
        System.out.println("1. To display s = x¹ - x² + x³ .... -x²⁰");
        System.out.println("2. To display the pattern:- 1 11 111 1111 ..");
        int choice = keyboard.nextInt();
        switch(choice)
        {
            case 1:
                //printing s for first choice
                System.out.println("Enter the value of x:-");
                double x = keyboard.nextDouble();
                double s = 0;
                for(int i = 1; i<=20; i++)
                {
                    if(i % 2 != 0)
                    {
                        s += pow(x, i);
                    }
                    else if(i % 2 == 0)
                    {
                        s -= pow(x, i);
                    }
                }
                System.out.println("s = " + s);
                break;
            case 2:
                //printing the pattern for second choice
                System.out.println("Enter the number of characters:-");
                int n = keyboard.nextInt();
                System.out.println("Here is your pattern!");
               for(int i = 1; i<=n; i++)
                {
                    for(int j = 1; j<=i; j++)
                    {
                        System.out.print("1");
                    }
                    System.out.print(" ");
                }
                break;
            default:
                //printing error for wrong choice
                System.out.println("Invalid choice!");
        }
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
3.  int             x               To store the value of x in first choice
4.  int	            i               To control the outer loop in 1st choice
5.  int             n               To control the number of characters in 1st choice
6.  int	            i               To control the outer loop in 2nd choice
7.  int             j               To control the inner loop in 2nd choice

*/