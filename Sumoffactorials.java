import java.util.Scanner;
class Sumoffactorials 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
        int num = scan.nextInt();
		int lstd = 0;
		int sum = 0;
		while (num!=0)
		{
			int lstdfc=1;
			lstd=num%10;
			int a=1;
			while (a<lstd)
			{
				a++;
				lstdfc=lstdfc*a;
			}
			
			num=num/10;
			sum=sum+lstdfc;
		}
		System.out.println(sum);
		
		
	}
}
