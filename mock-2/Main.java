import java.util.*;

public class Main 
{
    public static void main(String[] args) 
    {
      int secondSmalDigit = 9;
      int smallDigit = 9;

      int largestDigit = 0;
      int secondlargestDigit =0;
      
      int  product = 1;
      
      int sum = 0;
      
      for (int i=1;i<100;i++)
      {
        int num = i;
        int lstd = 0;
        while(num!=0)
        {
          lstd = num%10;
          int count = 0;
          for (int j=1;j<=lstd;j++)
          {
            if (lstd%j==0)
            {
              count++;
            }
          }
          if(count==2)
          {
            sum=sum+lstd;
          }
          num = num/10;
        }
        num = i;
      }
	
        int lst = 0;
        while(sum!=0)
        {
          lst = sum%10;
          if(lst<=smallDigit)
          {
            secondSmalDigit=smallDigit;
            smallDigit = lst;

          }
          else if(lst<=secondSmalDigit)
          {
            secondSmalDigit=lst;
          }
          if(lst>=largestDigit)
          {
            secondlargestDigit=largestDigit;
            largestDigit = lst;
          }
          else if(lst>=secondlargestDigit)
          {
            secondlargestDigit=lst;
          }
          sum=sum/10;
        }
			System.out.println("the second largest digit: "+secondlargestDigit);
			System.out.println("the second smallest digit: "+secondSmalDigit);
      for(int k=1;k<=secondlargestDigit;k++)
      {
        product = product*secondSmalDigit;
      }
	  System.out.println(product);
    } 
  }