import java.util.Scanner;
class Productof_naturalnumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min range value");
		int a = scan.nextInt();
		System.out.println("Enter the max  range value");
		int b = scan.nextInt();
		int sum = 1;
		for (int c=a;c<=b ;c++ )
		{
			sum=sum*c;
		}
		System.out.println(sum);
	}
}
