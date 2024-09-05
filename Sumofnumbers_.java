import java.util.Scanner;
class  Sumofnumbers_
{
	public static void main(String[] args) 
	{
		Scanner scan =  new Scanner(System.in);
		int sum = 0;
		for (int a=1;a>1 ;a++ )
		{
         int b =scan.nextInt();
		 char ch = scan.next().charAt(0);
		 if (ch=='+')
		 {
			  sum=sum+b;
		 }
			else if (ch=='=')
		   {
			   sum=sum+b;
            System.out.println(sum);
			break;
		   }
		}
		
	}
}
