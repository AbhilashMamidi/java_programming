class Pattern2 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=4 ;a++ )
		{
			for (int b=1;b<=5 ;b++ )
			{
				if (a==2 && b==2)
				{
					System.out.print("@");
				}
				else
				{
					System.out.print("*");
				}
			}
		
	        	System.out.println();
		}
	}
}
