package namedprograms;

public class ConsonantOrNot {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			char ch = new java.util.Scanner(System.in).next().charAt(0);
			if(Character.isLetter(ch)&&!"aeiouAEIOU".contains(""+ch))
				
			{
				System.out.println("Consonant");
			}
			else
			{
				System.out.println("not");
			}
		}

	}