import javax.swing.JOptionPane;

public class GussingGame {

	public static void main(String[] args) {

		int computerNum = (int) (Math.random() * 10 + 1);
		int userAnswer = 0;
		System.out.println("The correct guess would be " + computerNum);
		int count = 1;

		while (userAnswer != computerNum) {
			String response = JOptionPane.showInputDialog(null, "Enter a guess between 1 and 10", "Guessing Game", 3);
			userAnswer = Integer.parseInt(response);
			JOptionPane.showMessageDialog(null, "" + determineGuess(userAnswer, computerNum, count));
			count++;
		}
	}

	public static String determineGuess(int userAnswer, int computerNumber, int count) {

		if (userAnswer <= 0 || userAnswer > 10) {
			return "Your guess is invalid";
		} else if (userAnswer == computerNumber) {
			return "Correct!\nTotal Guesses: " + count;
		} else if (userAnswer > computerNumber) {
			return "Your guess is too high, try again.\nTry Number: " + count;
		} else if (userAnswer < computerNumber) {
			return "Your guess is too low, try again.\nTry Number: " + count;
		} else {
			return "Your guess is incorrect\nTry Number: " + count;
		}
	}

}
