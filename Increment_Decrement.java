class Increment_Decrement
{
	public static void main(String[] args) 
	{
		int a = 15;
		int b = --a;
		System.out.println(a);
			System.out.println(b);

			int c = 20;
			int d = ((--c)+(c++));
			System.out.println(c);
			System.out.println(d);

			int e = 10;
			int f = ((++e)-(--e));
			System.out.println(e);
			System.out.println(f);

			int g =12;
			int h = ((g++)+(++g));
			System.out.println(g);
			System.out.println(h);

			int i = 4;
			int j = ((++i)+(i--)-(--i)-(i--));
			System.out.println(i);
			System.out.println(j);


	}
}
