package day04;

public class NestingForStarEx01 {

	public static void main(String[] args) {
		/*
		 * *******
		 * *******
		 * *******
		 * *******
		 * *******
		 */
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <=7 ; j++) { // 가로
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
