package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	// 1) Make a main method that includes all the steps below…. 
		public static void main(String[] args) {
			String heightToRide = JOptionPane.showInputDialog("what is your height in inches");
		
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
		
		// Uncomment the line below...
			if( Integer.parseInt(heightToRide) > 48 ) { 
		         JOptionPane.showMessageDialog(null, "yay, you can ride the coaster alone!");
			}
		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
		  
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
			else if( Integer.parseInt(heightToRide) > 42) { 
	         JOptionPane.showMessageDialog(null, "you can ride the coaster with somebody");
	         }
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JoptionPane
			else if( Integer.parseInt(heightToRide) < 42) {
	         JOptionPane.showMessageDialog(null, "Sorry, you must be 42 inches to ride");
	         }
		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
	
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
} 
}