/*
Write a program in Java to display the first 10 numbers of the Fibonacci series. 
0,1,1,2,3,…………………
 */


//importing required libraries
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
//class begins
public class assignment19 
{
    //main begins
    public static void main(String[] args) throws IOException
    {
        //decalring required variables and objects
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        long n1=0;
        long n2=1;
        long n3,i;
        boolean flag = false;
        inputloop:
        //taking input for number of values
        do
        {
            try
            {   
                System.out.println("\nEnter the number of values you need in the series:- ");
                count = Integer.parseInt(keyboard.readLine());
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid input! Enter Again!");
                flag = true;
                continue inputloop;
            }
            if(count<=0)
            {
                System.out.println("\nInvalid input! Enter Again!");
                flag = true;
                continue inputloop;
            }
            else
            {
                flag = false;
            }
        }
        while(flag);
        System.out.println("\nThe fibonacci series is as follows:-");
        //printing 0 and 1
        System.out.print(n1+", "+n2); 
        //loop starts from 2 because 0 and 1 are already printed   
        for(i=2 ; i<count ; ++i)
        {    
            n3=n1+n2;    
            System.out.print(", "+n3);    
            n1=n2;    
            n2=n3;    
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
    Variable Type       Identifier          Description
1.  BufferedReader      keyboard            To access the BuffuredReader input methods.
2.  int                 count               To store the number of values.
3.  Exception           e                   To catch the exception in input for number of values.
4.  long                n1                  To store the value of 2nd last number in the particular iteration of loop.
5.  long                n2                  To store the value of last number in the particular iteration of loop.
6.  long                n3                  To store the sum of n1 and n2.
7.  long                i                   To control the loop for fibonacci series.
8.  boolean             flag                To flag out when an error in input.
*/