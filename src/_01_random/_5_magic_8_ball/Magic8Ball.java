//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	
	int number=new Random().nextInt(4);
	
	System.out.println();
	
	Random ran = new Random();   
                int random = ran.nextInt(4);           
	// 2. Make a variable that will hold a random number and put a random number
	//    into this variable using "new Random().nextInt(4)"
                   System.out.println();
	// 3. Print out this variable
                         JOptionPane.showMessageDialog(null, ("Is pasta a food?"));
	// 4. Get the user to enter a question for the 8 ball
	                     if(random == 0)  {
	                    	 JOptionPane.showMessageDialog(null, "Yes");
	                     }
	// 5. If the random number is 0
	                     if(random == 1)  {
	                    	 JOptionPane.showMessageDialog(null, "No");
	        
	                     }
                   
	                     if(random == 2)  {
	                    	 JOptionPane.showMessageDialog(null, "Maybe you should ask google");
	                     }
	// -- tell the user "Yes"
                         if(random == 3)  {
                        	 JOptionPane.showMessageDialog(null, "Your brain concerns me");
                         }
	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}

	private static int nextInt(int i) {
		// TODO Auto-generated method stub
		return 0;
	}
}
