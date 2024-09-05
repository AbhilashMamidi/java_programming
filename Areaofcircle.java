import java.util.Scanner;
class Areaofcircle
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Raduis of circle");
		int a=scan.nextInt();

		System.out.println("Area"+(3.14*a*a));
	}
}
