import java.util.Scanner;
class FactorialOfSecond
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter min(m) range value	:	");
		int m = scan.nextInt();
		System.out.print("Enter min(n) range value	:	");
		int n = scan.nextInt();
		for (int i=m; i<=n ;i++ )
		{
			int nCount = 0;
			for (int j=i;j!=0 ;j/=10 )
			{
				nCount++;
			}
			int sum = 0;
			for (int j=i;j!=0 ;j/=10 )
			{
				int lastDigit = j%10;
				int pow = 1;
				for (int k=1;k<=nCount ; k++ )
				{
					pow*=lastDigit;
				}
				sum+=pow;
			}
			if (sum==i)
			{
				int s1=9,s2=9;
				for (int j=i;j!=0 ;j/=10 )
				{
					if (s1>=(j%10))
					{
						s2 = s1;
						s1 = j%10;
					}
					else if (s2>=(j%10))
					{
						s2 = j%10;
					}
				}
				int fact = 1;
				for (int j=1;j<=s2 ;j++ )
				{
					fact*=j;
				}
				System.out.println("Second smallest digit in Armstrong Number "+i+" is "+s2+" and factorial of "+s2+" is "+fact);
			}
		}
	}
}
