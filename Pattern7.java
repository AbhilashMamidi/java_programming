class Pattern7 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=5 ;a++ )
		{
			for (int b=1;b<=5 ;b++ )
			{
				if (a==2&&b==2||a==2&&b==3||a==2&&b==1||a==2&&b==5)
				{
					System.out.print(" ");
					continue;
				}
					if (a==3&&b==1||a==3&&b==4||a==3&&b==5||a==3&&b==2)
				{
					System.out.print(" ");
					continue;
				}
					if (a==4&&b==1||a==4&&b==3||a==4&&b==4||a==4&&b==5)
				{
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
		
		   System.out.println(" ");
		}
	}
}
