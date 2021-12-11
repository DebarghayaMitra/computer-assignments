/*
Write a program to accept 10 different number in a single dimensional array Now enter a number and search whether the number is present or not in the list of array elements by using Linear search technique.
 */


//importing libraries
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//class begins
public class assignment8 
{
    //main begins
    public static void main(String[] args) throws IOException
    {
        //creating input object
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        double[] numbers = new double[10];
        double key = 0;
        boolean flag = false;
        int index = 0;
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
        flag = false;
        //taking input for key number
        inputloop:
            do
            {
                try
                {   
                    System.out.println("\nEnter key number :-");
                    key = Double.parseDouble(keyboard.readLine());
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
        flag = false;
        //checking for key in the array by linear search
        for(int i = 0; i < numbers.length; i++)
        {
            if(key == numbers[i])
            {
                flag = true;
                index = i;
            }
        }
        //displaying results
        if(flag == true)
        {
            System.out.println("The key was found in the array in index " + index);
        }
        else
        {
            System.out.println("The key was not found in the array");
        }
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
3.  double              key             To store the key number from user to search in the array
4.  boolean             flag            To flag out when an error in input or key is found
5.  int                 index           To store the index of the array when the key is found
6.  int                 i               To control the loop

*/

