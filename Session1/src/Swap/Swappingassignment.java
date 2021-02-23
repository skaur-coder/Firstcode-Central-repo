package Swap;
import java.util.Scanner;

public class Swappingassignment 
{
	
	public static void main(String[] args)
	{
		int x,y, z;
		System.out.println("Example of Swapping of two number using third variable");
		System.out.println("Enter value for x : ");
		//Swapping of two number using third variable
		Scanner s= new Scanner(System.in);
		x =s.nextInt();
		System.out.println("Enter value for y : ");
		 y=s.nextInt();
		System.out.println("Before Swapping value for x & y ="  +x+" ,"+y);
		z=x;
		x=y;
		y=z;
		System.out.println("After Swapping value for x & y ="  +x+" ,"+y);	
		
		//Swapping of two number without using third variable
		System.out.println("");
		System.out.println("Example of Swapping of two number without using third variable");
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter value for x : ");
		x =s1.nextInt();
		System.out.println("Enter value for y : ");
		 y=s1.nextInt();
		System.out.println("Before Swapping value for x & y =" +x+" ,"+y);
		x=x*y;
		y=x/y;
		x=x/y;
		System.out.println("After Swapping value for x & y =" +x+","+y);	
	}
}





