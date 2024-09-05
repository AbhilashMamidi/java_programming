import java.util.Scanner;
class Prime 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number . .. ");
		int n = scan.nextInt();
		int count = 0;
		int reverse=0;
		int lstd=0;
		for (int a=1;a<=n ;a++ )
		{
			if (n%a==0)
			{
				count++;
			}
		}
		while (n!=0)
		{
			lstd=n%10;
			reverse=(reverse*10)+lstd;
			n=n/10;
		}
	 if (count==2)
	 {
		System.out.println(reverse + "its also a prime number . ..");
	 }
	 else 
		{
		 System.out.println(reverse+"its not a prime number");
	 }

	}
}
