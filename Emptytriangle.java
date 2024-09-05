import java.util.*;
class Emptytriangle 
{
	public static void main(String[] args) 
	{  Scanner scan=new Scanner(System.in);
	System.out.println("enter number");
	 int n=scan.nextInt();
		for (int i=1;i<=n ;i++ )
		{
			for (int j=i;j<=n;j++)
			{  
				System.out.print("   ");
			}
			for (int k=1;k<=(2*i-1) ;k++ )
			{
				if (i==n||k==1||k==(2*i-1))
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			
			System.out.println();
		}
	}
}