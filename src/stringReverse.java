import java.util.Scanner;

public class stringReverse {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the string");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String str = in.next();
		String newstr = "";
		int i;

		for (i = 0; i < str.length(); i++) {
			newstr = str.charAt(i) + newstr;
		}
		System.out.println("Reverse of the string is: "+newstr);

	}

}
