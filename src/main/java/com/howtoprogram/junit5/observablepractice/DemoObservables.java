package com.howtoprogram.junit5.observablepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.Flowable;

public class DemoObservables {

	public static int[] getGreaterThanTen(int[] arrNumbers) {
		// TODO Auto-generated method stub
		Integer[] arrIntNumbers= Arrays.stream(arrNumbers).boxed().toArray(Integer[]::new);
		
		List<Integer> resultList=new ArrayList<>();
		
		Flowable
		.fromArray(arrIntNumbers)
		.filter(x -> x >10)
		.toList()
		.subscribe(num -> {
			resultList.addAll(num);
		});
		
		/*Observable
		.fromArray(arrIntNumbers)
		.filter(x -> x >10).subscribe();*/
		
		return resultList.stream().mapToInt(x -> x).toArray();
	}

	public static int[] getDuplicateNumbers(int[] arrNumbers) {
		// TODO Auto-generated method stub
		Integer[] arrIntNumbers= Arrays.stream(arrNumbers).boxed().toArray(Integer[]::new);
		
		List<Integer> resultList=new ArrayList<>();
		
		Flowable
		.fromArray(arrIntNumbers)
		.map(x -> x*2)
		.toList()
		.subscribe(num -> {
			resultList.addAll(num);
		});
		return resultList.stream().mapToInt(x -> x).toArray();
	}
	
}