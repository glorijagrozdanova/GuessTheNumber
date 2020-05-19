import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

	int theNumber;
	int max;
	Scanner scanner = new Scanner(System.in);

	public GuessTheNumber() {
		Random rand = new Random();
		this.max = 100;
		this.theNumber = Math.abs(rand.nextInt()) % (max + 1); // we want this number to be between 0 and max
	}

	public void play() {
		while (true) {
			int move = scanner.nextInt();
			if (move > theNumber) {
				System.out.println("Your number is too big");
			} else if (move < theNumber) // if we dont't put the "else" here then every if will be executed
			// even if the first if turned out to be true
			{
				System.out.println("Your number is too small");
			} else {
				System.out.println("Bingo!");
				break; //we found the number, so break the loop
			}
		}
	}

	public static void howBigIsMyNumber(int x) {
		if (x >= 0 && x <= 10) {
			System.out.println("Our number is small");
		} else if (x >= 11 && x <= 100) {
			System.out.println("Our number is big");
		} else {
			System.out.println("Our number is out of range");
		}
	}

	public static void main(String[] args) {
		GuessTheNumber guessGame = new GuessTheNumber();
		System.out.println("Welcome to my game. Now try to guess my number.");
		System.out.println("It's between 0 and " + guessGame.max);
		guessGame.play();
	}
}
