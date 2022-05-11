package shibili;
import java.util.*;
public class stringsort {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		String a[]=new String[10];
		String temp;
		System.out.println("enter the string");
		for (int i=0;i<5;i++)
		{
			a[i]=scn.nextLine();
		}
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<i+1;j++)
			{
				if(a[i].compareTo(a[j])<0)
				{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		System.out.print("sorted array is ");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
