package namedprograms;

public class reversenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1231,rem=0,rev=0;
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("The reversed numbers are:"+rev);
	}

}
