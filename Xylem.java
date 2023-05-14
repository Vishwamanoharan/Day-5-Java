import java.util.Scanner;
class Xylem 
{
	static Scanner s=new Scanner(System.in);
	static boolean b=true;
	public static void main(String[] args) 
	{
		do
		{
		
		System.out.println("Enter the Num");
		int num=s.nextInt();
		int last=num%10;
		int m_sum=0;
		

		num/=10;
		
		
			while(num>9)
		{
			m_sum+=num%10;
			num/=10;

		}

		if (m_sum==(num+last))
		{
			System.out.println("Xylem");
			 b= false;
		}
		else
		{
			System.out.println("not a Xylem");
		}
		}
		while (b);


	}
}
