import java.util.Scanner;
class Practice 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		int num = scan.nextInt();
		int sum=0;
			int lastdigit=1;
			int product=1;
			while (num!=0)
			{
			
				lastdigit=num%10;
			    sum=sum+lastdigit;
				product=product*lastdigit;
				num=num/10;
			}
			
			if (sum==product)
			{
				System.out.println("its a spy number");
			
			}
			else 
		{
				System.out.println("Its not a spy number");
		}
	}
}
