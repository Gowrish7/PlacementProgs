//package namedprograms;
//
//import java.util.Scanner;
//
//public class SumOfN {
//
//		public static void main(String args[]) {
//				// TODO Auto-generated method stub
//				int n,i;
//				Scanner sc = new Scanner(System.in);
//				
//				int sum = 0;
//				System.out.println("enter the number of digits to be added");
//				n = sc.nextInt();
//				System.out.println("enter the digits");
//				int a=sc.nextInt();
//				for(i=1;i<=n;i++)
//				{
//					sum=sum+i;
//					
//				}
//				System.out.println(sum);
//			
//
//		}
//
//	}


package namedprograms;

import java.util.Scanner;

public class SumOfN {

		public static void main(String args[]) {
			int n=new java.util.Scanner(System.in).nextInt();
			System.out.println(n*(n+1)/2);
		}
}
