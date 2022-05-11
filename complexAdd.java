package shibili;
import java.util.*;
public class complexAdd {
	public static void main(String []args)
	{
	int r1,r2,r3,i1,i2,i3;
	Scanner scn=new Scanner(System.in);
	System.out.println("enter the real part of first");
	r1=scn.nextInt();
	System.out.println("enter the imaginary part of first");
	i1=scn.nextInt();
	System.out.println("1st="+r1+"+"+i1+"i");
	System.out.println("enter the real part of second");
	r2=scn.nextInt();
	System.out.println("enter the imaginary part of second");
	i2=scn.nextInt();
	System.out.println("2nd="+r2+"+"+i2+"i");
	r3=r1+r2;
	i3=i1+i2;
	System.out.println("added num="+r3+"+"+i3+"i");
	}
}
