package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", 0, -1, null,
				options, 0);

		String choice = options[input];
		
		
		switch(choice) {
		case "Sunday":
			JOptionPane.showMessageDialog(null, "YOU HAVE SCHOOL TOMORROW! Make sure your homework is done.");
			break;
		case "Monday":
			JOptionPane.showMessageDialog(null,"You have to get up by 8:00 for school");
			break;
		case "Tuesday":
			JOptionPane.showMessageDialog(null,"No soccer practice today, LOAP today.");
			break;
		case "Wednesday":
			JOptionPane.showMessageDialog(null,"Soccer Today, make sure you wear the right thing.");
			break;
		case "Thursday":
			JOptionPane.showMessageDialog(null,"Football is on tonight after practice and school.");
			break;
		case "Friday":
			JOptionPane.showMessageDialog(null,"Yay, you made it through the week! Have fun on the weekend.");
			break;
		case "Saturday":
			JOptionPane.showMessageDialog(null,"Enjoy your weekend, and do your homework!");
			break;
		}
		//use a switch statement to do something cool for each option
		
	}
}
