import java.util.Scanner;
class  Even
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min value!");
		int name = scan.nextInt();
		System.out.println("Enter the max value");
			int b = scan.nextInt();
		for (int a=name;a<=b ;a++)

		{
			if (a%2==0)
			{
		
			
			System.out.println(a);
			}
		}
	}
}
