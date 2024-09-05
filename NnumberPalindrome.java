import java.util.Scanner;
class NnumberPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the min value");
		int n= scan.nextInt(); 
		int count = 1;
		for (int c=1;c>=1 ;c++ )
		{
			int num=c;
			int lstd=0;
			int reverse=0;
			int temp=num;
			while (num!=0)
			{
				lstd=num%10;
				reverse=(reverse*10)+lstd;
				num=num/10;
			}
			num=temp;
			if (reverse==num)
			{
				System.out.println(count + ")" +reverse);
				
			
			if (count==n)
			{
				//System.out.println(count-1 + ")" +reverse);
				break;
			}
			count++;
			}
		}
	}
}
