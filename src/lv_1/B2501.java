package lv_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B2501 {
	public static void main(String[] args) {

		//입력값을 받는다.
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		String arr[] = {}; //배열 선언
		List<String> list = new ArrayList<>(Arrays.asList(arr)); //배열을 List로
		
		//약수를 구하기 위한 반복문
		for(int i=1;i<=n;i++) {
			if(n%i==0) { //나머지가 0이면 : 약수이면
				list.add(Integer.toString(i)); //약수를 list에 추가
			}
		}
		
		arr = list.toArray(arr); //list를 arr로 
		
		if(arr.length<k) { //약수의 개수가 k보다 적으면
			System.out.println(0); //0 출력
		}else {
			System.out.println(arr[k-1]); //배열에서 k번째로 작은 수 출력
		}
		
	}

}
