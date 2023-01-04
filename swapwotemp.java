package namedprograms;

import java.util.Scanner;

public class swapwotemp {
			public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter 2 nums");
			int a = sc.nextInt();
			int b = sc.nextInt();
			a=a+b;
			b=a-b;
			a=a-b;
			System.out.println("the swapped num are"+a + b );
			}
	}