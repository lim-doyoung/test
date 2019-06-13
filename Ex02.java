package com.bit.day11;

public class Ex02 {
	public static void main(String[] args) {

		int su = 3, sum = 0;
		for (int i = 1; i <= 9; i++) {
			sum += su * i;
			if (i == 9) {
				System.out.print(su * i + "="+sum);
			} else {
				System.out.print(su * i + "+");
			}
		}
	}
}
