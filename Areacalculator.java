import java.util.Scanner;
class  Areacalculator
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice");
        System.out.println("\nEnter 1 Find the area of circle");
		System.out.println("Enter 2 Find the area of square");
		System.out.println("Enter 3 Find the area of rectangle");
		System.out.println("Enter 4 Find the area of traingle");
		System.out.println("\nEnter your choise");
		int choise = scan.nextInt();
		if (choise == 1)
		{
			System.out.println("enter the radius");
		double rad = scan.nextDouble();
            System.out.println(3.14*rad*rad);
		}
		else if (choise == 2)
		{

         System.out.println("Enter the side");
         double side = scan.nextDouble();
         System.out.println(side*side);
		}
		else if (choise == 3)
		{
			
			System.out.println("Enter the length");

			double len = scan.nextDouble();
			System.out.println("Enter the breadth");
			double breadth = scan.nextDouble();
			System.out.println(len*breadth);
		}
		else if (choise == 4)
		{
			
			System.out.println("Enter the breadth");
			double breadth = scan.nextDouble();
			System.out.println("Enter the height");
			double h = scan.nextDouble();
			System.out.println(0.5*breadth*h);
		}
		else 
		{
			System.out.println("Give valid information");
		}
	}
}
