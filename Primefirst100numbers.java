import java.util.Scanner;
class Primefirst100numbers 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value ");
		int b = scan.nextInt();
		int count2=0;
		for (int i=1;i>=1 ;i++ )
		{
			int count=0;
            for (int a=1;a<=i ;a++ )
            {
				if (i%a==0)
				{
					count++;
				}
            }
			if (count ==2)
			{
				
				count2++;
			}
			if (count2==b)
			{
				System.out.println(count2+") " +i);
				break;
			}
		}
		
	}
}

