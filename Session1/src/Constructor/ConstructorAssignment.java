package Constructor;

public class ConstructorAssignment
{
public   ConstructorAssignment( )
{
	this(4,8,7,5);
	System.out.println("default constructor");
}
public   ConstructorAssignment(int a)
{
	this();
	System.out.println("1 parameterized constructor");
}
public   ConstructorAssignment(int a , int b)
{
	this(2,4,5);
	System.out.println("2 parameterized constructor");
}
public   ConstructorAssignment(int a ,int b, int c)
{
	this(3);
	System.out.println("3 parameterized constructor");
}
public   ConstructorAssignment(int a , int b, int c, int d)
{
	System.out.println("four parameterized  constructor");
}

public static void main(String[] args)
{
	ConstructorAssignment Constructor=new ConstructorAssignment(10,20);
}
}

