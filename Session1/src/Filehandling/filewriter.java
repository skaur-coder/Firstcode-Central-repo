package Filehandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class filewriter
{
	public static void main(String[] args) throws IOException
	{
		int i;
 File f = new File("C:\\Users\\harbhupinder\\Desktop\\writerfile");
 FileWriter fw= new FileWriter(f, true);
 BufferedWriter br = new BufferedWriter(fw);
 br.newLine();
 for(i=0; i<10; i++) 
 {
 br.write("this is my try code ");
 br.newLine();
 //br.write("this is my Second line code ");
 }
 //br.write("this is my Second line code ");
 br.close();
		
	}
}

