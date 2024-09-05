import java.util.Scanner;
class  Graderesults_switch
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Results for the obtained greade");
		char grade = scan.next().charAt(0);
		switch (grade)
		{
		case 'A': case 'a':System.out.println("First rank");
		break;
        case 'B': case 'b':System.out.println("Second rank");
		break;
		case 'C': case 'c':System.out.println("Third rank");
		break;
		case 'D': case 'd':System.out.println("First class");
		break;
		case 'E': case 'e':System.out.println("Fial");
		break;
		default:System.out.println("Entervalid input");
			
		}
	}
}
