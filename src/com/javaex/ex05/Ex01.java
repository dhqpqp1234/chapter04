package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex01 {

	public static void main(String[] args) {
		//제네릭에선 기본자료형을 못씀 Integer 
		
		Set<Integer> iset = new HashSet<Integer>();
		//원래 문법
		//int i01 = new Integer(12); 
	
		
		//int i =12;  자동으로 박싱됨
		//iset.add(12);
		
		Integer i01 =4;
		Integer i02 =5;
		Integer i03 =6;
		
		
		
		
		
		iset.add(i01);
		iset.add(i02);
		iset.add(i03);
		
		
		System.out.println(iset.size());
		System.out.println(iset.toString());
		
		Integer i04 =5; // 중복체크 
		iset.add(i04);
		
		for(Integer num : iset) {
			System.out.println(num.toString());
		}
		
		
	}

}
