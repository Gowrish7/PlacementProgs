package namedprograms;
import java.util.*;
public class AutomorphicNum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int n=num;
		int sqrt = n*n;
		System.out.println(sqrt);
		int count=0;
		while(n!=0)
		{
		n=n/10;
		count++;
		}
		double rem = sqrt % (Math.pow(10,count));
		if(num==rem)
		{
			System.out.print("Automorphic number");
		}
		else
		{
		System.out.print("Not Automorphic");
		}
		}

	}

