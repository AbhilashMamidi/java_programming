import java.util.Scanner;
class perfect 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the nmber ");
		int a = scan.nextInt();
		int sum=0;
		for (int b=1;b<a ;b++ )
		{
			if (a%b==0)
			{
				sum=sum+b;
			}
		}
			if (sum==a)
			{
				System.out.println(a+ "its a perfectnumber");
			}
			else
			{
				System.out.println(a+ "its not a perfect number");
			}
		
	}
}
