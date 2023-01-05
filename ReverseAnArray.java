package array;
import java.util.Scanner;
public class ReverseAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arrSize = sc.nextInt();
		int[] arr = new int[arrSize];
		for(int index = 0 ;index<arrSize;index++)
			arr[index]=sc.nextInt();
		//reversing the array  element
		for(int i=0, j=arrSize-1;i<arrSize/2;i++,j--)
		arr[i] = (arr[i]+arr[j])-(arr[j]=arr[i]);
		//printing the reversed array  elements
		for(int i=0;i<arrSize;i++)
			System.out.println(arr[i]+ " ");
	}

}
