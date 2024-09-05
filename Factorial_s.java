import java.util.Scanner;
class Factorial_s
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner (System.in);
		System.out.println("Enter the number ");
		int a = scan.nextInt();
		int sum=1;
		for (int b=1;b<=a ;b++ )
		{
			sum=sum*b;
		}
			System.out.println(sum);
	}
}
