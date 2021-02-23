	package Filehandling;
	
	import java.io.File;
	import java.io.FileReader;
	import java.io.BufferedReader;
	//import java.io.FileNotFoundException;
	import java.io. IOException;
import java.util.Scanner;
	
	public class filereader
	{
		
		public void Readdata(int rowno) throws IOException
		{
		
		File f= new File("../Session1/Aafile.txt");
		FileReader fr=new  FileReader(f);
		BufferedReader b=new BufferedReader(fr);
		int a=0;
		String data;
		while((data= b.readLine()) !=null)
		{
			a=a+1;
			if(a==rowno)
			{
				System.out.println(data);
				break;
			}
		}	
		}
		
		public void ReaddataofRange(int rowno,int endrowno) throws IOException
		{
		File f= new File("../Session1/Aafile.txt");
		FileReader fr=new  FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		int i, j ;
		Scanner txt= new Scanner(System.in);
		System.out.println("enter the range value :");
		int rowno1=txt.nextInt();
		System.out.println("enter the range value :");
		int endrow2=txt.nextInt();
		
		for (i=rowno;i<=endrowno;i++)
		{
			System.out.println(i);
		}
		}
		
	public static void main(String[] args) throws IOException
	{
		filereader obj= new filereader();
		obj.Readdata(3);
		obj.Readdata(2);
		obj.Readdata(8);
		System.out.println("");
		
		obj.ReaddataofRange(2, 6);
	}
		}
		
