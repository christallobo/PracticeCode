package com.practice.code;

public class PrgCountVowel {

	public static void main(String[] args) {

//		String s = "tcsinterview";
//		int count = (int) s.chars().filter(i -> i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u').count();
//		System.out.println(count);
//		
//		System.out.println(1+2+3+"welcome"+5+6);

		System.out.println("Enter the value of x and y");  
        /*Define variables*/  
        int x = 1;  
        int y = 2;  
        System.out.println("before swapping numbers: "+x +" "+ y);  
       /*Swapping*/  
        x = x + y;   
        y = x - y;   
        x = x - y;   
        System.out.println("After swapping: "+x +"  " + y);   
	}

}
