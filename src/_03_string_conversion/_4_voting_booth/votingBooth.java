package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class votingBooth {
	public static void main(String[] args) {
		String UserAge = JOptionPane.showInputDialog("How old are you?");
		
		if (Integer.parseInt(UserAge) > 18 ) {
		JOptionPane.showMessageDialog(null, "Who do you think the next president should be");
		}
		
		else if (Integer.parseInt(UserAge) < 18) {
			JOptionPane.showMessageDialog(null, "Nobody cares what you think");
		}
		
	}

}
