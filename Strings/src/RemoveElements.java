import java.util.Scanner;

public class RemoveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int l=Integer.parseInt(in.nextLine());
		String s1[]=new String[l];
		for(int i=0;i<l;i++)	{
			s1[i]=in.nextLine();	
		}
		int k=Integer.parseInt(in.nextLine());
		System.out.println(removeElements(s1,k));
	}
	
	
	public static int removeElements(String s1[],int k) {
		int l = s1.length;
		for (int i = 0; i < s1.length; i++) {
			if(s1[i].length()==k) l--;
		}
		return s1.length;
	}

}
