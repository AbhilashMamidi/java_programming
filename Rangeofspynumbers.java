import java.util.Scanner;
class Rangeofspynumbers 
{
	public static void main(String[] args) 
	{
			Scanner scan =  new Scanner(System.in);
			System.out.println("Enter the number");
			int b = scan.nextInt();
			System.out.println("Enter the second value");
		int c= scan.nextInt();
		int count=1;
		for (int a=1;a<=c ;a++ )
		{
			int sum=0;
			int temp=a;
			int product=1;
			int lastdigit=0;

		while (a!=0)
		{
			lastdigit=a%10;
			sum=sum+lastdigit;
			product=product*lastdigit;
			a=a/10;
		}
		a=temp;
		if (sum==product)
		{
			System.out.println(count+")" +a);
			count++;
		}
		
	    }
    }
}
