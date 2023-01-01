//package namedprograms;
//import java.util.*;
//public class PrimeNumbers {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc= new Scanner(System.in);
//		int n =sc.nextInt();
//		if(n<2)
//		{
//			System.out.println("Not Prime");
//		}
//		else
//		{
//			for(int i=2;i<n;i++)
//			{
//				if(n%i==0)
//{
//				System.out.println("not prime");
//				break;
//				else
//				{
//					System.out.println("prime");
//					break;
//				}
//		}
//	}
//}
package namedprograms;
public class PrimeNumbers
 {
   public static void main (String[]args)
   {
	 int n=new java.util.Scanner(System.in).nextInt();
     int i;
     boolean isprime = true;

     // 0 and 1 are not prime numbers also, negative numbers are not prime
     if (n < 2)
       {
          isprime = false;
       }
     else
       {
          for (i = 2; i < n; i++)
           {
            if (n % i == 0)
             {
              isprime = false;
                  break;
                }
        }
       }

     String result = isprime ? "Prime" : "not Prime";
     System.out.println ("The number " + n + " is : " + result);
   }
 }