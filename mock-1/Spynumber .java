import java.util.Scanner;
class Spynumber
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("enter the nmber");
		int n = scan.nextInt();
		int count=1;
		for (int a=1;a>=1 ;a++ )
		{
		int num=a;
		int temp=num;
		int sum=0;
		int product=1;
		int lastdigit=0;
		while (num!=0)
		{
			lastdigit=num%10;
			sum=sum+lastdigit;
			product=product*lastdigit;
			num=num/10;
		}
		num=temp;
		if (sum==product)
		{
			System.out.println(count+ ") " + num);
			count++;
		}
		if (count>n)
		{
			break;
		}
		
		}
	}
}
