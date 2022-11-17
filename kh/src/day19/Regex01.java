package day19;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex01 {

	public static void main(String[] args) {
		/* 이메일 주소를 입력받아 이메일 형식이 맞는지 확인하는 코드를 작성하세요. */
		Scanner sc = new Scanner(System.in);
		System.out.print("이메일 주소를 입력 하세요>>");
		String email = sc.next();
		String regex = "[a-zA-Z0-9\\-_]+@[a-zA-Z0-9\\-]{2,}+(\\.[a-zA-Z]+){1,2}";
		// [a-zA-Z0-9\-_]+@[a-zA-Z0-9\-]{2,}+(\.[a-zA-Z]+){1,2}
		if(Pattern.matches(regex, email)) {
			System.out.println("이메일 형식입니다.");
		}else {
			System.out.println("이메일 형식이 아닙니다.");
		}
	}

}
