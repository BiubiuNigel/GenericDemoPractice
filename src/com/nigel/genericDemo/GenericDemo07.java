package com.nigel.genericDemo;

public class GenericDemo07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String arr[] = {"www","jack","com"};
//		tell(arr);
		
		Integer arr[] = {1,2,3};
		tell(arr);
	}
	
	public static <T>void tell(T arr[]){
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
