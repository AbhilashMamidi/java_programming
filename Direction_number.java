import java.util.Scanner;
class Direction_number 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
		int dirno = scan.nextInt();
		if (dirno==1)
		{
			System.out.println("east");
		}
		else if (dirno==2)
		{
			System.out.println("west");
		}
		else if (dirno==3)
		{
			System.out.println("north");
		}

		else if (dirno==4)
		{
			System.out.println("south");
		}
		else if (dirno==5)
		{
			System.out.println("northeast");
		}
		else if (dirno==6)
		{
			System.out.println("southwest");
		}
		else 
		{
			System.out.println("okk fine");
		}
	}
}
