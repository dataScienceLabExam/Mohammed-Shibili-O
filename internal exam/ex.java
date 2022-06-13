package fathima;

import java.util.Scanner;
class account extends Exception{
	account(String msg){
		super(msg);
	}
}
public class ex {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int bal=10000;
		int wdr,dep;
		int ch=1;
		do {
			System.out.println("1.withdraw\n 2.deposit\n enter your choice:");
			s.nextLine();
			switch(ch)
			{
			case 1:System.out.println("enter amount to withdraw");
			wdr=s.nextInt();
			bal=bal-wdr;
			try{	
				if(bal<0){
						throw new account("insufficient balance");
				}
				else{
					System.out.println("withdrawed successfully:\n Blanace="+bal);
				}
					
				}
			catch(account e){
				System.out.println(e.getMessage());
		}
			break;
			case 2:System.out.println("enter amount to deposite");
			dep=s.nextInt();
			bal=bal+dep;
			System.out.println("balance ="+bal);
			}
			System.out.println("press 1 for continue");
			ch=s.nextInt();
			
		}while(ch!=1);
	}
}