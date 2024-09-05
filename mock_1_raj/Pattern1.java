/*					
					A
				B	A	B
			C	B	A	B	C
		D	C	B	A	B	C	D
	
*/
import java.util.Scanner;
class Pattern1 
{

	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int space = n-1;
		int alpha = 1;
		for (int i=1;i<=n ;i++ )
		{
			char x = (char)(64+i);
			for (int j=1;j<=space ;j++ )
			{
				System.out.print("  ");
			}
			for (int j=1;j<=alpha ;j++ )
			{
				System.out.print(x+" ");
				if (j<(alpha/2)+1)
				{
					x--;
				} 
				else {
					x++;
				}
			}
			System.out.println();
			space--;
			alpha+=2;
		}
	}
}
