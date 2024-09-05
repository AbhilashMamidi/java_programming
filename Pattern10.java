class Pattern10 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=7 ;a++ )
		{
			for (int b=1;b<=7 ;b++ )
			{
				if (a==b||a+b==8)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		
		System.out.println("");
		}
	}
}
