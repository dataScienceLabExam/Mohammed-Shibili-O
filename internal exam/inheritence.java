package fathima;
import java.util.*;
class box{
	int l,b;

	}

class box3d extends box{
	int h;
	box3d(int k,int j,int m){
		l=k;
		b=j;
		h=m;
	}
	void display()
	{
		System.out.println("area="+(l*b));
		System.out.println("volume="+(l*b*h));
	}
}
public class inheritence {
	public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("enter length");
int f=s.nextInt();
System.out.println("enter breadth");
int g=s.nextInt();
System.out.println("enter height");
int h=s.nextInt();
box3d obj=new box3d(f,g,h);
obj.display();
	}

}
