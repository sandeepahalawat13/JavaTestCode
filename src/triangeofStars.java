import java.util.Scanner;

public class triangeofStars {

	public static void main(String[] args) {

//		System.out.println("Enter the number of level for triangle");
		int i,j;
//		Scanner in = new Scanner(System.in);
//		int levelNo = in.nextInt();
		int levelNo = 4;
		for(i=1; i<=levelNo; i++) {
			for (j = levelNo; j >= i; j--) {
                System.out.print(" ");
            }
			for(j=1; j<= i; j++) {
				System.out.print("*");
				}
				System.out.println();
			}
		}

	}
