import java.util.Scanner;
class While_multiplicationofanynumber 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the min range");
		int a = scan.nextInt();
		System.out.println("Enter the max range");
		int b = scan.nextInt();
		System.out.println("Enter the number for multiplication");
        int c = scan.nextInt();
		while (a<=b)
		{
			if (a%c==0)
			{
				System.out.println(a);
				
			}
			a++;
		}
		
	}
}
