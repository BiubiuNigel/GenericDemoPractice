package com.nigel.genericDemo;

class Gen<K,T>{
	private T take;
	private K key;
	public T getTake() {
		return take;
	}
	public void setTake(T take) {
		this.take = take;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	
}

public class GenericDemo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gen<String,Integer>g = new Gen<String, Integer>();
		g.setKey("Hello Workl");
		g.setTake(10);
		System.out.println(g.getTake() + g.getKey());
	}

}
