//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _01_random._4_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		System.out.println(randomNumber);

	for (int i = 0; i < 10; i++) {
		
	
      if(randomNumber == 0 ) {
    	  JOptionPane.showMessageDialog(null, "I like your shirt");
      }
      if(randomNumber == 1 ) {
    	  JOptionPane.showMessageDialog(null, "You are very kind!");
      }
      if(randomNumber == 2 ) {
    	  JOptionPane.showMessageDialog(null, "You look nice today!");
      }
      if(randomNumber == 3 ) {
    	  JOptionPane.showMessageDialog(null, "You have a great personallity!");
      }
      if(randomNumber == 4 ) {
    	  JOptionPane.showMessageDialog(null, "You are one of the best people I know!");
      }
	}	// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. T
}}
