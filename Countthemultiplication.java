import java.util.Scanner;
class Countthemultiplication 
{
	public static void main(String[] args) 
	{
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the value ");
		int a = scan.nextInt();
		System.out.println("Enter the value");
		int b = scan.nextInt();
		System.out.println("Enter the multiplication number ");
		int c = scan.nextInt();
		int count=0;
		for (int d=a;d<=b ;d++)
		{
			if (d%c==0)
			{
				System.out.println(d);
				count++;
				
			}
		}
		System.out.println( count );
		
	}
}
