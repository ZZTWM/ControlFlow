package com.test;
/**
 *  x   +   y =  8
 *  
 *  +       +
 *  
 *  i   -   j =  6
 *  
 *  =       = 
 *  14      10
 * @author Administrator
 *
 */
public class Test03 {

	public static void main(String[] args) {
		
		for (int i = -100; i < 100; i++) {
			for (int j = -100; j < 100; j++) {
				for (int x = -100; x < 100; x++) {
					for (int y = -100; y < 100; y++) {
						if(x + y == 8 && i - j == 6 && x + i == 14 && y + j == 10){
							System.out.println("x=" + x + ",y=" + y + ",i=" + i + ",j=" + j);
						}
					}
				}
			}
		}
	}

}
