import java.util.Scanner;
class FoodApplication
{
	static Scanner s=new Scanner(System.in);
	static boolean bo = true;
	public static void main(String[] args)throws Exception 
	{
		do
		{
			System.out.println("\t\tWELCOME TO SWIGGY\n");
		System.out.println("1.kowsiya briyani\n2.star\n3.charminar\n4.A2B\n5.exit");
		int hotel = s.nextInt();

		switch (hotel)
		{
		case 1:{
			System.out.println("\t\t Thank you for selecting kowsiya\n");
			System.out.println("please select your dish\n");
			System.out.println("1.c.briyani\n2.M.briyani\n3.kusuka\n4.egg\n5.exit\n");

			int menu=s.nextInt();
			switch (menu)
			{
			case 1:{
				int per_plate=120;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				
				break;}
			case 2:{
				int per_plate=200;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 3:{
				int per_plate=70;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 4:{
				int per_plate=10;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 5:{
				System.out.println("select from above");

				break;}
			default:{
				System.out.println("Select from above menu");
				break;}
			
			}

			break;}

		case 2:{
				System.out.println("\t\t Thank you for selecting Star briyani\n");
			System.out.println("please select your dish\n");
			System.out.println("1.c.briyani\n2.M.briyani\n3.chicken pakoda\n4.egg rice\n5.exit\n");

			int menu=s.nextInt();
			switch (menu)
			{
			case 1:{
				int per_plate=250;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				
				break;}
			case 2:{
				int per_plate=180;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 3:{
				int per_plate=80;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 4:{
				int per_plate=100;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 5:{
				System.out.println("select from above");

				break;}
			default:{
				System.out.println("Select from above menu");
				break;}
			
			}

			break;}
		case 3:{
				System.out.println("\t\t Thank you for selecting chairminar\n");
			System.out.println("please select your dish\n");
			System.out.println("1.leghorn briyani\n2.M.briyani\n3.Bucket briyani\n4.Bread halwa\n5.exit\n");

			int menu=s.nextInt();
			switch (menu)
			{
			case 1:{
				int per_plate=120;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				
				break;}
			case 2:{
				int per_plate=200;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 3:{
				int per_plate=1000;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 4:{
				int per_plate=30;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 5:{
				System.out.println("select from above");

				break;}
			default:{
				System.out.println("Select from above menu");
				break;}
			
			}

			break;}
		case 4:{	System.out.println("\t\t Thank you for selecting A2B\n");
			System.out.println("please select your dish\n");
			System.out.println("1.V.briyani\n2.MEALS\n3.curd rice\n4.mysore pak\n5.exit\n");

			int menu=s.nextInt();
			switch (menu)
			{
			case 1:{
				int per_plate=200;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				
				break;}
			case 2:{
				int per_plate=100;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 3:{
				int per_plate=90;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 4:{
				int per_plate=300;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 5:{
				System.out.println("select from above");

				break;}
			default:{
				System.out.println("Select from above menu");
				break;}
			
			}
break;}
		case 5:{
				System.out.println("\t\t Thank you for selecting S.S.Hyderbadi\n");
			System.out.println("please select your dish\n");
			System.out.println("1.c.briyani\n2.M.briyani\n3.chicken rice\n4.chicken tandoori\n5.exit\n");

			int menu=s.nextInt();
			switch (menu)
			{
			case 1:{
				int per_plate=220;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				
				break;}
			case 2:{
				int per_plate=350;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 3:{
				int per_plate=270;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 4:{
				int per_plate=170;
				System.out.println("Enter the quantity\n");
				int qty=s.nextInt();
				double bill=per_plate*qty;
				Thread.sleep(2000);
				System.out.println("Your bill is "+bill);
				System.out.println("Select the payment mode\n");
				System.out.println("1.Gpay\n2.paytem\n3.cash on door\n");

				int payment=s.nextInt();

					switch (payment)
					{
					case 1:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}
						break;}
					case 2:{
						System.out.println("Enter the amount");
						int useramount=s.nextInt();
						if (useramount==bill)
						{
							double res=Math.random()*9999+9999;
							int otp=(int)res;
							Thread.sleep(2000);
							System.out.println("your otp is "+otp);
							System.out.println("Enter the otp");
							int userotp=s.nextInt();

							if (otp==userotp)
							{
								System.out.println("\t\tPAYMENT SUCCESS\n U soon recive the order");
							}
							else 
							{
								System.out.println("Payment failed");
							}
						}
						else
						{
							System.out.println("payment failed");
						}

						break;}
					case 3:{
						System.out.println("You can pay once u receive the order");
						break;}
					default:{
						System.out.println("Select from above pay mode");
						break;}
					
					}

				break;}
			case 5:{
				System.out.println("select from above");

				break;}
			default:{
				System.out.println("Select from above menu");
				break;}
			
			}

			break;}
		default:{
			System.out.println("Select from above hotels");
			break;}
		
		}
		}
		while (bo);
		
	}
}
