package namedprograms;

public class lcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50,b=60;
		int g=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0&&b%i==0) {
				g=i;
			}
		}
		int lcm = (a*b)/g;
		System.out.println("the lcm of numbers  is="+lcm);
	}

}
