package Packagesession1;

public class Testing1
{
int age;
int roll_no;
public void display1()
{
	System.out.println("Welcome All");
}
public void display2()
{
	System.out.println("Automation is easy");
}
public static void main(String[] args) {
	{
		Testing1 Student=new Testing1();
		Student.display1();
		Student.display2();
		Student.age=27;
		Student.roll_no=76;
		System.out.println("Student age= "+Student.age);
		System.out.println("Student roll_no="+Student.roll_no);
				}
}
}
