package namedprograms;

public class FactorsOFNum {

	public static void main(String[] args) {
		int n = new java.util.Scanner(System.in).nextInt();
		System.out.println("factors of number"+n+"are");
		for(int i=1;i<=n;i++) 
		{
			if(n%i==0)
				System.out.print(i + " ");
			
		}
	}

}
