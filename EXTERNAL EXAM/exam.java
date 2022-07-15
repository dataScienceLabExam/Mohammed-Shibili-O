package shibili;
import java.io.*;
import java.util.Scanner;
public class exam{
	public static void main(String args[]) throws IOException{
		FileInputStream fr = new FileInputStream("C:/Users/Admin/Desktop/shibili/int.txt");
		FileOutputStream fw1 = new FileOutputStream("C:/Users/Admin/Desktop/shibili/even");
		FileOutputStream fw2 = new FileOutputStream("C:/Users/Admin/Desktop/shibili/odd");
		System.out.println("\nCopy Successfull\n");
		int i;
		while((i=fr.read()) != -1){
			if(i%2==0)
				fw1.write(i);
			else
				fw2.write(i);
		}
		fr.close();
		fw1.close();
		fw2.close();
	}
}

