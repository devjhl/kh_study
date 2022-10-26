package day03;

import java.util.Scanner;

public class IfEx05 {

	public static void main(String[] args) {
		/*
		 * 정수 num 가 2의 배수이면 2의 배수라고 출력하고
		 * 3의 배수이면 3의 배수라고 출력하고
		 * 6의 배수이면 6의 배수라고 출력하고
		 * 2,3,6의 배수가 아니면 2,3,6의 배수가 아닙니다라고 출력하는 코드를 작성
		 * 단, 6의 배수는 6의 배수라고만 출력
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배수 입력>>>");
		int num = sc.nextInt();
		if(num % 2 == 0 && num %3 !=0) {
			System.out.println("2의 배수");
		}else if (num % 3 ==0 && num % 2 != 0 ) {
			System.out.println("3의 배수");
		} else if (num % 6 ==0) {
			System.out.println("6의 배수");
		} else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
		
		System.out.println("=============================");
		
		if(num % 6 == 0) {
			System.out.println("6의 배수");
		}else if (num % 3 ==0) {
			System.out.println("3의 배수");
		} else if (num % 2 ==0) {
			System.out.println("2의 배수");
		} else {
			System.out.println("2,3,6의 배수가 아닙니다.");
		}
	}

}
