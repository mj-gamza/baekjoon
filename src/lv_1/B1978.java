package lv_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978 {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//n을 입력받는다.
		int n = Integer.parseInt(br.readLine());
		
		//길이가 n인 배열 생성
		int[] arr = new int[n];
		
		//입력값을 공백으로 구분
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		//입력값을 배열에 저장
		for(int i=0;i<arr.length;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int num = 0;
		
		//값 하나씩 소수 검증 (i = 배열에 저장된 입력값 인덱스)
		for(int i=0;i<arr.length;i++) {
			
			int j;
			
			//소수구하기
			//값을 2~(n-1)번째 값으로 계속 나눈다.
			for(j=2;j<arr[i];j++) {
				if(arr[i]%j==0) { //만약 나눈 나머지가 0이면 j는 arr[i]의 약수
					break; //소수가 아닌 것이 확정되면 for문을 빠져나와서 배열의 다음 입력값으로 넘어감
				}
			}
			
			//나머지가 0인 경우가 끝까지 없으면 j는 ++된 상태로 for문이 끝난다.
			//때문에 j=arr[i]인 경우가 발생한다.
			//이는 마지막까지 나누어 떨어지는 수가 없음을 의미하며, arr[i] 데이터가 소수임을 뜻한다.
			if(arr[i]==j) {
				num++;
			}
		}
		
		//정답 출력
		System.out.println(num);
	}
}
