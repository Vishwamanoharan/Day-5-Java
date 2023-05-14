import java.util.Scanner;
class  Perfectno
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		int sum=0;
		System.out.println("Enter the number");
		int num=s.nextInt();
		for (int i=1;i<num ;i++ )
		{
			sum+=i;
		}
		 String res=(num==sum)?"perfect number":"not perfect number";
		 System.out.println(res);
	}
}

class digit_product

{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter a num");
		int num=s.nextInt();
		int digit_product=0;
		for (int i=num;i<num ;i/=10 )
		{
			digit_product*=i%10;
		}
		System.out.println(digit_product);
	}
}

		
		
		
	

