import java.util.Scanner;
class SumOfPerfectSquare 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter min(m) range value	:	");	
		int m = scan.nextInt();
		System.out.print("Enter max(n) range value	:	");
		int n = scan.nextInt();
		int sumOfPerfectSquare = 0;
		int i=1; 
		while
		for (int i=m;i*i<=n ; i++ )
		{
			int square = i*i;
			sumOfPerfectSquare+=square;
			System.out.print(square+"+");
		}
		System.out.println("="+sumOfPerfectSquare);
		int l=1,s=9;
		for (int i=sumOfPerfectSquare;i!=0 ; i/=10 )
		{
			int lastDigit = i%10;
			if (lastDigit>=l)
			{
				l = lastDigit;
			}
			if (lastDigit<=s)
			{
				s = lastDigit;
			}
		}
		System.out.println("Large digit in "+sumOfPerfectSquare+" is :	"+l);
		System.out.println("Small digit in "+sumOfPerfectSquare+" is :	"+s);
		int pow=1;
		for (int i=1;i<=l ;i++ )
		{
			pow*=s;
		}
		System.out.println(s+"^"+l+" = "+pow);
	}
}
