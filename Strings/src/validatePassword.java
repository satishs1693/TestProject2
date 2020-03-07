import java.util.Scanner;

public class validatePassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		int k=s1.length();
		
		if(k >=6 && s1.matches(".*[@_#]{1}.*") &&s1.matches("^[^@_#0-9].*") && s1.matches(".*[^@_#]$") ) {
			System.out.println("Hello World");
		}
		
		
		
		
	}

}
