import java.util.Scanner;
class Nthprimenumber
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the value");
     	int a = scan.nextInt();
    	int count=1;
    	for (int x=1;x>=1 ;x++ )
	 {
		int b=0;
		for (int y=1;y<=x ;y++ )
		{
			if (x%y==0)
			{
				b++;
			}
		}
		    if (b ==2)
			{
			 count++;
			 //System.out.println(count + ") " +x);
			
			
			 if (count==a)
			  {
				 System.out.println(count + ") " +x);
				 count ++;
				 break;
				
				}
			}
    	}
	}
}