package namedprograms;

public class palindrome {
	public static void main(String[] args) {
	
	int num=1232,rem,rev=0,temp;
	temp=num;
	while(num!=0)
	{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
	}
	if(rev==temp)
	{
		System.out.println("the number is a palindrome");
	}
	else
	{
		System.out.println("the number is not a palindrome");
	}
}

}
