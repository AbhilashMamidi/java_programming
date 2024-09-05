import java.util.Scanner;
class Sumoffctorials_
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
			lastd=num%10;
			int a=1;
			while (a<lastd)
			{
				a++;
				factorial=factorial*a;
				System.out.println(a);
			}
			num=num/10;
			sum=sum+factorial;

		}
		System.out.println(sum);
	}
}
