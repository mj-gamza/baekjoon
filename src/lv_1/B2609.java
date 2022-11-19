package lv_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class B2609 {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//입력값을 공백으로 나누어서 배열에 저장
		String [] arr = br.readLine().split(" ");
		
		//두 값을 각각의 변수에 저장
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		
		int tmp; //값 비교를 위한 임시 변수
		
		//num1 < num2가 되도록 한다.
		if(num1>num2) {
			tmp = num1;
			num1 = num2;
			num2 = tmp;
		}
		
		int greatest = 1;
		
		//나누는 수가 num1보다 작거나 같을 때까지 반복
		for(int i=1;i<=num1;i++) {
			
			//num1 나머지가 0이고, num2 나머지도 0이면
			if(num1%i==0 && num2%i==0) {
				
				//최대공약수는 그 몫(i)이다.
				greatest = i;
			}
		}
		
		//최소공배수는 두 수를 곱한 값을 최대공약수로 나누면 된다.
		int least = num1 * num2 / greatest;
		
		System.out.println(greatest);
		System.out.println(least);
		
/*		
		int i = 1; //나누는 수
		int least = 1; //최소공배수
		int greatest = 1; //최대공약수
		
		//나누는 수가 num1보다 작거나 같을 때까지 반복
		while(i<=num1) {
			
			//num1을 나눈 나머지가 0인 가장 큰 몫을 구한다.
			if(num1%i == 0) {
				
				//그 몫으로 num2를 나누었을 때 나머지가 0이면
				if(num2%(num1/i) == 0) {
					
					//최대공약수는 그 몫이다.
					greatest *= (num1/i);
					
					//최소공배수를 구하기 위해, 각 수를 최대공약수로 나눈다.
					num1 /= greatest;
					num2 /= greatest;
					
					//반복문을 빠져나온다.
					break;
				}
			}
			i++;
		}
		
		//최소공배수
		least = greatest * num1 * num2;
		
		System.out.println(greatest);
		System.out.println(least);
*/
		
/*		
		int i = 2; //나누는 수
		int least = 1; //최소공배수
		int greatest = 1; //최대공약수
		
		//나눈 수(i) < 나누려는 수(num) 이면 반복
		while(i<=num1 && i<=num2) {
			
			//나머지가 0이면
			if(num1%i==0 && num2%i==0) {
				
				//값 = 몫
				num1 = num1/i;
				num2 = num2/i;
				
				//누적곱 (최대공약수)
				greatest *= i;
				
				i++;
				
			}else {
				
				//나머지가 0이 아니면 i값 초기화
				i = 2;
			}
		}
		
		//최소공배수
		least = greatest * num1 * num2;
		
		System.out.println(greatest); //최대공약수
		System.out.println(least); //최소공배수
		
*/
		
	}
	
}
