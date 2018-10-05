package com.nigel.genericDemo;

interface GenInter<T>{
	public void say();
}

class Gin<T> implements GenInter<T>{

	private String info;
	public Gin(String info) {
		this.info = info;
	}
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		
	}
	
}

public class GenericDemo05 {

	public static void main(String[] args) {

		Gin<String> gin = new Gin<String>("Jack");
		System.out.println(gin.getInfo());
	}

}
