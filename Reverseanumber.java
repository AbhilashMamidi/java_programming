class Reverseanumber 
{
	public static void main(String[] args) 
	{
		int num=304;
		int reverse=0;
		int lastd=0;
		while (num!=0)
		{
			lastd=num%10;
			reverse=(reverse*10)+lastd;
			num=num/10;
		}
		System.out.println(reverse);
	}
}
