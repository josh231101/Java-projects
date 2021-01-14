/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countnumbers;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class CountNumbers {

	
	
	public static void main(String[] args) {
		int Number, Count=0;
		Scanner sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		Number = sc.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.println("\n Number of Digits in a Given Number = "+ Count + "\n");
	}
}
