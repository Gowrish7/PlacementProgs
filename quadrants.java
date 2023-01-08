package namedprograms;

import java.util.Scanner;

public class quadrants {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the values for a & b :");
		int a =sc.nextInt();
		int b= sc.nextInt();
		if(a>=0&&b>=0)
		{
			System.out.println("Quadrant I");
		}
		else if(a>=90&&b>=90)
		{
			System.out.println("Quadrant II");
		}
		else if(a>=180&&b>=180)
		{
			System.out.println("Quadrant III");
		}
		else if(a>=270&&b>=270)
		{
			System.out.println("Quadrant IV");
		}
		else if (a==0&&b==0)
		{
			System.out.println("Origin");
		}
		else if (a==0&&b==0)
		{
			System.out.println("Origin");
		}
		else if (a==0&&b!=0)
		{
			System.out.println("Y axis");
		}
		else
		{
			System.out.println("X axis");
		}
	}

}
