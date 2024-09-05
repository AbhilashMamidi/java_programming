import java.util.Scanner;
class Factorstocount 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		int a = scan.nextInt();
		System.out.println("Enter the second value");
		int b = scan.nextInt();
		int count = 0;
		for (int c=a;c<=b ;c++ )
		{
			if (b%c==0)
			{
				System.out.println(c);
				count++;
			}
		}
		System.out.println(count);
	}
}
