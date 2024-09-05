import java.util.Scanner;
class N_Fibonacciseries 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int n = scan.nextInt();
		int count=1;
		int a=0;
		int b=1;
		int sum=0;
		for (int c=1;c>=1 ;c++ )
		{
			if (count==n)
			{
			
           System.out.println(count + ")" +sum);
			}
		   
		   a=b;
		   b=sum;
		   sum=a+b;
		   count++;
			
		}
		
	}
}
