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
			break;
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "You are a Taurus.");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "You are a Gemini.");
			break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "You are a Cancer.");
			break;
		}
		case LEO:{
			JOptionPane.showMessageDialog(null, "You are a Leo.");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "You are a Virgo.");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "You are a Libra.");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "You are a Scorpio.");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "You are a SAGITTARIUS.");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "You are a Capricorn.");
			break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "You are a aquarius.");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "You are a pices.");
			break;
		}
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		_00_Horoscope h= new _00_Horoscope();
		h.zodiac(Zodiac.LEO);
	}
}
