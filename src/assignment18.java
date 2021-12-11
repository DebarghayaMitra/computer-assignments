/*
The standard form of quadratic equation is given by: ax2 + bx + c=0 , where d = b2 - 4ac , is known as discriminant that determines the nature of the root of the equation as.
Condition				Nature 
	If d>=0					Roots are Real
	If d<=0					Roots are imaginary

Write a program to determine the nature and the roots of a quadratic equation, taking a,b,c  as input ,otherwise display root are imaginary .
The roots determined by the formula as 
r1 = (-b + sqrt(b²-4ac))/2a
r2 = (-b + sqrt(b²-4ac))/2a
 */



//importing required libraries
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;
//class starts
public class assignment18 
{
    //main starts
    public static void main(String[] args) throws IOException
    {
        //decalring required variables and objects
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        double a = 0;
        double b = 0;
        double c = 0;
        boolean flag = false;
        //taking input for a
        inputloopA:
        do
        {
            try
            {   
                System.out.println("\nEnter the value of 'a' in qudratic equations:- ");
                a = Double.parseDouble(keyboard.readLine());
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid input! Enter Again!");
                flag = true;
                continue inputloopA;
            }
        }
        while(flag);
        flag = false;
        //taking input for b
        inputloopB:
        do
        {
            try
            {   
                System.out.println("\nEnter the value of 'b' in qudratic equations:- ");
                b = Double.parseDouble(keyboard.readLine());
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid input! Enter Again!");
                flag = true;
                continue inputloopB;
            }
        }
        while(flag);
        flag = false;
        //taking input for c
        inputloopC:
        do
        {
            try
            {   
                System.out.println("\nEnter the value of 'c' in qudratic equations:- ");
                c = Double.parseDouble(keyboard.readLine());
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid input! Enter Again!");
                flag = true;
                continue inputloopC;
            }
        }
        while(flag); 
        flag = false;
        //checking for real roots
        if((pow(b, 2) - 4 * a * c) >= 0)
        {
            //displaying roots if real
            System.out.println("\nThe two roots of the equation are " + ((-b + sqrt(pow(b, 2) - 4 * a * c))/(2*a)) + " and " + ((-b - sqrt(pow(b, 2) - 4 * a * c))/(2*a)));
        }
        else
        {
            System.out.println("\nThe two roots of the equation are imaginary.");
        }
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
2.  double              a                   To store the value of a.
3.  Exception           e                   To catch the exception in input for a.
4.  double              b                   To store the value of b.
5.  Exception           e                   To catch the exception in input for b.
6.  double              c                   To store the value of c.
7.  Exception           e                   To catch the exception in input for c.
8.  boolean             flag                To flag out when an error in input.
*/