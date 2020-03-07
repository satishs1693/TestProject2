import java.util.Arrays;
import java.util.Scanner;

public class removeTheElement2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = Integer.parseInt(in.nextLine());
		String s1[] = new String[l];
		for (int i = 0; i < l; i++) {
			s1[i] = in.nextLine();
		}
		int k = Integer.parseInt(in.nextLine());
		System.out.println(Arrays.toString(removeElements(s1, k)));
	}
	public static String[] removeElements(String s1[], int k) {
		String[] anotherArray = new String[s1.length - 1];
		if (s1 != null && k < s1.length && k > 0) {
			for (int i = 0, m = 0; i < s1.length; i++) {
				if (k == i)
					continue;
				anotherArray[m++] = s1[i];
			}
		} else
			return s1;
		return anotherArray;
	}
}
