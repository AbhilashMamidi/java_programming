class PolySum 
{
	public static void main(String[] args) 
	{
			for (int i=100;i<=1000;i++ )
			{
				int rev = 0;
				for(int j=i;j!=0;j/=10) {
					rev = rev*j%10;
				}
				if(rev==i) {
					int n =i;
					while(n>9) {
						int sum=0;
						for (int j=n; j!=0;j/ =10)
						{
							sum+=j%10;
						}
						n = sum;
					}
					int fcount=0;
					for (int j=1;j<=n ;j++ )
					{
						if (n%j==0)
						{
							fcount++;
						}
					}
					if (fcount==2)
					{
						System.out.println("Sum of digits untill single digit is "+n+" in number "+i);
					}
				}
			}
	}
}
