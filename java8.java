import java.util.Scanner;
class  java8
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enyter the min value");
		int a = scan.nextInt();
		System.out.println("Enter the max value");
        int b = scan.nextInt();
		for (int c=1;c<=b ;c++ )
		{
			if (c%2==0)
			{
				System.out.println(c);
			}
		}
	}
}
