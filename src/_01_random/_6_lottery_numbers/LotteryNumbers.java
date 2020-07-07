package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {

	int ran = new Random().nextInt(7);

	int random = new Random().nextInt(7);
	int hello = new Random().nextInt(7);
	
	int ran2 = new Random().nextInt(7);
	
	
	int ran3 = new Random().nextInt(7);
	int ran4 = new Random().nextInt(7);
	
	JOptionPane.showMessageDialog(null, "the numbers are 1, 2, 3, 4, 5, 6");
}


}