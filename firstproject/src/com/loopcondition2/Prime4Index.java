package com.loopcondition2;

public class Prime4Index {

	public static void main(String[] args) {

		int c = 0;
		for (int i = 1; i <= 100; i++) {
			if (prime(i)) {
                c++;
                if(c%2!=0) {
                	System.out.println(i);
                }
        
			}
		}

	}

	static boolean prime(int n) {

		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;

			}
		}
		return true;
	}
}
