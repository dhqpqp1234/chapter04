package com.javaex.ex05;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {

	public static void main(String[] args) {
		//set을 만든다
		Set<Integer> iset = new HashSet<Integer>();
		//반복한다(set의 갯수가 6보다 작을때까지)
		while(true) {
			if(iset.size()<6) {
				break;
			}
		
		
		//번호를 생성한다
		int num = (int)(Math.random()*45)+1;
		System.out.println(num);
		
		//set에 add한다
		iset.add(num);
	}


		for(Integer num:iset) {
			System.out.println(num+"\t");
		}
}
}

/*
 HashSet<Integer> set = new HashSet<Integer>();

			while (set.size() < 6) {

				set.add((int) (Math.random() * 45) + 1);
			}

			System.out.println(set);

*/