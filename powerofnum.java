package namedprograms;

public class powerofnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base =2;
		int expo = 3;
		int res=1;
		while(expo!=0)
		{
			res =(int) (res*base);
			expo --;
		}
		System.out.println("The power of the number is:"+res);
	}

}
