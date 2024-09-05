import java.util.Scanner;
class Hcf 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int a =scan.nextInt();
		System.out.println("Enter the number");
		int b=scan.nextInt();
		//Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int d =scan.nextInt();
		System.out.println("Enter the number");
		int e=scan.nextInt();
		int hcf=0;
		for (int c=1;c<=b ;c++ )
		{
			if (a%c==0 && b%c==0 && d%c==0 && e%c==0)
			{
				hcf = c;
			
			}
		}
		System.out.println(hcf);
		
	}
}
