import java.util.Scanner;
class Rangeofpalindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int b= scan.nextInt();
		System.out.println("Enter the another value");
		int c= scan.nextInt();
		int count=1;
		for (int a=1;a<=c;a++ )
		{
			int num=a;
			int temp=num;
			int reverse=0;
			int lstd=0;
			while (num!=0)
			{
				lstd=num%10;
				reverse=(reverse*10)+lstd;
				num=num/10;
			}
			num=temp;
			if (reverse==num)
			{
				System.out.println(count+ ")" +reverse);
			count++;
			}
		}
			
		
	}
}
