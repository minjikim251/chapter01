package chapter01;

import java.util.Scanner;

public class PowerOfTwo01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("승수:");
		int power = s.nextInt();
		
		int result = 1;
		int i = 0;
		while(i < power) {
			result = result * 2;
			// result *= 2; 로도 표기 가능
			i++;
		}
		
		System.out.println("2의 " + power + "승은 " + result + "입니다.");
		
		
		
		
		
		s.close();
	}

}
