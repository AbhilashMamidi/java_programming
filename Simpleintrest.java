import java.util.Scanner;
class  Simpleintrest
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Amount");
		int amount = scan.nextInt();

		System.out.println("Enter rate of intrest");
		int rateofintrest = scan.nextInt();

		System.out.println("Enter time");
		int time = scan.nextInt();

		System.out.println("Simple intrest of"+amount+"and"+rateofintrest+"and"+time+"number is :"+(amount*rateofintrest*time)/100);
	}
}
