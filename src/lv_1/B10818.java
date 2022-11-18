package lv_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B10818 {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine()); //정수의 개수 N을 입력받는다.
		
		//Integer 타입의 List 만든다.
		List<Integer> list = new ArrayList<>();
		
		//정수 N개를 한줄로 입력받는다.
		//입력값을 공백으로 구분해서 String 타입의 배열에 넣는다.
		String[] str = br.readLine().split(" "); 

		//N번 반복한다.
		for(int i=0;i<N;i++) {
			
			int num = Integer.parseInt(str[i]); //배열의 값을 num 변수에 넣는다.
			
			list.add(num); //list에 정수 추가
		}
		
		//list 길이만큼의 int 배열 생성
		int[] arr = new int[list.size()];
		
		//List -> 배열
		//list에 있는 값을 arr 배열에 넣는다.
		for(int i=0;i<arr.length;i++) {
			arr[i] = list.get(i);
		}
		
		//배열을 오름차순으로 정렬
		Arrays.sort(arr);

		System.out.print(arr[0] + " " + arr[arr.length-1]);
	}

}
