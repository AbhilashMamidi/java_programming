import java.util.Scanner;
class Primecount 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		//System.out.println("Enter the min value");
		//int a = scan.nextInt();
		System.out.println("Enter the max value");
		int b = scan.nextInt();
		int count = 0;
		for (int c=1;c<=b ;c++ )
		{
			if (b%c==0)
			{
				
				//System.out.println(c);
					count++;
			}
		}
			if (count==2)
			{
				System.out.println("prime number");
			
		}
		else
		{
         System.out.println("Not prime number");
		}
		
	}
}
