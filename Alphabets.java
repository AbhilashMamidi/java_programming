//Write a code for to identify the Alphabets whether it is capital or small user input.
import java.util.Scanner;
class  Alphabets
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		char alphabets = scan.next().charAt(0);
		if (alphabets >=65 && alphabets <=90)
		{
			System.out.println("Capital Alphabet");
		}
		else
		{
			System.out.println("Small Alphabet");
		}
	}
}
