import java.util.Scanner;
class  Productofnumbers
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number!");
		int num =scan.nextInt();
		int product = 1;
		int lastdigit = 0;
		while (num!=0)
		{
			lastdigit=num%10;
			product=product*lastdigit;
			num=num/10;
		}
		System.out.println("count the sum of "+num+"is : " +product);
	}
}