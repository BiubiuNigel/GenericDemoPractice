package com.nigel.genericDemo;

class Info<T>{
	private T key;

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getKey().toString();
	}
}

public class GenericDemo04 {

	public static void main(String[] args) {
		Info<String> info = new Info<String>();
		info.setKey("Jack");
		tell(info);
	}
	/**
	 * Í¨Åä·û: ?
	 * @param i
	 */
	public static void tell(Info<?> i) {
		System.out.println(i);
	}

}
