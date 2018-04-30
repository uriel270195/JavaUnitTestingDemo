package com.howtoprogram.junit5.fizzbuzz;

import io.reactivex.Observable;

public class fizzBuzz {
	static String arrFizzBuzz[];
	static int pos=0;
	public static String[] fb(int num1, int num2) {
		// TODO Auto-generated method stub
		if (!validate(num1,num2)) {
			return new String[] {"Error"};
		}
		arrFizzBuzz=new String[num2-(num1)+1];
		Observable.range(num1, num2).map(x -> {
			arrFizzBuzz[pos]="";
			if (x % 3 == 0 && x % 5 == 0) {
            	arrFizzBuzz[pos] = "FizzBuzz";
            }else if (x % 3 == 0) {
            	arrFizzBuzz[pos] = arrFizzBuzz[pos]+ "Fizz";
            }else if (x % 5 == 0) {
            	arrFizzBuzz[pos] = arrFizzBuzz[pos] +"Buzz";
            }else {
            	arrFizzBuzz[pos] = x+"";
            }
            //System.out.println(arrFizzBuzz[pos]);
            pos++;
            return (pos)-1;
		}).subscribe(x ->{
			System.out.println(arrFizzBuzz[x]);
		});
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