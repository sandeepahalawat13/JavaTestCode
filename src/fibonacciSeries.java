import java.util.Scanner;

public class fibonacciSeries {

	public static void main(String[] args) {
		int i, j;
		System.out.println("Enter length of the Fibonacci Series");
		@SuppressWarnings("resource")
		Scanner testNumber = new Scanner(System.in);
		int testno = testNumber.nextInt();
		int arr1[] = new int[testno];
		System.out.println("Enter length of the Fibonacci Series" + testno);
		for (i = 2; i < testno; i++) {
			arr1[0] = 0;
			arr1[1] = 1;
			arr1[i] = arr1[i - 1] + arr1[i - 2];
		}
		for (j = 0; j < arr1.length; j++) {
			System.out.print(arr1[j] + ", ");
		}

	}

}
