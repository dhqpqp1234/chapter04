package com.javaex.ex01;

public class MyListApp {

	public static void main(String[] args) {
		/*
		Point[] pArray = new Point[100];	//배열의 갯수를 정해야 한다.
		
		Point p00 = new Point(2,2);
		Point p01 = new Point(12,13);
		Point p02 = new Point(22,23);
		
		pArray[0] = p00;
		pArray[1] = p01;
		pArray[2] = p02;
		
		for(int i = 0; i < pArray.length; i++) {
			System.out.println(pArray[i].toString());
		}
		//[3]부터 배열의 값이 없어서 오류난다.
		*/
		
		
		
		
		
		//Point 관리		
		PointList pList = new PointList();
		
		Point p01 = new Point(2, 3);
		Point p02 = new Point(12, 13);
		
		pList.add(p01);
		pList.add(p02);
		
		//Point 개수
		System.out.println(pList.size());
		
		//[1]방의 y값
		Point p = pList.get(1);
		System.out.println(p.getY());
		
		//전체출력toSting();
		for(int i = 0; i < pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		CircleList cArray = new CircleList();
		
		Circle c01 = new Circle(3);
		Circle c02 = new Circle(5);
		Circle c03 = new Circle(7);
		
		cArray.add(c01);
		cArray.add(c02);
		cArray.add(c03);
		
		System.out.println(cArray.size());
		System.out.println(cArray.get(1).getRadius());
		
		for(int i=0; i<cArray.size(); i++) {
			System.out.println(cArray.get(i).toString());
		}
		
		
		
		
	}
}