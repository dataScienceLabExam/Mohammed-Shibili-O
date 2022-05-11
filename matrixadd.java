package shibili;
import java.util.*;
public class array {
	public static void main(String[] args)
	{
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		Scanner s=new Scanner(System.in);
		System.out.println("first matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.println("enter the number at position "+i+","+j);
			a[i][j]=s.nextInt();
			}
		}
		
	
		System.out.println("second matrix");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.println("enter the number at position "+i+","+j);
			b[i][j]=s.nextInt();
			}
		}
		System.out.println("first matrix = ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(a[i][j]);
			System.out.print("\t");
			}
			System.out.print("\n");
		}
		System.out.println("second matrix = ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(b[i][j]);
			System.out.print("\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("sum = ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			System.out.print(c[i][j]);
			System.out.print("\t");
			}
			System.out.print("\n");
		}
	}

}
