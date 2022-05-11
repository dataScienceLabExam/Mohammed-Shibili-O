package shibili;
import java.util.*;
public class product {
	int pcode;
	String pname;
	int price;
	public static void main(String[] arg)
	{
		product ob1=new product();
		product ob2=new product();
		product ob3=new product();
		Scanner pro=new Scanner(System.in);
		
		System.out.println("p1 \n");
		ob1.pcode=pro.nextInt();
		pro.nextLine();
		ob1.pname=pro.nextLine();
		ob1.price=pro.nextInt();
		
		System.out.println("p2 \n");
		ob2.pcode=pro.nextInt();
		pro.nextLine();
		ob2.pname=pro.nextLine();
		ob2.price=pro.nextInt();
		
		System.out.println("p3 \n");
		ob3.pcode=pro.nextInt();
		pro.nextLine();
		ob3.pname=pro.nextLine();
		ob3.price=pro.nextInt();
		if(ob1.price<ob2.price && ob1.price<ob3.price)
		{
				System.out.println(ob1.pname+"has lower prize");
			
		}
		else if(ob2.price<ob1.price && ob2.price<ob3.price)
			System.out.println(ob2.pname+" has lower prize");
		else
			System.out.println(ob3.pname+"has lower prize");
		
	}

}
