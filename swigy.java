import java.util.*;
class  swigy
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)throws Exception
	{
		System.out.println("\t\t\tselect the hotel");
		System.out.println("1.buhari\n2.a2b\n3.ss hyderabad briyani\n4.star briyani\n");
		int selected_hotel=sc.nextInt();
		switch (selected_hotel)
		{
		case 1:{//buhari
		System.out.println("\t\t\t welcome to buhari");
		System.out.println("select your food\n-----------------------------------");
		System.out.println("1.mutton biriyani\n2.chicken biriyani\n3.chicken65\n");
		int selected_food=sc.nextInt();
		switch (selected_food)
		{
		case 1:{//mutt bir
			double price=340;
		System.out.println("please enter the quantity");
		int quantity=sc.nextInt();
		double bill=quantity*price;
		System.out.println("\t\t\tTotal bill amount"+bill);
		System.out.println("select the payment method\n------------------------ ");
		System.out.println("1.google pay\n2.phn pay");
		int selected_payment=sc.nextInt();
		switch (selected_payment)
		{
		case 1:{//gpay
			System.out.println("connecting to gpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("enterd the wrong otp\n\"order canceled\"");
			}
			else
				System.out.println("entered the wrong amount");
			break;}
		case 2:{//phn pay
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("order confirmed");
				}
				else
					System.out.println("order canceled");
			}
			else
				System.out.println("entered the wrong amount");
		  break;}
		
		}
			break;}
		case 2:{//chick bir
			double price=120;
		System.out.println("please enter the quantity");
		int quantity=sc.nextInt();
		double bill=quantity*price;
		System.out.println("\t\t\tTotal bill amount"+bill);
		System.out.println("select the payment method\n------------------------ ");
		System.out.println("1.google pay\n2.phn pay");
		int selected_payment=sc.nextInt();
		switch (selected_payment)
		{
		case 1:{//gpay
			System.out.println("connecting to gpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("enterd the wrong otp\n\"order canceled\"");
			}
			else
				System.out.println("entered the wrong amount");
			break;}
		case 2:{//phn pay
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("order canceled");
			}
			else
				System.out.println("entered the wrong amount");
		    break;}
			}
			break;}
		case 3:{//chec 65
			double price=80;
		System.out.println("please enter the quantity");
		int quantity=sc.nextInt();
		double bill=quantity*price;
		System.out.println("\t\t\tTotal bill amount"+bill);
		System.out.println("select the payment method\n------------------------ ");
		System.out.println("1.google pay\n2.phn pay");
		int selected_payment=sc.nextInt();
		switch (selected_payment)
		{
		case 1:{//gpay
			System.out.println("connecting to gpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("enterd the wrong otp\n\"order canceled\"");
			}
			else
				System.out.println("entered the wrong amount");
			break;}
		case 2:{//phn pay
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("order canceled");
			}
			else
				System.out.println("entered the wrong amount");
		    break;}
			}

			break;}
		
		}
        break;}
		case 2:{//a2b
			System.out.println("\t\t\t welcome to a2b");
		System.out.println("select your food\n-----------------------------------");
		System.out.println("1.idili\n2.dosa\n3.poori\n");
		int selected_food=sc.nextInt();
		switch (selected_food)
		{
		case 1:{//idili
			double price=40;
		System.out.println("please enter the quantity");
		int quantity=sc.nextInt();
		double bill=quantity*price;
		System.out.println("\t\t\tTotal bill amount"+bill);
		System.out.println("select the payment method\n------------------------ ");
		System.out.println("1.google pay\n2.phn pay");
		int selected_payment=sc.nextInt();
		switch (selected_payment)
		{
		case 1:{//gpay
			System.out.println("connecting to gpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("enterd the wrong otp\n\"order canceled\"");
			}
			else
				System.out.println("entered the wrong amount");
			break;}
		case 2:{//phn pay
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("order confirmed");
				}
				else
					System.out.println("order canceled");
			}
			else
				System.out.println("entered the wrong amount");
		  break;}
		
		}
			break;}
		case 2:{//dosa
			double price=80;
		System.out.println("please enter the quantity");
		int quantity=sc.nextInt();
		double bill=quantity*price;
		System.out.println("\t\t\tTotal bill amount"+bill);
		System.out.println("select the payment method\n------------------------ ");
		System.out.println("1.google pay\n2.phn pay");
		int selected_payment=sc.nextInt();
		switch (selected_payment)
		{
		case 1:{//gpay
			System.out.println("connecting to gpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("enterd the wrong otp\n\"order canceled\"");
			}
			else
				System.out.println("entered the wrong amount");
			break;}
		case 2:{//phn pay
			System.out.println("connecting to phnpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("order canceled");
			}
			else
				System.out.println("entered the wrong amount");
		    break;}
			}
			break;}
		case 3:{//poori
			double price=90;
		System.out.println("please enter the quantity");
		int quantity=sc.nextInt();
		double bill=quantity*price;
		System.out.println("\t\t\tTotal bill amount"+bill);
		System.out.println("select the payment method\n------------------------ ");
		System.out.println("1.google pay\n2.phn pay");
		int selected_payment=sc.nextInt();
		switch (selected_payment)
		{
		case 1:{//gpay
			System.out.println("connecting to gpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("enterd the wrong otp\n\"order canceled\"");
			}
			else
				System.out.println("entered the wrong amount");
			break;}
		case 2:{//phn pay
			System.out.println("connecting to phnpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("order canceled");
			}
			else
				System.out.println("entered the wrong amount");
		    break;}
			}

			break;}
		
		}

			break;}
		case 3:{//ss hyd
			System.out.println("\t\t\t welcome to ss hyderabad");
		System.out.println("select your food\n-----------------------------------");
		System.out.println("1.grill chicken\n2.tandoori\n3.chicken biriyani\n");
		int selected_food=sc.nextInt();
		switch (selected_food)
		{
		case 1:{//grill
			double price=400;
		System.out.println("please enter the quantity");
		int quantity=sc.nextInt();
		double bill=quantity*price;
		System.out.println("\t\t\tTotal bill amount"+bill);
		System.out.println("select the payment method\n------------------------ ");
		System.out.println("1.google pay\n2.phn pay");
		int selected_payment=sc.nextInt();
		switch (selected_payment)
		{
		case 1:{//gpay
			System.out.println("connecting to gpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("enterd the wrong otp\n\"order canceled\"");
			}
			else
				System.out.println("entered the wrong amount");
			break;}
		case 2:{//phn pay
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("order confirmed");
				}
				else
					System.out.println("order canceled");
			}
			else
				System.out.println("entered the wrong amount");
		  break;}
		
		}
			break;}
		case 2:{//tandoori
			double price=420;
		System.out.println("please enter the quantity");
		int quantity=sc.nextInt();
		double bill=quantity*price;
		System.out.println("\t\t\tTotal bill amount"+bill);
		System.out.println("select the payment method\n------------------------ ");
		System.out.println("1.google pay\n2.phn pay");
		int selected_payment=sc.nextInt();
		switch (selected_payment)
		{
		case 1:{//gpay
			System.out.println("connecting to gpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("enterd the wrong otp\n\"order canceled\"");
			}
			else
				System.out.println("entered the wrong amount");
			break;}
		case 2:{//phn pay
			System.out.println("connecting to phnpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("order canceled");
			}
			else
				System.out.println("entered the wrong amount");
		    break;}
			}
			break;}
		case 3:{//chic bir
			double price=120;
		System.out.println("please enter the quantity");
		int quantity=sc.nextInt();
		double bill=quantity*price;
		System.out.println("\t\t\tTotal bill amount"+bill);
		System.out.println("select the payment method\n------------------------ ");
		System.out.println("1.google pay\n2.phn pay");
		int selected_payment=sc.nextInt();
		switch (selected_payment)
		{
		case 1:{//gpay
			System.out.println("connecting to gpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("enterd the wrong otp\n\"order canceled\"");
			}
			else
				System.out.println("entered the wrong amount");
			break;}
		case 2:{//phn pay
			System.out.println("connecting to phnpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("order canceled");
			}
			else
				System.out.println("entered the wrong amount");
		    break;}
			}

			break;}
		
		}

			break;}
		case 4:{//star bir
			System.out.println("\t\t\t welcome to star biriyani");
		System.out.println("select your food\n-----------------------------------");
		System.out.println("1.chetinad chicken masala\n2.mutton kola oorundai\n3.peper chicken\n");
		int selected_food=sc.nextInt();
		switch (selected_food)
		{
		case 1:{//chic mas
			double price=240;
		System.out.println("please enter the quantity");
		int quantity=sc.nextInt();
		double bill=quantity*price;
		System.out.println("\t\t\tTotal bill amount"+bill);
		System.out.println("select the payment method\n------------------------ ");
		System.out.println("1.google pay\n2.phn pay");
		int selected_payment=sc.nextInt();
		switch (selected_payment)
		{
		case 1:{//gpay
			System.out.println("connecting to gpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("enterd the wrong otp\n\"order canceled\"");
			}
			else
				System.out.println("entered the wrong amount");
			break;}
		case 2:{//phn pay
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("order confirmed");
				}
				else
					System.out.println("order canceled");
			}
			else
				System.out.println("entered the wrong amount");
		  break;}
		
		}
			break;}
		case 2:{//kola orr
			double price=600;
		System.out.println("please enter the quantity");
		int quantity=sc.nextInt();
		double bill=quantity*price;
		System.out.println("\t\t\tTotal bill amount"+bill);
		System.out.println("select the payment method\n------------------------ ");
		System.out.println("1.google pay\n2.phn pay");
		int selected_payment=sc.nextInt();
		switch (selected_payment)
		{
		case 1:{//gpay
			System.out.println("connecting to gpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("enterd the wrong otp\n\"order canceled\"");
			}
			else
				System.out.println("entered the wrong amount");
			break;}
		case 2:{//phn pay
			System.out.println("connecting to phnpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("order canceled");
			}
			else
				System.out.println("entered the wrong amount");
		    break;}
			}
			break;}
		case 3:{//peper chic
			double price=345;
		System.out.println("please enter the quantity");
		int quantity=sc.nextInt();
		double bill=quantity*price;
		System.out.println("\t\t\tTotal bill amount"+bill);
		System.out.println("select the payment method\n------------------------ ");
		System.out.println("1.google pay\n2.phn pay");
		int selected_payment=sc.nextInt();
		switch (selected_payment)
		{
		case 1:{//gpay
			System.out.println("connecting to gpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("enterd the wrong otp\n\"order canceled\"");
			}
			else
				System.out.println("entered the wrong amount");
			break;}
		case 2:{//phn pay
			System.out.println("connecting to phnpay server.....");
			Thread.sleep(2000);
			System.out.println("enter the bill amount");
			int user_enter_amount=sc.nextInt();
			if (user_enter_amount==bill)
			{
				int sys_otp=(int)(Math.random()*9999+9999);
				System.out.println("\t\t\tenter the otp\n"+sys_otp);
				int user_otp=sc.nextInt();
				if (user_otp==sys_otp)
				{
					System.out.println("\"order confirmed\"");
				}
				else
					System.out.println("order canceled");
			}
			else
				System.out.println("entered the wrong amount");
		    break;}
			}

			break;}
		
		}

			break;}
		
		}
	}
}