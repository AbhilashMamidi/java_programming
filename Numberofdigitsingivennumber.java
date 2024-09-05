import java.util.Scanner;
class Numberofdigitsingivennumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number!");
		int a = scan.nextInt();
		int count=0;
	//	while (a!=0)
	//	{
	//		count++;
	//		a=a/10;
	//	}
	for (int b=1;b<=a ;b++ )
	{
		count++;
		a=a/10;
		if (a==0)
		{
			break;
		}
	}
		System.out.println("count of digit "+a+"is:" +count);
	}
}
