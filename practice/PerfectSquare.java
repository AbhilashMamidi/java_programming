class PerfectSquare 
{
	public static void main(String[] args) 
	{
		int count=0;
      for (int i =1;i>=1;i++)
      {
        int num = i;
        for(int j=1;j<=num;j++)
        {
          if(j*j==num)
          {
            System.out.println(num+" is the perfect sqre of "+i);
            count++;
          }
		   if (count>10)
			{
				break;
			}
        }
       
      }
	}
}
