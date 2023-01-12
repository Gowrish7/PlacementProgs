package array;
import java.util.Arrays;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		String s1, s2;
		char [] str1 = sc.nextLine().toCharArray();
		char [] str2 = sc.nextLine().toCharArray();
		Arrays.sort(str1);
		Arrays.sort(str2);
		if(new String(str1).contentEquals(new String(str2)))
				System.out.println("Anagram");
		else
			System.out.println("Not an anagram");
	}

}
