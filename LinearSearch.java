package array;
import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n =new java.util.Scanner(System.in).nextInt();
		System.out.println("enter the key");
		int k=sc.nextInt();
		int [] arr1 = new int[n];
		for(int i=0;i< n;i++)
		{
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(k==arr1[i])
			{
				System.out.println("Number Matched is "+arr1[i]);
				System.exit(0);
			}
			
		}
			System.out.println("Not found");
	}

}
