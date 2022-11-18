package lv_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B2460 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0; //기차 안 인원
		List<Integer> list = new ArrayList<>();
		
		//10번 반복한다.
		for(int i=0;i<10;i++) {
			int out = sc.nextInt(); //내린 사람 수
			int in = sc.nextInt(); //탄 사람 수
			
			int result = in-out; //증감인원 = 탄 사람 수 - 내린 사람 수
			
			total += result; //기차 안 인원 += 증감인원

			list.add(total); //list에 값 추가
		}
		
		//길이가 10인 배열 생성
		//값이 총 10개니까
		int[] arr = new int[10];
		
		//List -> 배열
		for(int i=0;i<10;i++) {
			arr[i] = list.get(i).intValue();
		}
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}
}
