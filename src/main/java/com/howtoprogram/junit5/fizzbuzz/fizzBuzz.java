package com.howtoprogram.junit5.fizzbuzz;

import io.reactivex.Flowable;

public class fizzBuzz {
	static String arrFizzBuzz[];
	
	public static String[] fb(int num1, int num2) {
		// TODO Auto-generated method stub
		if (!validate(num1,num2)) {
			return new String[] {"Error"};
		}
		arrFizzBuzz=new String[num2];
		int length=arrFizzBuzz.length;
		int pos=0;
		for (int x = 1; x <= length; x++) {
			arrFizzBuzz[pos]="";
            if (x % 3 == 0) {
            	arrFizzBuzz[pos] = arrFizzBuzz[pos]+ "Fizz";
            }
            if (x % 5 == 0) {
            	arrFizzBuzz[pos] = arrFizzBuzz[pos] +"Buzz";
            }
            if (x % 3 != 0 && x % 5 != 0) {
            	arrFizzBuzz[pos] = x+"";
            }
            System.out.println(arrFizzBuzz[pos]);
            pos++;
		}
		return arrFizzBuzz;
	}

	public static boolean validate(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num1>num2 || num1 <=0) {
			return false;
		}
		return true;
	}
	
}