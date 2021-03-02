package step4_01.string;


// 문자열 관련 메서드

public class StringEx03 {

	public static void main(String[] args) {

		String str = "megait";
		System.out.println("원본 : " + str);
		System.out.println("====================================================");
		
		
		
//		[1]   : 문자열의 길이 : length()
		System.out.println("문자열의 길이" + str.length());
		int size = str.length();
		System.out.println("출력 : " + size);
		System.out.println("====================================================");
//		[2]   : 문자 한개 추출 (인덱싱) : charAt(index)
		System.out.println("0번째 인덱스 : " + str.charAt(0));
		System.out.println("1번째 인덱스 : "+str.charAt(1));
		
		System.out.println("ch 에넣고 출력해보기");
		char ch = str.charAt(2);
		System.out.println("ch에 들어있는 값 : " + ch);
		System.out.println("마지막 인덱스의 값");
		System.out.println(str.charAt(str.length() - 1));
		
		System.out.println("FOR 문으로 하나씩 출력해보기");
		for(int i = 0 ;i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println("====================================================");
//		[3]   : 문자 여러개 추출 (슬라이싱) : substring()
		System.out.println( "0부터 3 " );
//				[3-1] : substring(index1이상 index2미만)
		System.out.println(str.substring(0, 4));
		System.out.println( "4부터 5 " );
		System.out.println(str.substring(4, 6));
		System.out.println("str에 넣고 출력해보기");
		String subStr = str.substring (2,4)	;
		System.out.println("substr : " + subStr);
		System.out.println();
		
		System.out.println("====================================================");
//				[3-2] : substring(index1부터 끝까지)
		System.out.println("2부터 시작");
		System.out.println(str.substring(2));
		System.out.println("4부터 시작");
		System.out.println(str.substring(4));
		System.out.println("====================================================");
//		[4]   : 구분자로 잘라내기 : split("구분자")
		String str1  =  "hello,java";
		String str2  =  "hello_java_programing";
		String str3  =  "hello@java@programing@megait";
		String[] temp = str1.split(",");
		System.out.println(temp.length);
		for(int i = 0 ; i < temp.length; i ++) {
			System.out.print(temp[i]+" ");
		}
		System.out.println();
		
		
		temp = str2.split("_");
		System.out.println(temp.length);
		for(int i = 0 ; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		temp = str3.split("@");
		System.out.println(temp.length);
		for(int i = 0 ; i < temp.length; i++) {
			System.out.print(temp[i] + " ");
		}
		System.out.println();
		
		
		System.out.println("====================================================");
//		[5]	  : 문자열 비교 : compareTo()
		str1 = "ac";
		str2 = "dc";
		str3 = "ac";
		
		System.out.println(str1.compareTo(str2)); //기준값이 작을경우 음수가 반환
		System.out.println(str2.compareTo(str1)); //기준값이 클경우 양수가 반환
		System.out.println(str1.compareTo(str3)); //양쪽값이 같을경우 0 이 반환
		
		System.out.println();
		System.out.println("====================================================");
		
	}

}
