package com.nigel.genericDemo;

class Point<T>{
	private T x ;
	private T y ;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
	

	
}

/**
 * ��γ��
 * int
 * float
 * String
 * @author Administrator
 *
 */
public class GenericDemo01 {

	public static void main(String[] args) {
		
		Point<String>point = new Point<String>();
		point.setX("����Ϊ��109");
		point.setY("ά��: 100");
		System.out.println(point.getX() +" " + point.getY());
	}

}
