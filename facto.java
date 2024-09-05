import java.util.Scanner;
class facto 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number!");
		int a = scan.nextInt();
         	System.out.println("Enter the number!");
		int b = scan.nextInt();

		int sum =1;
		for (int c=a;c<=b ;c++ )
		{
			sum=sum*c;
		}
			System.out.println( sum);
	}
}
