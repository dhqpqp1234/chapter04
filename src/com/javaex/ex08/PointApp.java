package com.javaex.ex08;

import java.util.HashSet;
import java.util.Set;

public class PointApp {

	public static void main(String[] args) {
		
		Set<Point> pSet = new HashSet<Point>();
		
		Point p01 = new Point(1,2);
		Point p02 = new Point(3,6);
		Point p03 = new Point(5,10);

		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		
	
		/*
		for(Point p :pSet) {
			//System.out.println(p.getX()); //순서의 개념이 없음
		System.out.println(p.toString());
		}
		*/
	
		System.out.println(pSet.toString());
		System.out.println(pSet.size());
		System.out.println("'=========================");
	
		Point p04 = new Point(3,6);
		pSet.add(p04);
		
		System.out.println(pSet.toString());
		
		//hashcode 출력
		for(Point p : pSet) {
			System.out.println(p.hashCode());
		}
		
	}

}
