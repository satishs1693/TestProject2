import java.util.Scanner;

public class SumofStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total = 0;
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		for (int i = 0; i < input.length(); i++) {
			total = total + Integer.parseInt(input.charAt(i) + "");
		}
		System.out.println(total);
	}
}
