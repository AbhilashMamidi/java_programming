import java.util.Scanner;
class  Sumofnumbers
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number!");
		int num =scan.nextInt();
		int sum = 0;
		int lastdigit = 0;
		while (num!=0)
		{
			lastdigit=num%10;
			sum=sum+lastdigit;
			num=num/10;
		}
		System.out.println("count the sum of "+num+"is : " +sum);
	}
}
