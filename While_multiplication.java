import java.util.Scanner;
class While_multiplication 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min range");
		int a = scan.nextInt();
		System.out.println("Enter the max range");
		int b = scan.nextInt();
		while (a<=b)
		{
			if (a%8==0)
			{
				System.out.println(a);
				
			}
			a++;
		}
		
	}
}
