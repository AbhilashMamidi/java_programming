import java.util.Scanner;
class Lcmof2numbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int count = 1;
		System.out.println("Enter the value");
		int a=scan.nextInt();
		System.out.println("Enter the aother number");
		int b=scan.nextInt();
		int lcm=0;
		for (int c=a;c<=a*b ;c++ )
		{
			if (c%a==0 && c%b==0 )
			{
				lcm=c;
				break;
			}
		}
		System.out.println(count + ")" +lcm);
		count ++;
	}
}
