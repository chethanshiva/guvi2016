import java.util.*;
class hunter40
{
public static void main(String[] args)
{
	int n,sum=0;
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	while(n>0)
	{
		int val=n%10;
		sum+=val;
		n=n/10;
	}
//	System.out.println(sum);
	int n1=sum;
	if(n1>10)
	{
	int sum1=0;
	while(n1>0)
	{
		int val1=n1%10;
		sum1=sum1*10+val1;
		n1=n1/10;
	}
	if(sum==sum1)
		System.out.println("sum of digits of a number is palindrome"); 
	else
	      System.out.println("sum of digits of a number is not palindrome");
	}
	else
	      System.out.println("sum of digits of a number is not palindrome");
}
}
