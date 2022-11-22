package lv_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2581 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int m = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		//m과 n 사이의 소수를 저장하기 위한 배열
		int[] arr = new int[n];
		int idx = 0; //배열의 인덱스를 의미하는 변수(소수를 저장할 때 필요)
		
		//m과 n 사이의 자연수를 저장하기 위한 배열
		int[] num = new int[n-m+1];
		
		//배열에 m과 n 사이의 자연수를 저장한다.
		for(int i=0;i<num.length;i++) {
			num[i] = m+i;
		}

		//배열의 길이만큼 반복한다.(배열 내의 전체 데이터를 검사하기 위해)
		for(int i=0;i<num.length;i++) {
			
			int count = 0; //소수 체크를 위해 필요한 변수
			
			//2부터 n-1번째 값으로 반복해서 나눈다.
			for(int j=2;j<num[i];j++) {
				if(num[i]%j==0) { //나머지가 0이면 소수 아님
					count++;
					break; //반복문 빠져나가고 다음 수 체크
				}
			}
			
			//count가 0이라는 것은 나머지가 0인 경우가 한번도 없다는 의미
			//값이 1일 때는 for문에 들어가지 못하므로 무조건 count=0이기 때문에,
			//1이 소수로 인식되는 것을 막기 위해 조건 추가
			if(count==0 && num[i]!=1) {
				arr[idx] = num[i]; //소수면 배열에 넣는다.
				idx++; //인덱스값 ++
			}
		}
		
		//만약 소수를 저장한 배열의 첫 번째 값이 0이면
		//(저장된 데이터가 없다는 것을 의미한다.)
		if(arr[0]==0) {
			System.out.println(-1);
		}else {
			int min = arr[0]; //최솟값은 배열의 첫 번째 값
			int total = 0; //총합을 구하기 위한 변수
			
			//반복문을 통해 총합 구하기
			for(int i=0;i<arr.length;i++) {
				total += arr[i];
			}
			
			System.out.println(total);
			System.out.println(min);
			
		}
	}

}
