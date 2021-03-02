package step4_01.string;

// 문자열 관련 데이터 형변환

public class StringEx04 {

	public static void main(String[] args) {
		//[1] 문자열 -> 숫자  	 형변환
		
		String sNum = "10";
		System.out.println(sNum + 1); //글자 101
		//숫자로 바꾸기
		int nNum = Integer.parseInt(sNum); //Integer.parseInt("문자열") 메서드 사용
		System.out.println(nNum + 1); //숫자 11
		
		
		//[2] 숫자   -> 문자열	 형변환
		//2-1 ) + "" 사용
		String str1  = nNum + "";
		System.out.println(str1 + 1);  //문자 101
		//2-2 ) Integer.toString(숫자)
		String str2 = Integer.toString(nNum);
		System.out.println(str2 + 1); //101
		
		
		//[3] String.valueOf(숫자)
		String str3 = String.valueOf(nNum);
		System.out.println(str3 + 1);
		
		//parseInt : 문자열 -> 숫자
		//toString : 숫자   -> 문자열
		
		//참고) 구글에서 ASCII코드표 검색
		//문자 -> 숫자
		char ch1 = 'a';
		int n1 = (int)ch1;
		System.out.println(ch1 + " / " + n1);
		System.out.println();
		
		//숫자 -> 문자
		int n2 = 100;
		char ch2 = (char)n2;
		System.out.println(ch2 + " / " + n2);
		System.out.println();
		
		
		System.out.println((int)'c' + 3);
		System.out.println((char)(n2 + 3)); 
	}

}
