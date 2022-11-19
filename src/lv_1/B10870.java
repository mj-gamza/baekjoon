package lv_1;

import java.util.Scanner;

public class B10870 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//정수 n을 입력받는다.
		int n = sc.nextInt();
		
		//초기값
		//0번째 : 0, 1번째 : 1
		int a=0, b=1, c=0;
		
		
		for(int i=0;i<n;i++) {
			a = b;
			b = c;
			c = a+b;
		}
		
		/*
		n=0이면,
		for문을 빠져나온다. -> 0
		
		n=1이면,
		a=1, b=0, c=1 -> 1
		
		n=2이면,
		a=1, b=0, c=1
		a=0, b=1, c=1 -> 1
		
		n=3이면, 
		a=1, b=0, c=1
		a=0, b=1, c=1
		a=1, b=1, c=2 -> 2
		
		n=4이면,
		a=1, b=0, c=1
		a=0, b=1, c=1
		a=1, b=1, c=2
		a=1, b=2, c=3 -> 3
		
		n=5이면,
		a=1, b=0, c=1
		a=0, b=1, c=1
		a=1, b=1, c=2
		a=1, b=2, c=3
		a=1, b=3, c=5 -> 5
		*/
		
		System.out.println(c);
	}
	
}
