import java.util.Scanner;
import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Input position:");
		String positions = in.nextLine();
		System.out.println("Input array:");
		String str = in.nextLine();
		String[] start = str.split(" ");
		ArrayList<String> a = new ArrayList<>();
		for(int i = 0; i < positions.length(); i++) {
			if(positions.charAt(i) == '0')
				continue;
			else {
				a.add(start[i]);
			}
		}
		System.out.println(a);
	}

}
