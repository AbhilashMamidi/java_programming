import java.util.Scanner;
class  SquaresOfDigits
{
	//take the last digit
	//find exponenstialvalue multiply last digit count times
	//give exp value to sum
	//remove the last digit
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the digit");
		int num = scan.nextInt();
		System.out.println("emter the power");
		int power = scan.nextInt();
		int sum=0;
		int lstd=0;
		
		while (num!=0)
		{
			lstd=num%10;
			int exp=1;
			int a=1;
			while (a<=power)
			{
				exp=exp*lstd;
				a++;
			}
			sum=sum+exp;
			num=num/10;
		}
			System.out.println(sum);
	}
}
