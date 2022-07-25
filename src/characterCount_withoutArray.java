
public class characterCount_withoutArray {

	public static void main(String[] args) {

		String str = "alpha Beta Delta Gamma ";
		int count;
		int i, j = 0;
		String test = "";
		char somechar = ' ';
		char keywo = 'a';
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == somechar) {
				System.out.println(test);
				count = 0;
				for (j = 0; j < test.length(); j++) {
					if (test.charAt(j) == keywo) {
						count++;
					} else {
						continue;
					}
				}
				System.out.println(count);
				test = "";
			}

			else {
				test = test + str.charAt(i);
			}
		}
	}
}
