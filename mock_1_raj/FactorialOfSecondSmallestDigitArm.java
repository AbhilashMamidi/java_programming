import java.util.Scanner;
class FactorialOfSecondSmallestDigitArm 
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
				sum+=pow
			}
			if (sum==i)
			{
				System.out.println(i);
			}
		}
	}
}
