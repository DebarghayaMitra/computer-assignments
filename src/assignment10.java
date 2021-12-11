/*
In game of tossing a coin you want to know the number of times getting ‘Head’ and Tail .You keep the the records as 1(one) for getting ‘Head’ and 0 (zero) for ‘Tail’. Write a program to perform the above task. Suppose you have tossed a coin for 20 times in this game.
 */


//importing required libraries
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//class begin
public class assignment10 
{
    //main begins
    public static void main(String[] args) throws IOException
    {
        //creating required objects
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        byte[] numbers = new byte[20];
        boolean flag = false;
        //taking input
        for(int i = 0; i < numbers.length; i++)
        {
            inputloop:
                do
                {
                    try
                    {   
                        System.out.println("\nEnter 1 for Head and 0 for tail (Obs. No. " + (i+1) +  "):- ");
                        numbers[i] = (byte) Integer.parseInt(keyboard.readLine());
                        flag = false;
                    }
                    catch(Exception e)
                    {
                        System.out.println("\nInvalid input! Enter Again!\n");
                        flag = true;
                        continue inputloop;
                    }
                    if(numbers[i] == 0 || numbers[i] == 1)
                    {
                        flag = false;
                    }
                    else
                    {
                        System.out.println("\nInvalid input! Enter Again!\n");
                        flag = true;
                        continue inputloop;
                    }
                }
                while(flag);
        }
        //checking for number if heads and tails
        int numOfHead=0;
        int numOfTail=0;
        for (int i=0; i < numbers.length; i++)
        {
            if(numbers[i] == 0)
            {
                ++numOfTail;
            }
            else if(numbers[i] == 1)
            {
                ++numOfHead;
            }
        }
        //printing results
        System.out.println("The number of heads is " + numOfHead + " \nThe number of tails is " + numOfTail);
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
2.  byte[]              numbers         To store the array of observation given by user
3.  boolean             flag            To flag out when an error in input or key is found
4.  int                 i               To control the outer loop in input loop
5.  int                 i               To control the outer loop in bubble sort
5.  int                 numOfTail       To store the frequency of tails observation in the array
5.  int                 numOfHead       To store the frequency of heads observation in the array
*/
