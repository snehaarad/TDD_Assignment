package com.yash.tdd;

public class HCfExample {

	public static int HCF(int a,int b) {
		int i, hcf = 0;


		for(i=1; i<= a || i<=b; i++) {
			if( a%i == 0 && b%i == 0 )
				hcf = i;
		}

		return hcf;
	}
}



