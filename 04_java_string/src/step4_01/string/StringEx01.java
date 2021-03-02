package step4_01.string;

import java.util.Scanner;

public class StringEx01 {
	/*
	 * 
	 * 문자열 입력
	 * 
	 * 1) next() : 공백을 기준으로 한단어만 입력받는다.
	 * 2) nextLine() : enter입력전까지 전체를 입력 받는다.
	 * 
	 *  nextLine()은 버퍼관련 이슈가 생길 수 있으니 버퍼를 정리해 주어야 한다.
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		//String name = scan.next(); //띄어쓰기를 제외한 문자열을 입력받는다.
		String name = scan.nextLine(); // 띄어쓰기 까지 인식한다.
		System.out.println("name : "  + name);
		scan.close();
		
		//버퍼 관련이슈
		System.out.println("나이를 입력하세요 : ");
		int age = scan.nextInt();
		System.out.println("age = " + age);
		scan.nextLine(); //버퍼에 enter를 제거
		System.out.println("특이사항을 입력하세ㅔ요 : ");
		String comment = scan.nextLine();
		System.out.println("comment :" + comment);
			
	}

}
