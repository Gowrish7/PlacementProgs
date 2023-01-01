package namedprograms;
import java.util.Scanner;
public class SumInRange {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int a = sc.nextInt();
		int b = sc.nextInt();
//		System.out.println("Enter the Starting range");
//		a=sc.nextInt();
//		System.out.println("Enter the Ending range");
//		b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
	}

}
