class PrimeDigit 
{
public static void main(String[] args) 
	{
		for (int i=1;i<=10 ;i++ )
		{
		 int count=0;
		 for (int a=1;a<=i ;a++ )
		 {
		    if (i%a==0)
		   {
			count++;
		    }	    
		  }
		   if (count==2)
		 {
			System.out.println(i);
		 }
		
		}
	}
}
