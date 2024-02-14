package com.pack1;

import java.util.Scanner;

public class ClassB {
	Scanner sc=new Scanner(System.in);
	int fc;
	int fq;
	int vc;
	int vq;
	int cc;
	int cq;
	int mc;
	int mq;
	String frname;
	int frprice;
	int fprice;
	String cosname;
	int cosprice;
	int cprice;
	String maname;
	int maprice;
	int mprice;
	String vegname;
	int vegprice;
	int vprice;
	static int finprice;
	static String out="";
	static int srn;
	void meth1() {
		System.out.println("**********************************************************");
		System.out.println("----------------->WELCOME TO SYED's STORE<----------------");
		System.out.println("**********************************************************");
		System.out.println("==========================================================");
		System.out.println("\t**Available products in the store**\n==========================================================\n\t1)Fruits\n\t2)Vegetables\n\t3)Cosmetics\n\t4)Masala Powders\n\t5)Exit");
		System.out.println("==========================================================");
		System.out.println("Enter your choice(1-5):");
		ClassB aobj1=new ClassB();
		int n;
		
		while(true) {
			n=sc.nextInt();
			if(n>=1 && n<=5) {
				break;
			}
			System.out.println("Enter your correct choice between (1-5):");
		}
		switch(n) {
		case 1:
			System.out.println("--------------------------------------------------");
			System.out.println("S.No| Fruits |    Quantity| Price|\r\n"
					+ "101) Mango------------1kg---Rs.200\r\n"
					+ "102) Apple------------1kg---Rs.250\r\n"
					+ "103) Banana-----------1kg----Rs.50\r\n"
					+ "104) Pineapple--------1kg----Rs.70\r\n"
					+ "105) Papaya-----------1kg----Rs.60");
			System.out.println("Enter the code for the fruit you want (101-105)");
			while(true) {
				fc=sc.nextInt();
				if(fc>=101 && fc<=105) {
					break;
				}
				System.out.println("Enter the correct code for the fruit you want (101-105)");
			}
			switch(fc) {
			case 101:
				frname="Mango           ";
				frprice=200;
				break;
			case 102:
				frname="Apple           ";
				frprice=250;
				break;
			case 103:
				frname="Banana          ";
				frprice=50;
				break;
			case 104:
				frname="Pineapple       ";
				frprice=70;
				break;
			case 105:
				frname="Papaya          ";
				frprice=60;
				break;
			}
			while(true) {
				System.out.println("Enter the Quantity you want(kg):");
				fq=sc.nextInt();
				if(fq>=1) {
					break;
				}
				System.out.println("Enter the Quantity you want(kg)(postive value):");
			}
			fprice=(fq)*(frprice);
			System.out.println("If you want continue press 1 else If you want exit press any value:");
			int temp=sc.nextInt();
			if(temp==1) {
				aobj1.meth2(fprice,frname,fprice,temp,fq);
				aobj1.meth1();
			}
			else {
				aobj1.meth2(fprice,frname,fprice,temp,fq);
			}
			break;
			
		case 2:
			System.out.println("--------------------------------------------------");
			System.out.println("S.No|Vegetables |    Quantity| Price|\r\n"
					+ "201) Tomato------------1kg-------Rs.60\r\n"
					+ "202) Spinach-----------1Bundle---Rs.20\r\n"
					+ "203) Beetroot----------1kg-------Rs.50\r\n"
					+ "204) Potato------------1kg-------Rs.35\r\n"
					+ "205) Brinjal-----------1kg-------Rs.45");
			System.out.println("Enter the code for the Vegetables you want (201-205)");
			while(true) {
				vc=sc.nextInt();
				if(vc>=201 && vc<=205) {
					break;
				}
				System.out.println("Enter the correct code for the fruit you want (201-205)");
			}
			switch(vc) {
			case 201:
				vegname="Tomato          ";
				vegprice=60;
				break;
			case 202:
				vegname="Spinach         ";
				vegprice=20;
				break;
			case 203:
				vegname="Beetroot        ";
				vegprice=50;
				break;
			case 204:
				vegname="Potato          ";
				vegprice=35;
				break;
			case 205:
				vegname="Brinjal         ";
				vegprice=45;
				break;
			}
			while(true) {
				System.out.println("Enter the Quantity you want(kg):");
				vq=sc.nextInt();
				if(vq>=1) {
					break;
				}
				System.out.println("Enter the Quantity you want(kg)(postive value):");
			}
			vprice=vq*vegprice;
			System.out.println("If you want continue press 1 else If you want to exit press any value:");
			int temp1=sc.nextInt();
			if(temp1==1) {
				aobj1.meth2(vprice,vegname,vprice,temp1,vq);
				aobj1.meth1();
			}
			else {
				aobj1.meth2(vprice,vegname,vprice,temp1,vq);
			}
			break;
		case 3:
			System.out.println("--------------------------------------------------");
			System.out.println("S.No|Cosmetics |    Quantity| Price|\r\n"
					+ "301) Kajal------------1----Rs.50\r\n"
					+ "302) Lip stick--------1----Rs.20\r\n"
					+ "303) Nail polish------1----Rs.30\r\n"
					+ "304) Face Powder------1----Rs.70\r\n"
					+ "305) Lotion-----------1----Rs.120");
			System.out.println("Enter the code for the Cosmetics you want (301-305)");
			while(true) {
				cc=sc.nextInt();
				if(cc>=301 && cc<=305) {
					break;
				}
				System.out.println("Enter the correct code for the Cosmetics you want (301-305)");
			}
			switch(cc) {
			case 301:
				cosname="Kajal           ";
				cosprice=50;
				break;
			case 302:
				cosname="Lip stick       ";
				cosprice=20;
				break;
			case 303:
				cosname="Nail polish     ";
				cosprice=30;
				break;
			case 304:
				cosname="Face powder     ";
				cosprice=70;
				break;
			case 305:
				cosname="Lotion          ";
				cosprice=120;
				break;
			}
			while(true) {
				System.out.println("Enter the Quantity you want:");
				cq=sc.nextInt();
				if(cq>=1) {
					break;
				}
				System.out.println("Enter the Quantity you want(postive value):");
			}
			cprice=cq*cosprice;
			System.out.println("If you want continue press 1 else If you want to exit press any value:");
			int temp2=sc.nextInt();
			if(temp2==1) {
				aobj1.meth2(cprice,cosname,cprice,temp2,cq);
				aobj1.meth1();
			}
			else {
				aobj1.meth2(cprice,cosname,cprice,temp2,cq);
			}
			break;
		case 4:
			System.out.println("--------------------------------------------------");
			System.out.println("S.No|Masal Powders |    Quantity| Price|\r\n"
					+"401) Curry Powder----------1----Rs.50\r\n"
					+"402) Sambar Powder---------1----Rs.20\r\n"
					+"403) Rasam Powder----------1----Rs.30\r\n"
					+"404) Garam Masala----------1----Rs.70\r\n"
					+"405) Puliogare Powder------1----Rs.120");
			System.out.println("Enter the code for the Masala powders you want (401-405)");
			while(true) {
				mc=sc.nextInt();
				if(mc>=401 && mc<=405) {
					break;
				}
				System.out.println("Enter the correct code for the Masala powders you want (401-405)");
			}
			switch(mc) {
			case 401:
				maname="Curry Powder    ";
				maprice=50;
				break;
			case 402:
				maname="Sambar Powder   ";
				maprice=20;
				break;
			case 403:
				maname="Rasam Powder    ";
				maprice=30;
				break;
			case 404:
				maname="Garam Powder    ";
				maprice=70;
				break;
			case 405:
				maname="Puliogare Powder";
				maprice=120;
				break;
			}
			while(true) {
				System.out.println("Enter the Quantity you want:");
				mq=sc.nextInt();
				if(mq>=1) {
					break;
				}
				System.out.println("Enter the Quantity you want(postive value):");
			}
			mprice=maprice*mq;
			System.out.println("If you want continue press 1 else If you want to exit press any value:");
			int temp3=sc.nextInt();
			if(temp3==1) {
				aobj1.meth2(mprice,maname,mprice,temp3,mq);
				aobj1.meth1();
			}
			else {
				aobj1.meth2(mprice,maname,mprice,temp3,mq);
			}
			break;
		case 5:
			int temp4=100001;
			if(srn>0) {
				aobj1.meth2(0,"",0,temp4,0);
			}
			System.out.println("Thanks for Shopping");
			break;
		}
			
	}
	void meth2(int a,String s,int pr, int b,int qu) {
		srn++;
		String sr1=Integer.toString(srn);
		String sr2=Integer.toString(pr);
		String sr3=Integer.toString(qu);
		if(b==1) {
			finprice=finprice+a;
			out=out+sr1+"\t"+s+"\t"+sr3+"\t      "+sr2+"\n";
		}
		else if(b==100001) {
			new ClassB().bill(finprice,out);
		}
		else {
			finprice=finprice+a;
			out=out+sr1+"\t"+s+"\t"+sr3+"\t      "+sr2;
			new ClassB().bill(finprice,out);
		}
	}
	
	void bill(int a,String out) {
		double dis = 0;
		if(a>300) {
			dis=(5*a*1.0)/100;
		}
		System.out.println("**********************************************************");
		System.out.println("----------------->WELCOME TO SYED's STORE<----------------");
		System.out.println("**********************************************************");
		System.out.println("==========================================================");
		System.out.println("|Sno|"+"\t"+"|Products|"+"\t    "+"|Quantity|"+"\t     "+"|Price|");
		System.out.println("==========================================================");
		System.out.println(out);
		System.out.println("==========================================================");
		System.out.println("Total bill of purchased items:\t\t"+a+"\r\n"
				+ "You received a discount of 5%:\t\t"+dis+"\r\n"
				+ "Final bill is                :\t\t"+(a-dis)+"\r\n"
				+ "=========Thankyou for Shopping you saved Rs."+dis+"=========");
	}

	
	public static void main(String[] args) {
		ClassB aobj=new ClassB();
		aobj.meth1();
	}
}
