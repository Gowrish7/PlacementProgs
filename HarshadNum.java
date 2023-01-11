package namedprograms;
import java.util.*;
public class HarshadNum {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int Num = sc.nextInt();
		int Sum = 0;
		int temp = Num;
		while (temp!=0)
		{
		int rem = temp%10;
		Sum+=rem;
		temp/=10;
		}
		if(Num%Sum==0){
		System.out.println(Num+"" +"is a Harshad Number");
		}
		else
		{
		System.out.println(Num+" " +"is not a Harshad Number");
		} 
	}
}