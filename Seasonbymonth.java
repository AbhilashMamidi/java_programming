import java.util.Scanner;
class Seasonbymonth 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the month number");
		int month = scan.nextInt();
		switch (month)
		{
		case 3: case 4: case 5: System.out.println("Summer");
		break;
		case 6: case 7: case 8: System.out.println("Rainy");
		break;
		case 9: case 10: case 11: System.out.println("Spring");
		break;
        case 12: case 1: case 2: System.out.println("Winter");
		break;
		default: System.out.println("Error");
	
		
		}

	}
}
