import java.util.Scanner;
class  Eligible_for_marraige
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your male age");
		int maleage = scan.nextInt();
		System.out.println("Enter your female age");
		int femaleage = scan.nextInt();
		if (maleage>23&&femaleage>21)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("not eligible");
		}
	}
}
