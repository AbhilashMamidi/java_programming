import java.util.Scanner;
class Rangeofpower 
{
	public static void main(String[] args) 
	{
		Scanner scan=  new Scanner(System.in);
		System.out.println("Enter the value");
		int num = scan.nextInt();
		int temp=num;
		int count=0;
		while (num!=0)
		{
			count++;
		    num=num/10;
		}
		num=temp;
		int sum=0;
		int lstd=0;
		while (num!=0)
		{
			//int counts=0;
			lstd=num%10;
			//counts=lstd;
			int exp=1;
			for (int a=1;a<=count ;a++ )
			{
				exp=exp*lstd;
			}
			sum=sum+exp;
			num=num/10;
		}
		//num=temp;
		if (temp==sum)
		{
		
		System.out.println("Its a armstrong number");
		}
		else
		{
			System.out.println("Its not a armstrong number");
			
		}

	}
}
