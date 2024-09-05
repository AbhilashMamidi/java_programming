import java.util.Scanner;
class Sumoffctorialss 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value ");
		int num = scan.nextInt();
		int sum = 0;
		int lastd=0;
		while (num!=0)
		{
			int factorial = 1;
			lstd=num%10;
			num=num/10;
			sum=sum*factorial;
		}
		System.out.println(sum);
	}
}
