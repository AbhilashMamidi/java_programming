import java.util.Scanner;
class  Even_odd
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the value");
		int value = scan.nextInt();
		if (value%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("odd");
		}
	}
}
