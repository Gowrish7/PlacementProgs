package namedprograms;

public class Armstrong {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num=370,rem,rev=0,temp;
			temp=num;
			while(num!=0)
			{
				rem=num%10;
				rev=rev+rem*rem*rem;
				num=num/10;
			}
			if(rev==temp)
			{
				System.out.println("the number is a armstrong");
			}
			else
			{
				System.out.println("the number is not a armstrong");
			}
		}
}