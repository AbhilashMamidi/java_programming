import java.util.Scanner;
class  Simplecaluculator
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your choice");
        System.out.println("\nEnter 1 For aaddition");
		System.out.println("Enter 2 For substraction");
		System.out.println("Enter 3 For  multiplication");
		System.out.println("Enter 4 For division");
		System.out.println("Enter 5 For division");
		System.out.println("\nEnter your choise");
		int choise = scan.nextInt();
		switch (choise)
		{
		case 1:
			System.out.println("Enter the value");
			double n1 = scan.nextDouble();
			System.out.println("emyter another value");
			double n2 = scan.nextDouble();
			System.out.println("summation of "+n1+ "and "+n2+ " is: "+(n1+n2));
			break;
		case 2:System.out.println("Enter the value");
		double n3 = scan.nextDouble();
        System.out.println("Enter the value");
		double n4 = scan.nextDouble();
		System.out.println("subtracyion of "+n3+ "and "+n4+ " is: "+(n3-n4));
        break;
		case 3:System.out.println("Enter the value");
		double n5 = scan.nextDouble();
		System.out.println("Enter the value");
		double n6 = scan.nextDouble();
		System.out.println("multiplication of "+n5+ "and "+n6+ " is: "+(n5*n6));
        break;
		case 4:System.out.println("Enter the value");
		double n7 = scan.nextDouble();
		System.out.println("Enter the value");
		double n8 = scan.nextDouble();
		System.out.println("summation of "+n7+ "and "+n8+ " is: "+(n7/n8));
        break;
		case 5:System.out.println("Enter the value");
		double n9 = scan.nextDouble();
		System.out.println("Enter the value");
		double n10 = scan.nextDouble();
        System.out.println("summation of "+n9+ "and "+n10+ " is: "+(n9%n10));
         break;
		default:System.out.println("Enter the corect value");
		

		}
		
	}
}
