package shibili;
import java.util.*;
public class overload {
	void area(int a){
		int square=a*a;
		System.out.println("area of square="+square);
	}
void area(float a , float b){
	float rect=a*b;
	System.out.println("area of rectangle="+rect);
	
}
void area(double r){
	System.out.println("area of circle="+3.14*r*r);
	
}
public static void main(String[] args){
	Scanner scn=new Scanner(System.in);
	System.out.print("enter side of square:");
	int c=scn.nextInt();
	System.out.print("enter side of rectangle:");
	int l=scn.nextInt();
	int b=scn.nextInt();
	System.out.print("enter radius of circle:");
	double r=scn.nextDouble();
	overload obj=new overload();
	obj.area(c);
	obj.area(l,b);
	obj.area(r);
	
}
}
