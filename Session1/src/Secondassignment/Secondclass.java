package Secondassignment;
public class Secondclass
{
	public int sum(int a , int b)
	{
		int c;
		c=a+b;
		System.out.println("Result for sum  =" +c);
		return c;
		}
	public int sub(int a , int b)
	{
		int c;
		c=a-b;
		System.out.println("Result for subtraction =" +c);
		return c;
		}
	public int mult(int a , int b)
	{
		int c;
		c=a*b;
		System.out.println("Result for multiplication =" +c);
		return c;
		}
	public int div(int a , int b)
	{
		int c;
		c=a/b;
		System.out.println("Result for divide =" +c);
		return c;
		}
	public static void main(String[] args) 
	{
		Secondclass Calculate=new Secondclass();
		//((((10+2 )+2)-2)*2)/2)
		int sum_result=Calculate.sum(10,2);
		int sum_result2=Calculate.sum(sum_result, 2);
		int sub_result=Calculate.sub(sum_result2, 2);
		int mult_result=Calculate.mult(sub_result,2);
		int div_result=Calculate.div(mult_result, 2);
		System.out.println("Expression result for ((((10+2 )+2)-2)*2)/2) evalutes to " +div_result);

		
		//((((10-2)*2)-2)+2)/2)
		int subresult=Calculate.sub(10, 2);
		int multresult=Calculate.mult(subresult, 2);
		int subresult2=Calculate.sub(multresult, 2);
		int sumresult=Calculate.sum(subresult2, 2);
		int divresult = Calculate.div(sumresult, 2);
		System.out.println("Expression result for ((((10-2)*2)-2)+2)/2) evalutes to "  +divresult);	
	}
		}
	

