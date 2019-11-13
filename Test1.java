import java.util.Scanner;
import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);		
		System.out.println("Input position:");	
		String positions = in.nextLine();		//input of the position "010100110"
		System.out.println("Input array:");
		String str = in.nextLine();			//input array of Strings
		String[] start = str.split(" ");		//slicing in array
		ArrayList<String> a = new ArrayList<>();
		for(int i = 0; i < positions.length(); i++) {
			if(positions.charAt(i) == '0')		//if position = 0, skip it
				continue;
			else {
				a.add(start[i]);		//if position = 1, add the string into array
			}
		}
		System.out.println(a);				//output of final array
	}

}
