package shibili;

import java.util.Scanner;

public class array_search {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		String a[]=new String[10];
		String b=new String();
		int c=0;
		
		System.out.println("enter the string");
		for (int i=0;i<5;i++)
		{
			a[i]=scn.nextLine();
		}
		System.out.println("enter the word to search");
		b=scn.nextLine();
		for(int i=0;i<5;i++)
		{
			c=c+1;
				if(a[i].compareTo(b)==0)
				{
					break;
					
				}
				

		}
		System.out.print("word found at ");
		System.out.println(c);
		
	}

}


