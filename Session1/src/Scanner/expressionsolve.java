package Scanner;

import java.util.Scanner;

public class expressionsolve 
{
	int x1,x2,x3,x4,x5,x6;
public int sum (int a, int b)
{
int c= a+b;
System.out.println("The value for sum is : " +c);
return c;
}
public int sub(int a, int b)
{
int c= a-b;
System.out.println("The value  for sub is : " +c);
return c;
}
public int mult (int a, int b)
{
int c=a *b;
System.out.println("The value  for mult is :  " +c);
return c;
}
public float div(float a, float b)
{
float c=a /b;
System.out.println("The value  for div is : " +c);
return c;
}
public static void main(String[] args) 
{
	System.out.println("To calculate enter the following values");
	System.out.println("Enter value for x1 :");
	Scanner s =new Scanner(System.in);
	int x1=s.nextInt();
	System.out.println("Enter value for x2 : "); 
	int x2=s.nextInt();
	System.out.println("Enter value for x3 : ");
	int x3=s.nextInt();
	System.out.println("Enter value for x4 : ");
	int x4=s.nextInt();
	System.out.println("Enter value for  x5 : ");
	int x5=s.nextInt();
	System.out.println("Enter value for  x6 : ");
	int x6=s.nextInt();
	
expressionsolve Calculate=new expressionsolve();
//((((x1+x2)-x3)+x4)*x5)/x6)
int sum_result=Calculate.sum(x1, x2);
int sub_result=Calculate.sub(sum_result ,x3);
int sum_result2=Calculate.sum(sub_result,  x4);
int mult_result=Calculate.mult(sum_result2, x5);
float div_result=Calculate.div(mult_result, x6);
System.out.println("Expression result for //((((x1+x2)-x3)+x4)*x5)/x6)evaluates  to " +div_result);

//((((x1*x2)+x3)+x4)-x5)/x6)
int mult_result1=Calculate.mult(x1,  x2);
int sum_result1=Calculate.sum(mult_result1, x3);
int sum_result3=Calculate.sum(sum_result1, x4);
int sub_result1=Calculate.sub(sum_result3, x5);
float div_result1=Calculate.div(sub_result1,  x6);
System.out.println("Expression result for ////((((x1*x2)+x3)+x4)-x5)/x6) evaluates to " +div_result1);
}
}

