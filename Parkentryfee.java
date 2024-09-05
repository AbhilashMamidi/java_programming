import java.util.Scanner;
class Parkentryfee 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the catagory!");
		String fee = scan.next();
		switch (fee)
		{
		case "Male":System.out.println("For male its should be 100rs fee");
		break;
			case "Female":System.out.println("For female its should be 80rs fee");
		break;
			case "Transgender":System.out.println("For transgender its should be 20rs fee");
		break;
			case "Child":System.out.println("For child its should be 10rs fee");
		break;
		case "Senior_citizen":System.out.println("For senior_citizen its should be free");
		break;
		default:System.out.println("Error");

		}
	}
}
