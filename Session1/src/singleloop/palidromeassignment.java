package singleloop;

import java.util.Scanner;

//reversal of the number will be same 
public class palidromeassignment
{
	public static void main(String args[])
	   {
	      
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter a number:");
	     int no=scanner.nextInt();
	    int temp =no;
	    int rev=0, rem;
	    while(temp!=0) //is not equal to zero while condition will run
	    {
	    	rem=temp%10;
	    	rev=rev*10+rem;
	    	temp=temp/10;
	    }
	    if (no==rev)
	    {
	         System.out.println("Input string is a palindrome.");
	    }
	      else
	      {
	         System.out.println("Input string is not a palindrome.");

	   }
	}
}