package lv_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class B2693 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//테스트케이스 개수 입력받기
		int t = Integer.parseInt(br.readLine());
		
		//각 배열의 3번째 큰 수를 저장할 배열 생성
		int[] result = new int[t];
		
		//10개의 데이터 받기 t번 반복
		for(int i=0;i<t;i++) {
			
			//입력값을 저장할 배열 생성
			int[] arr = new int[10];
			
			//StringTokenizer 사용해서 공백으로 데이터 구분하기
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			//배열에 각 데이터 넣기
			for(int j=0;j<10;j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			
			//오름차순으로 정렬
			Arrays.sort(arr);
			
			//3번째로 큰 수를 정답 배열에 저장
			result[i] = arr[arr.length - 3];
		}
		
		//정답 출력
		for(int i=0;i<t;i++) {
			System.out.println(result[i]);
		}
		
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//테스트케이스 개수 입력받기
		int t = Integer.parseInt(br.readLine());
		
		//각 배열의 3번째 큰 수를 저장할 배열 생성
		int[] result = new int[t];
		
		//10개의 데이터 받기 t번 반복
		for(int i=0;i<t;i++) {
			
			//입력값을 저장할 배열 생성
			Integer[] arr = new Integer[10];
			
			//입력값을 공백으로 구분해서 string타입 배열에 저장
			String[] str = br.readLine().split(" ");
			
			//string 배열 값을 integer 배열에 저장
			for(int j=0;j<10;j++) {
				arr[j] = Integer.parseInt(str[j]);
			}
			
			//배열을 내림차순으로 정렬
			Arrays.sort(arr, Collections.reverseOrder());
		
			//3번째로 큰 수를 정답 배열에 저장
			result[i] = arr[2];
		}
		
		//정답 출력
		for(int i=0;i<t;i++) {
			System.out.println(result[i]);
		}
		
		*/
		
	}

}
