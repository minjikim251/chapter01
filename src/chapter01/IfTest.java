package chapter01;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt(); // blocking
		int b = s.nextInt(); // blocking
		
		int diff = 0;
				
 		if ( a > b ) {
 			diff = a - b;
 		} else {
 			diff = b - a;
 		}
		
//		diff = ( a > b) ? a - b : b - a;
		// 삼항연산자 (비추천)
		
		
		System.out.println(diff);

	}

}
