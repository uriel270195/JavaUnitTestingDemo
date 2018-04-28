package com.howtoprogram.junit5.observablepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.reactivex.Flowable;

public class DemoObservablesInteger {

	public static Integer[] getGreaterThanTen(Integer[] arrNumbers) {
		// TODO Auto-generated method stub
		List<Integer> resultList=new ArrayList<>();
		Flowable
		.fromArray(arrNumbers)
		.filter(x -> x >10)
		.toList()
		.subscribe(num -> {
			resultList.addAll(num);
		});
		return resultList.stream().toArray(Integer[]::new);
	}

	public static Integer[] getDuplicateNumbers(Integer[] arrNumbers) {
		// TODO Auto-generated method stub
		List<Integer> resultList=new ArrayList<>();
		
		Flowable
		.fromArray(arrNumbers)
		.map(x -> x*2)
		.toList()
		.subscribe(num -> {
			resultList.addAll(num);
		});
		return resultList.stream().toArray(Integer[]::new);
	}
	
}