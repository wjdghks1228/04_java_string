package step4_01.string;

import java.util.Arrays;

public class StringEx07_문제 {

	public static void main(String[] args) {
		
		// 문제) 이름은 name배열에 성적은 score배열에 각각 저장 및 출력
		
		String str = "김철수/87,이만수/42,이영희/95";
		
		String[] name = new String[3];
		int[] score = new int[3];
		
		//, split
		String preTemp [] = str.split(",");
		String temp[] ;
		for(int i = 0 ; i< preTemp.length; i++) {
			temp = preTemp[i].split("/");
			name[i] = temp[0];
			score[i] = Integer.parseInt(temp[1]);
		}
		
		System.out.println(Arrays.toString(name));
		System.out.println(Arrays.toString(score));

	}
}
