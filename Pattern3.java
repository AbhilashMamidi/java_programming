class Pattern3 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=5 ;a++ )
		{
			for (int b=1;b<=6 ;b++ )
			{
				if (a==1 && b==1)
				{
					System.out.print("@");
					continue;
				}
				if (a==5 && b==1)
				{
					System.out.print("?");
					continue;
				}
				if (a==1 && b==6)
				{
					System.out.print("#");
					continue;
				}
				if (a==5&&b==6)
				{
					System.out.print("$");
					continue;
				}
				else 
				{
					System.out.print("*");
					continue;

				}
			}
             System.out.println(" ");
		}
		
	}
}
