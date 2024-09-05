import java.util.Scanner;
class pro2 
{
	public static void main(String[] args) 
	{
		int count=1;
       Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int a= scan.nextInt( );
		System.out.println("Enter the another number");
		int b=scan.nextInt();
		for (int c=1;c<=b ;c++ )
		{
			System.out.println(count + ") " + c);
			count++;
		}
	}
}
