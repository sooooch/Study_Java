package com.itwill.loop02;



public class LoopMain02 {

	public static void main(String[] args) {
		for (int i = 5; i > 0 ; i--) {
			System.out.print(i);
		}
		System.out.println(); 
		
		// 0 2 4 6 8 10
		
		
		for (int u = 0; u <= 10; u += 2) {                  
			System.out.print(u + " ");                    
			}
		System.out.println();  
		
		for (int n = 0; n <= 5; n++) {
			System.out.print((n * 2) + " ");
			
		}
		System.out.println();
		
		for (int n = 0; n <= 10; n++) {
			if ( n % 2 == 0) {
				System.out.print(n + " ");
			}
			
		}
		System.out.println();
		//10 8 6 4 2 0
		for (int i = 10; i >= 0; i -= 2) {
			System.out.print(i + " "); 
		}
		
	}

}
