package namedprograms;

public class sumofdig {
	public static void main(String[] args) {
		int num=12345,sum=0;
		System.out.println("the sum of digits is:"+getsum(num));
	}
	static int getsum(int num) {
		if (num ==0)
		return 0;
		else
			return (num%10)+ getsum(num/10);
		
	}
}
