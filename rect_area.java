package shibili;
import java.util.*;
public class rect_area {
	int l;
	int b;
rect_area(int x,int y)
{
	l=x;
	b=y;
	}
void area()
{
System.out.println("area="+l*b);
System.out.println("perimeter="+2*(l+b));
}
public static void main(String[] args)
{
	Scanner scn=new Scanner(System.in);
	System.out.println("length1=");
	int i=scn.nextInt();
	scn.nextLine();
	System.out.println("breadth1=");
	int j=scn.nextInt();
	System.out.println("length2=");
	int k=scn.nextInt();
	scn.nextLine();
	System.out.println("breadth2=");
	int l=scn.nextInt();
rect_area rect1=new rect_area(i,j);
rect_area rect2=new rect_area(k,l);
rect1.area();
rect2.area();
}

}
