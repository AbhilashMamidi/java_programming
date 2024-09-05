import java.util.Scanner;
class Resultforgrades 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Result for obtained grade");
		char grade = scan.next().charAt(0);
			if (grade == 'A'|| grade == 'a')
			{
			System.out.println("First rank");
			}
			else if (grade == 'B' || grade == 'b')
			{
				System.out.println("second");
			}
			else if (grade == 'C' || grade == 'c')
			{
				System.out.println("just pass");
			}
			
			else 
		{
				System.out.println("fail");
		}
	}
}
