class Polyndromenumber 
{
	public static void main(String[] args) 
	{
		//for (int a=100;a<=200 ;a++)
		//{
			int num=101;
			int lstd=0;
			int reverse=0;
			int temp=num;
			while (num!=0)
			{
				lstd=num%10;
			    reverse=(reverse*10)+lstd;
				num=num/10;
			}
			num=temp;
			
		if (reverse==num)
		{
		
		System.out.println("true");
		}
		else 
		{
			System.out.println("Its not a ");
		}
		//}
	}
}
