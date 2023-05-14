import java.util.Scanner;
class Strongnos 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		int num=s.nextInt();
		int temp=num,last=0,sum=0,fact=1;

		while (num>0)
		{
			last=num%10;

			for (int i=1;i<=last ;i++ )
			{
				fact=fact*i;
			}

			sum+=fact;
			num/=10;
			fact=1;
		}
		if (temp==sum)
		{
			System.out.println("It is Strong no.");
		}
		else
		{
			System.out.println("It is not strong no.");
		}

	}
}
