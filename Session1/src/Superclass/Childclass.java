package Superclass;

public class Childclass extends Parentclass
{
	public Childclass()
{
		super(1,2);
	System.out.println("Child default constructor");
}
	public Childclass(int a)
	{
		this(4,6,5);
		System.out.println("Child 1 parameterized constructor");
	}
	public Childclass(int a , int b)
	{
		this(1);
		System.out.println("Child 2 parameterized constructor");
	}
	public Childclass(int a , int b, int c)
	{
		this();
		System.out.println("Child 3 parameterized constructor");
	}
	public static void main(String[] args) 
	{
		Childclass assignment = new Childclass(10,2);
	}
	}


