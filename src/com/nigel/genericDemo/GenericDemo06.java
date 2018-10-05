package com.nigel.genericDemo;

class Gener{
	public <T>T tell(T t){
		return t;
	}
}

public class GenericDemo06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gener g = new Gener();
		String str = g.tell("Jack");
		System.out.println(str);
		int i = g.tell(10);
		System.out.println(i);
	}

}
