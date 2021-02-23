package singleloop;

public class table 
{
	public static void main(String[] args) 
	{
		int t=5;
		System.out.println("Print Table for 5");
		for(int i=1; i<=10; i++)
		{
			System.out.println(t+""+ "*" + i + "="+ t*i);
		}
		
		int t2=2;
		int j;
		System.out.println("");
		System.out.println("Print Table for 2");
		for (j=1; j<=10; j++)
		{
			System.out.println(t2+"*"+j+"="+t2*j);
		}
		
		
	}

}
