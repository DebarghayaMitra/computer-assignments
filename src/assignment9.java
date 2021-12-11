/*
Write a program to accept 10 different number in a single dimensional array arrange the number in ascending order by using bubble sort technique. 
 */


//importing required libraries
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//class starts
public class assignment9 
{
    //main starts
    public static void main(String[] args) throws IOException
    {
        //declaring objects and variables
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        double[] numbers = new double[10];
        boolean flag = false;
        //taking input
        for(int i = 0; i < numbers.length; i++)
        {
            inputloop:
                do
                {
                    try
                    {   
                        System.out.println("\nEnter a number (No." + (i+1) +  "):- ");
                        numbers[i] = Double.parseDouble(keyboard.readLine());
                        flag = false;
                    }
                    catch(Exception e)
                    {
                        System.out.println("\nInvalid input! Enter Again!\n");
                        flag = true;
                        continue inputloop;
                    }
                }
                while(flag);
        }
        //bubble sortings
        for (int i = 0; i < numbers.length - 1; i++)
        {
            for (int j = 0; j < numbers.length - i - 1; j++)
            {
                if (numbers[j] > numbers[j+1])
                {
                    // swap arr[j+1] and arr[j]
                    double temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
        //printing sorted array
        System.out.println("\nThe sorted numbers are: ");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print(numbers[i] + ", ");
        }
        System.out.println();
        //closing resources
        keyboard.close();
    }
    //main ends
}
//class ends



/*

Variable Description
    Variable Type       Identifier      Description
1.  BufferedReader      keyboard        To access the BuffuredReader input methods
2.  double[]            numbers         To store the array of numbers given by user
3.  double              temp            To store the number to be swapped temporarily
4.  boolean             flag            To flag out when an error in input or key is found
5.  int                 i               To control the outer loop in input loop
6.  int                 i               To control the outer loop in bubble sort
7.  int                 j               To control the inner loop in bubble sort
8.  int                 i               To control the loop in print loop

*/

