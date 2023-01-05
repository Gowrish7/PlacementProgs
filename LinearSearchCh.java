package array;
import java.util.*;
public class LinearSearchCh {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String[] nameList = new String[n];
		nameList[0]=sc.nextLine();
		for(int  i=0;i<n;i++)
		{
			nameList[i]=sc.nextLine();		
		}
		System.out.println("Enter the name to be searched :");
		String searchName =sc.nextLine();
		//linear search
	for(int i=0;i<n;i++)
	{
		if(nameList[i].contentEquals(searchName)) {
			System.out.println("found @ "+ i);
			System.exit(0);
		}
	}
	System.out.println("Not Found");
	}

}
