
//importing required libraries
import java.util.Scanner;
//class begins
class assignment1
{
    //main begins
    public static void main(String args[])
    {
        //taking inputs
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = keyboard.nextLine();
        System.out.println("Enter your ticket charge:-");
        double ticketCharge = keyboard.nextDouble();
        String discountPercent;
        double netAmount;
        //calculating discount and displaying it
        if (ticketCharge>70000)
        {
            discountPercent = "18%";
            netAmount = ticketCharge - (0.18 * ticketCharge);
            System.out.println("Sl.No. \t Name \t \t \t Ticket Charge \t Discount \t Net Amount");
            System.out.println("1. \t " + name + " \t ₹" + ticketCharge + " \t " + discountPercent + " \t \t ₹" + netAmount);
        }
        else if (ticketCharge>=55001 && ticketCharge<=70000)
        {
            discountPercent = "16%";
            netAmount = ticketCharge - (0.16 * ticketCharge);
            System.out.println("Sl.No. \t Name \t \t \t Ticket Charge \t Discount \t Net Amount");
            System.out.println("1. \t " + name + " \t ₹" + ticketCharge + " \t " + discountPercent + " \t \t ₹" + netAmount);
        }
        else if (ticketCharge>=35001 && ticketCharge<=55000)
        {
            discountPercent = "12%";
            netAmount = ticketCharge - (0.12 * ticketCharge);
            System.out.println("Sl.No. \t Name \t \t \t Ticket Charge \t Discount \t Net Amount");
            System.out.println("1. \t " + name + " \t ₹" + ticketCharge + " \t " + discountPercent + " \t \t ₹" + netAmount);
        }
        else if (ticketCharge>=25001 && ticketCharge<=35000)
        {
            discountPercent = "10%";
            netAmount = ticketCharge - (0.1 * ticketCharge);      
            System.out.println("Sl.No. \t Name \t \t \t Ticket Charge \t Discount \t Net Amount");
           System.out.println("1. \t " + name + " \t ₹" + ticketCharge + " \t " + discountPercent + " \t \t ₹" + netAmount);
        }
        else if (ticketCharge>=0 && ticketCharge<25001)
        {
            discountPercent = "2%";
            netAmount = ticketCharge - (0.02 * ticketCharge);
            System.out.println("Sl.No. \t Name \t \t \t Ticket Charge \t Discount \t Net Amount");
            System.out.println("1. \t " + name + " \t ₹" + ticketCharge + " \t " + discountPercent + " \t \t ₹" + netAmount);
        }
        else if (ticketCharge <= 0)
        {
            System.out.println("Input Error");
        }
        //closing resources
        keyboard.close();
    }
    //main ends
}
//class ends