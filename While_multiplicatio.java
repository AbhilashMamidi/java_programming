import java.util.Scanner;
class While_multiplicatio
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min range");
		int a = scan.nextInt();
		System.out.println("Enter the max range");
		int b = scan.nextInt();
		System.out.println("Enter the number for multiplication");
        int c = scan.nextInt();
		int e=1;
		while (a<=b)
		{
			if (a%c==0)
			{
				System.out.println((c)+"*"+(e)+"="+(a) );
				e++;
				
			}
			a++;
		}
		
	}
}
