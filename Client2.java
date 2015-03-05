import java.util.Scanner;
import java.io.*;
public class Client2
{
   public static void main(String args[]) throws IOException
	{  FileReader file=new FileReader("menu1.txt");
		BufferedReader br=new BufferedReader(file);
		String line=br.readLine();
		Tree2 t=new Tree2();
		t.insert("Menu");
		while(line!=null)
		{	  
		     t.insert("\t"+line);
			  line=br.readLine();
		}
		file.close();
		//t.disp1();
		Menu2 o=new Menu2();
		Menu2.disp(t.root);
  		o.gen("Menu",t.root);
		o.disp(t.root);
	}
	
			
	
}
