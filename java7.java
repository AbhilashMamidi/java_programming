import java.util.Scanner;
class  java7
{
	public static void main(String[] args) 
	{
		int count=1;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min value");
		int a = scan.nextInt();
		System.out.println("Enter the max value");
		int b=scan.nextInt();
		for (int c=1;c<=b ;c++ )
		{
			System.out.println(count + ")" +c);
			count++;
		}

	}
}
