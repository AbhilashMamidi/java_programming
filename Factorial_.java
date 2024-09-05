import java.util.Scanner;
class Factorial_ 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value ");
		int a = scan.nextInt();
		System.out.println("Enter the value");
		int b = scan.nextInt();
		int sum = 1;
		for (int c=a;c<=b ;c++ )
		{
			sum=sum*c;
		}
			System.out.println(sum);
	}
}
