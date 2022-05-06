package com.javaex.ex09;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		//Map 은 별명을 넣음
		Map<String, Point> pMap = new HashMap<String, Point>(); // String => key, Point => value
		
		Point p01 = new Point(3,3);
		Point p02 = new Point(5,5);
		Point p03 = new Point(14,32);
	
		pMap.put("정우성", p01);
		pMap.put("이효리", p02);
		pMap.put("박명수", p03);
		
		System.out.println(pMap.size());
		System.out.println(pMap.toString());
		
		System.out.println(pMap.get("박명수").getX());
		
		//같은 키값으로 추가 값 수정의 개념
		Point p04 = new Point(100,200);
		pMap.put("정우성", p04);
		System.out.println(pMap.toString());
		
		//전체출력
		//1.key 목록을 만들어야한다.  ex: ["정우성"]
		//2.pMap.get("key값")
		
		Set<String> kyes = pMap.keySet();
		System.out.println(kyes.toString());
		
		for(String name : kyes) {
			System.out.println(pMap.get(name).getX());
		}
		
		
	}

}
