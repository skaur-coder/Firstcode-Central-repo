package singleloop;

import java.util.Scanner;

public class Armstrongassignment
{
// 0,1,153,370,371,407,1634
	// 1=1cube
	//12 = 1 cube + 2 cube
	//123= 1cube + 2cube+ 3 cube 
	
	
	// find the length
	public static void main(String[] args)
	{
		int number=153;
		int old_number=number;
		int sum=0;
		
		while (number >0)
		{
			int r=number %10;
			sum=sum+r*r*r;
			number = number /10;	
		}
		if (old_number==sum)
		{
			System.out.println(old_number+ "is a armstrong number " );
		}
		else
		{
			System.out.println(old_number+"is not  a armstrong number");
		}
	}
}
		
		

