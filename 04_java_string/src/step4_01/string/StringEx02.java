package step4_01.string;

import java.util.Scanner;

public class StringEx02 {

	/*
	 * 
	 * 문자열 비교 메서드 equals();
	 * 
	 * - 문자열은  == 로 비교하지 않고 equals()메소드를 이용하여 비교한다.
	 * 
	 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String name = "제임스고슬링"	;
		System.out.println("# 이름을 입력하세요 : ");
		String getName = scan.next();
		
//      문자열에서는 == 사용을 할수 없습니다.		
//		if( name == getName ) System.out.println("==연산자 일치");
		
		if (name.equals(getName)) System.out.println("== 연산자 : 일치");
		else 							 System.out.println("== 연산자 : 불일치");
		
		if(!name.equals(getName)) System.out.println("다르다잉");
		scan.close();
	}

}
