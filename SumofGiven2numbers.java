import java.util.Scanner;
class SumofGiven2numbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number");
		int n1=scan.nextInt ();

		System.out.println("Enter second number");
		int n2=scan.nextInt();

		System.out.println("Sum of "+n1+"and"+n2+"numbers is "+(n1+n2));
	}
}
