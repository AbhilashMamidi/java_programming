import java.util.Scanner;
class Strongnumbersrange 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the number");
		int b = scan.nextInt();
		System.out.println("Enter the another number");
		int c = scan.nextInt();
		int count=1;
		for (int a=1;a<=c ;a++ )
	   {
         int temp=a;
		 int sum=0;
		 int lastdigit=0;
		 while (a!=0)
		 {
			 lastdigit=a%10;
			 int factorial=1;
			 for (int i=1;i<=lastdigit ;i++ )
			 {
				 factorial=factorial*i;
			 }
			 sum=sum+factorial;
			 a=a/10;
		 }
	    a=temp;
	   if (sum==a)
	   {
	   System.out.println(count+ ")" +a);
		count++;
	   }
	   }
	}
}
