import java.util.Scanner;
class practice1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
	
		System.out.println("Enter the number");
		int a = scan.nextInt();
		int count =1;
		for (int b=1;b>=1 ;b++ )
		{
			int num=b;
			int lstd=0;
			int reverse=0;
			int temp = num;
			while (num!=0)
			{
				lstd=num%10;
				reverse=(reverse*10)+lstd;
				num=num/10;
			}
			num=temp;
			if (reverse==num)
			{
				//System.out.println(count +") " + reverse);
				count++;
			}
			if (count>a)
			{
				System.out.println(count-1 +") " + reverse);
				break;
			}
		}
	}
}
