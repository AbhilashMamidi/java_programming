import java.util.Scanner;
class  Perfectnumbers
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the value");
	    int n = scan.nextInt();
		int sum=0;
		 for (int i=1;i<n ;i++ )
		 {
			if (n%i==0)
			{
			sum=sum+i;
			}
		}
			if (sum==n)
			{
				System.out.println(n+ "Its a perfect number");
			}
			else
			{
				System.out.println( n+ "Its not a perfectnumber");
			}
		
	}
}
