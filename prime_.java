class prime_ 
{
	public static void main(String[] args) 
	{
		int a=1;
		int primecount=1;
		while (primecount<=100)//the count should start frm 0 only.thats why the count value in the inside the while programme.
		{
			int count = 0;
			for (int b=1;b<=a ;b++ )
			{
				if (a%b==0)
				{
					count++;
				}
			}
			if (count == 2)
			{
             System.out.println(primecount+") " +a);
			 primecount++;
			}
			a++;
		}
		
	}
}
