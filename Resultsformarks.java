import java.util.Scanner;
class  Resultsformarks
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("results for marks");
		int marks = scan.nextInt();
		if (marks>=90 && marks <= 100)
		{
			System.out.println("first rssnk");
		}
		else if (marks>=80 && marks <= 89)
		{
System.out.println("second rssnk");
		}
		else if (marks>70 && marks <= 79)
		{
System.out.println("first class");
		}
		else if (marks>=50 && marks<=69)
		{
			System.out.println("second class");
		}
		else if (marks>=35 && marks<= 49)
		{
			System.out.println("just pass");
		}
		else if (marks>101)
		{
System.out.println("not valid");
		}
		else 
		{
			System.out.println("fail");
		}
	}
}
