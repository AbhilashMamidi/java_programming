 class rngeofpower 
{
	//count the digits in number
	//take the last digit
	//find exponenstialvalue multiply last digit count times
	//give exp value to sum
	//remove the last digit

	public static void main(String[] args) 
	{
		int num=345;
		int count=0;
		int temp=num;
		while (num!=0)
		{
			count++;
			num=num/10;
		}
		num=temp;
		int lstd=0;
		int sum=0;
		while (num!=0)
		{
			int exp=1;
			lstd=num%10;
			for (int a=1;a<=count ;a++ )
			{
				exp=exp*lstd;
			}
				sum=sum+exp;
				num=num/10;
		}
		System.out.println(sum);
	}
}
