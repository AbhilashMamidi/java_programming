//import java.util.Scanner;
class rangeofarmstrongnumber 
{
	public static void main(String[] args) 
	{
		//Scanner scan= new Scanner(System.in);
		//System.out.println("Enter the number!");
		//int num = scan.nextInt();
		//System.out.println("Enter the second value");
		//int b=scan.nextInt();
		for (int a=1;a<=10000;a++ )
		{
			//int num=a;
			int temp=a;
			int count=0;
			while (a!=0)
			{
				count++;
				a=a/10;
			}
            a=temp;
			int lastd=0;
			int sum=0;
			while (a!=0)
			{
				int exp=1;
				lastd=a%10;
				for (int c=1;c<=count ;c++ )
				{
					exp=exp*lastd;
				}
					sum=sum+exp;
					a=a/10;
				
				
			}
			a=temp;
				if (sum==a)
				{
					System.out.println(a);
				}
		}
	}
}
