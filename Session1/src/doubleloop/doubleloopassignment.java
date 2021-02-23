package doubleloop;

public class doubleloopassignment 
{
	int i , j;
	public void pattern1()
	{
		for(int i=1 ; i<=4 ; i++)//rows -
		{
			for(int  j=1; j<=i ; j++)//column /
			{
				System.out.print("*");
			}
			System.out.println("");
			}
		}
public void pattern2()
	{
	for(int i=1 ; i<=5 ; i++)
		{
	for(int  j=5; j>=i ; j--)
			{
		System.out.print("*");
			}
		System.out.println("");
			}
		}
	public void pattern3()
	{
		for(int i=1 ; i<=5 ; i++)
		{
		for(int  j=1; j<=i ; j++)
			{
				System.out.print(j+"");
			}
			System.out.println("");
			}
		}
	public void pattern4()
	{
		int  k=1;
		for(int  i=1 ; i<=4 ; i++) 
		{
		for(int  j=1; j<i +1 ; j++)
			{
				System.out.print(k++ +" ");
			}
		System.out.println("");
			}
	}

	public static void main(String[] args) 
{
		doubleloopassignment s = new 	doubleloopassignment();
		s.pattern1();	
		System.out.println("");
		s.pattern2();
       System.out.println("");
		s.pattern3();
		System.out.println("");
		s.pattern4();
		System.out.println("");	
}
}
