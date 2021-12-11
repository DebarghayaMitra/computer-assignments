/*
In an examination, the grades are given to the students on the basis of average marks obtained. Write a program to input name and average marks that displays the grade along with the name accordingly

Marks							        Grades
80% and above     					    Distinction
60% or more but less than 80%			First Division
45% or more but less than 60%			Second Division
40% or more but less than 45%			Pass 
Less than 40%					        No grade
 */

//importing required libraries
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
//class begins
public class assignment16 
{
    //main begins
    public static void main(String[] args) throws IOException
    {
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        //taking input for student name
        System.out.println("Enter student name:- ");
        String name = keyboard.readLine();
        double averageMarks = 0;
        boolean flag = false;
        //taking input for average marks
        inputloop:
        do
        {
            try
            {   
                System.out.println("\nEnter student's average marks:- ");
                averageMarks = Double.parseDouble(keyboard.readLine());
                flag = false;
            }
            catch(Exception e)
            {
                System.out.println("\nInvalid input! Enter Again!");
                flag = true;
                continue inputloop;
            }
            if(!(averageMarks>=0 && averageMarks<=100))
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
        //display results
        System.out.println("\n\n");
        System.out.println("*******************************************************************************");
        System.out.println("Your Results:- ");
        System.out.println("*******************************************************************************");
        System.out.print("Name: " + name + "\n" + "Average Marks: " + averageMarks + "% \n" + "Grades: ");
        //determining grades
        if (averageMarks >= 80 && averageMarks <= 100)
        {
            System.out.println("Distinction");
        }
        else if (averageMarks >= 60 && averageMarks < 80)
        {
            System.out.println("First Division");
        }
        else if (averageMarks >= 45 && averageMarks < 60)
        {
            System.out.println("Second Division");
        }
        else if (averageMarks >= 40 && averageMarks < 45)
        {
            System.out.println("Pass");
        }
        else if (averageMarks >= 0 && averageMarks < 40)
        {
            System.out.println("No Grade");
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
2.  String              name                To store the name of the student.
5.  boolean             flag                To flag out when an error in input.
4.  double              averageMarks        To store the average marks of the student.
5.  Exception           e                   To catch the exception in input.

*/
