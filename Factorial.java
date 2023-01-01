package namedprograms;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =new java.util.Scanner(System.in).nextInt();;
		System.out.println("the factoral of number is:"+facto(num));
	}
	static int facto(int n) {
		if(n==0)
		return 1;
		else
			return n*facto(n-1);	
	}
}