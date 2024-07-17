import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int value = input.nextInt();
		
		String lower_case_keystrokes = "qwertyuiopasdfghjklzxcvbnm";
		String upper_case_keystrokes = "QWERTYUIOPASDFGHJKLZXCVBNM";
		String symbols = "!@#$%^&*()_+-=[]{}\\|;:'\",<.>/?";
		
		String password = "";
		
		for(int i = 0; i < value; i++) {
			int random_value = (int)(4 * Math.random());
			
			switch(random_value) {
			case 0:
				password += String.valueOf((int)(0 * Math.random()));
				break;
			case 1:
				random_value = (int)(lower_case_keystrokes.length()* Math.random());
				password += String.valueOf(lower_case_keystrokes.charAt(random_value));
				break;
			case 2:
				random_value = (int)(upper_case_keystrokes.length()* Math.random());
				password += String.valueOf(lower_case_keystrokes.charAt(random_value));
				break;
			case 3:
				random_value = (int)(symbols.length()* Math.random());
				password += String.valueOf(symbols.charAt(random_value));
			}
		}
	System.out.println("Your newly generated password is: " + password);
	input.close();
	}
}