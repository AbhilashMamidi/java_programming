import java.util.Scanner;
class AverageofGiven5numbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number");
		int n1=scan.nextInt ();

		System.out.println("Enter second number");
		int n2=scan.nextInt();

		System.out.println("Enter third number");
		int n3=scan.nextInt();

		System.out.println("Enter four number");
		int n4=scan.nextInt();

		System.out.println("Enter five number");
		int n5=scan.nextInt();

		System.out.println("Average of "+n1+"and"+n2+"and"+n3+"and"+n4+"and"+n5+"numbers is : "+(n1+n2+n3+n4+n5)/3);
	}
}
