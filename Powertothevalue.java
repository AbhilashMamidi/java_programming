import java.util.Scanner;
class Powertothevalue 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the base value");
		int base = scan.nextInt();
		System.out.println("Enter the power value");
		int power = scan.nextInt();
        int sum = 0;
		int lstd=0;
		while (base!=0)
		{
			int exp=1;
			lstd=base%10;
			int a =1;
			while (a<=power)
			{
				exp=exp*lstd;
				a++;
			}
			sum=sum+exp;
			base = base/10;
		}
		System.out.println(sum);
	}
}
