import java.util.Scanner;
class Evendigitsingivennumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number !");
		int num = scan.nextInt();
		int lastdigit = 0;
		int sum = 1;
		while (num!=0)
		{
			lastdigit=num%10;
			if (lastdigit%2!=0)
			{
				sum=sum*lastdigit;
			}
			num=num/10;
		} 
		System.out.println("count the sum of even numbers " +num+"is : "+sum);
	}
}
