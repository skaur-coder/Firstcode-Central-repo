package singleloop;


// 0+1+1+2+3+5
//plus with previous number 
public class fibonacciseries
{
public static void main(String[] args)
{
	int a=0;
	int b=1;
	
 System.out.print( a+""+b);
 
	int c;
	
	for(int  i=1; i<=10 ; i++)
	{
		c=a+b;
		System.out.print(" " +c);
		a=b;
		b=c;	
	}	
}
}

