class practu 

		static void main()
		{
			predicate<int> GetBool = delegate(int val)
			{
				if (val<=0)
				{
					return false;
				}
				else
				{
				 return true;
				}
			};
			Console.write(GetBool(-1));
			}
	

