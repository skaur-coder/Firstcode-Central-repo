package Superclass;

public class Parentclass {
	
	public Parentclass()
	{
		this(4,7,8);
		System.out.println("Parent default constructor");
	}
	public Parentclass(int a)
	{
		this();
		System.out.println("Parent 1 parameterized constructorr");
	}
	public Parentclass(int a, int b)
	{ 
		this(3);
		System.out.println("Parent 2 parameterized constructorr");
	}
	public Parentclass(int a , int b , int c)
	{
		System.out.println("Parent 3 parameterized constructorr");
	}
}
