package methodusingsuperandthis;

public class Childclass extends Parentclass
{
public void method()
{
 //super.method3(4, 5, 6);
	//super.method1(4);
	super.method2(5, 8);

	
	System.out.println("Child default method");
}
public void method1(int a)
{
	super.method();
	super.method1(3);
	this.method();
	System.out.println("Child 1 parameterized method");
}
public void method2(int a, int b)
{ 
	this.method3(46, 7, 7);
	System.out.println("Child 2 parameterized method");
}
public void method3(int a, int b, int c)
{
	super.method3(3, 5, 6);
	this.method1(3);
	
	System.out.println("Child 3 parameterized method");
}
public static void main(String[] args)
{
Childclass method =new Childclass();
method.method2(2, 4);
}
}
