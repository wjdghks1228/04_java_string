package step4_01.string;


public class StringEx05_문제 {
//2021_03_02 TIME : 21:03 ~ 
	public static void main(String[] args) {

		String jumin = "890101-2012932";
		// 문제 1) 나이 출력
		// 정답 1) 32세
		// 문제 2) 성별 출력
		// 정답 2) 여성
		String age;
		String year;
		char sex;
		String temp [ ] = jumin.split("-");
		for(int i = 0 ; i < temp.length; i++) {
			if(i == 0) {
				age = temp[i].substring(0,2);
				year = "19" + age;
				System.out.println("나이 : " + (2021 - Integer.parseInt(year)));
			}
			else if ( i == 1) {
				sex = temp[i].charAt(0);
				if(sex == 1) {
					System.out.println("성별 : 남자");
				}
				else {
					System.out.println("성별 : 여자");
				}
			}
		}

	}

}
