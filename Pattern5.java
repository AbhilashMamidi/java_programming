class Pattern5 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=7 ;a++ )
		{
			for (int b=1;b<=7 ;b++ )
			{
				if (a==2&&b==2 || a==2&&b==3|| a==2&&b==4|| a==2&&b==5||a==2&&b==6)
				{
					System.out.print(" ");
					continue;
				}
				if (a==3&&b==2 || a==3&&b==3|| a==3&&b==4|| a==3&&b==5||a==3&&b==6)
				{
					System.out.print(" ");
					continue;
				}
				if (a==4&&b==2 || a==4&&b==3|| a==4&&b==5||a==4&&b==6)
				{
					System.out.print(" ");
					continue;
				}
				//if ( a==4&&b==4)
				//{
				//	System.out.print("*");
				//	continue;

				//}
				if (a==5&&b==2 || a==5&&b==3|| a==5&&b==4|| a==5&&b==5||a==5&&b==6)
				{
					System.out.print(" ");
					continue;
				}
				if (a==6&&b==2 || a==6&&b==3|| a==6&&b==4|| a==6&&b==5||a==6&&b==6)
				{
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
