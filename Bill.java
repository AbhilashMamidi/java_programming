import java.util.Scanner;
class  Bill
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the bill amount");
		int bill = scan.nextInt();
		if (bill>5000)
		{
			System.out.println(bill-(bill*25)/100);
		}
		else
		{
			System.out.println(bill-(bill*10)/100);
		}
	}
}
