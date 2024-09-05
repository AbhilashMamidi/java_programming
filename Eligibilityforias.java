import java.util.Scanner;
class Eligibilityforias 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = scan.nextInt();
		if (age>=21&&age<=31)
		{
			System.out.println("Eligible for exam");
		}
		
			else
		{
				System.out.println("Not Eligible for exam");
		}
	}
}
