package shibili;

import java.util.Scanner;

public class symmetric {
public static void main(String[] args)
{
	int flag=1;
int s[][]=new int[3][3];
int t[][]=new int[3][3];
Scanner scn=new Scanner(System.in);
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
	System.out.println("enter the number at position "+i+","+j);
	s[i][j]=scn.nextInt();
}
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
	
	t[j][i]=s[i][j];
}
}
System.out.println("matrix = ");
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
	System.out.print(s[i][j]);
	System.out.print("\t");
	}
	System.out.print("\n");
}
System.out.println("transpose = ");
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
	System.out.print(t[i][j]);
	System.out.print("\t");
	}
	System.out.print("\n");
}
for(int i=0;i<3;i++)
{
	for(int j=0;j<3;j++)
	{
		if(s[i][j]!=t[i][j])
		{
			flag=0;
			break;
		}
	}
	}
if(flag==1)
{
	System.out.println("symmetric ");
}
else
{
	System.out.println("not symmetric ");
}
}
}
