import java.util.Scanner;
class  Volumeofcylinder
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);

		

		System.out.println("enter the raduis of cylinder");
		int r=scan.nextInt();

		System.out.println("Enter the height");
		int h=scan.nextInt();

		System.out.println("Volume"+(3.14*r*r*h));
	}
}
