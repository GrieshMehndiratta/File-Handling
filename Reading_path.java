package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reading_path {
	
	public static void main(String []args) throws IOException {
	
		File f= new File("C:\\Users\\Griesh Mehndiratta\\Demo.txt");
		f.createNewFile();
		f.mkdirs();
		FileReader R=new FileReader(f);
		int Current=R.read();
		while(Current!=-1)
		{
			System.out.print((char)Current);
			Current=R.read();
		}
		R.close();
		
		
	}
}
