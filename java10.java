class java10 
{
	public static void main(String[] args) 
	{
		//int counts=1;
		for (int a=1;a<=100 ;a++ )
		{
			//int x=a;
			int count=0;
			for (int b=1;b<=a ;b++ )
			{
				if (a%b==0)
				{
					count++;
				}
			}
				if (count==2)
				{
                	System.out.println(a);
					//counts++;
				}
			
		}
	
	}
}
