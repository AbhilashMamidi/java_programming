import java.util.Scanner;
class Factorialofsum 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value!");
		int num = scan.nextInt();
		int sum=0;
		int lastdigit=0;
		while (num!=0)
		{
			lastdigit=num%10;
			int factorial=1;
			for (int a=1;a<=lastdigit ;a++ )
			{
				factorial=factorial*a;
			}
			sum=sum+factorial;
			num=num/10;
		}
		System.out.println(sum);
	}
}
