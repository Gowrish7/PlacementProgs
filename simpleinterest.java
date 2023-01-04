package namedprograms;

import java.util.Scanner;

public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
	        float principal;
	        int rate,num_of_days;
	        double simpleInterest;
	        System.out.println("Enter the Principal amount rate and number of days between payment");
	        principal = sc.nextInt();
	        rate = sc.nextInt();
	        num_of_days= sc.nextInt();
	        simpleInterest = (principal*rate*num_of_days)/100;
	        System.out.println("Simple Interest is= "+simpleInterest);
	}

}
