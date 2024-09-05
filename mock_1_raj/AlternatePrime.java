/*
	Write a program to print alternate prime numbers between m and n in descending order
*/
/*
	Write a program to print alternate prime numbers between m and n in descending order
	Ex : m=1
			n=20
			alternate prime numbers = 17 11 5 2
*/
import java.util.Scanner;
class AlternatePrime 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter min(m) range value	:	");
		int m = scan.nextInt();
		System.out.print("Enter max(n) range value	:	");
		int n = scan.nextInt();
		int count=1;
		System.out.print("Alternate prime numbers : ");
		for (int i=n;i>=m ; i-- )
		{
			int fcount=0;
			for (int j=1;j<=i ;j++ )
			{
				if (i%j==0)
				{
					fcount++;
				}
			}
			if (fcount==2)
			{
				if(count%2==0) {
					System.out.print(i+" ");
				} 
				count++;
			}
		}
		System.out.println();
	}
}
// 19 17 13 11 7 5 3 2
