import java.util.Scanner;
import java.util.StringTokenizer;

public class IpValidator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String s1=in.nextLine();
		int i =0;
		StringTokenizer st = new StringTokenizer(s1,".");
		while (st.hasMoreElements()) {
			if ( st instanceof StringTokenizer)
			System.out.println(st.nextElement().getClass().getTypeName());
		}
	}
}
