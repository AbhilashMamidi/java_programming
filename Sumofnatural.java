import java.util.Scanner;
class Sumofnatural 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter min the number");
		int a = scan.nextInt();
		System.out.println("Enter the max number");
		int b = scan.nextInt();
		int sum = 0;
		for (int c=a;c<=b ;c++ )
		{
			sum=sum+c;
			System.out.println(sum);
		}

	}
}
