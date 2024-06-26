/**
 * 
 */
package com.flipkart.array;

/**
 * 
 */
public class DemoBasicArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 types of array: single, multiple, custom
		
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 60;
		
		// print array
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
	}

}
