import java.util.Scanner;
class Exponential 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base value!");
		int a = scan.nextInt();
		System.out.println("Enter the power value");
		int b = scan.nextInt();
		int exp = 1;
		for (int c=1;c<=b ;c++ )
		{
			exp=exp*a;
		}
			System.out.println(exp);
	}
}
