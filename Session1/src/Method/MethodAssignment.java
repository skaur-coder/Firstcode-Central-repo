package Method;

public class MethodAssignment 
{
public void method()
{
	this.method3();
	System.out.println("default method");
}
public void method1()
{
	this.method2();
	System.out.println("1 parameterized method");
}
public void method2()
{
	this.method4();
	System.out.println("2 parameterized method");
}
public void method3()
{
	System.out.println("3 parameterized method");
}
public void method4()
{
	this.method();
	System.out.println("4 parameterized method");
}
public static void main(String[] args)
{
	MethodAssignment method=new MethodAssignment();
	method.method1();
}
}
	