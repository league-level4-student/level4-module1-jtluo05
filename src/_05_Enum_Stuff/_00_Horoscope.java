package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	void zodiac(Zodiac z) {
	JOptionPane.showInputDialog("Choose a horoscope");
		switch(z) {
		case ARIES:{
			JOptionPane.showMessageDialog(null, "You are a Aries.");
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "You are a Taurus.");
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "You are a Gemini.");
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "You are a Cancer.");
		}
		case LEO:{
			JOptionPane.showMessageDialog(null, "You are a Leo.");
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "You are a Virgo.");
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "You are a Libra.");
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "You are a Scorpio.");
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "You are a SAGITTARIUS.");
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "You are a Capricorn.");
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "You are a aquarius.");
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "You are a pices.");
		}
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		zodiac(z);
	}
}
