package lv_1;

import java.util.Scanner;

public class B10870 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a=0, b=1, c=0;
		
		for(int i=0;i<n;i++) {
			
			a = b;
			b = c;
			c = a+b;
			
		}
		
		System.out.println(c);
	}
	
}
