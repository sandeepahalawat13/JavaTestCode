public class characterCount_usingArray {

	public static void main(String[] args) {

		String str = "alpha Beta Delta Gamma";
		int count;
		int i, j = 0;
		String[] arr1 = str.split(" ");
		String test;
		char somechar = 'a';
		for (i = 0; i < arr1.length; i++) {
			count = 0;
			test = arr1[i];
			System.out.println(test);
			for (j = 0; j < test.length(); j++) {
				if (test.charAt(j) == somechar) {
					count++;
				} else {
					continue;
				}
			}
			System.out.println(count);
		}
	}
}
