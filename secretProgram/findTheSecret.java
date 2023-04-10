package secretProgram;

import java.util.Random;
import java.util.Scanner;

public class findTheSecret {

	public static void closeTo(int secret, int guess) {
		if (guess == -1) {
			return;
		}

		if (guess > secret) {
			System.out.println(String.format("O valor secreto é menor que %d", guess));
		}

		if (guess < secret) {
			System.out.println(String.format("O valor secreto é maior que %d", guess));
		}

	}

	public static void main(String[] args) {
		int chance = 5;
		System.out.println(String.format("Descubra o valor secreto, você tem %d chances...", chance));

		int range = 100;
		int secret = new Random().nextInt(range);
		System.out.println(String.format("Valor secreto está em um raio de 0 e %d", range));

		try (Scanner read = new Scanner(System.in)) {
			int guess = -1;
			while (chance > 0) {
				if (guess == secret) {
					System.out.println("Parabéns você acertou!!!");
					break;
				}

				closeTo(secret, guess);

				System.out.println(String.format("Chute de número %d:", chance));
				guess = read.nextInt();
				chance--;
			}

			if (guess != secret) {
				System.out.println(String.format("Você perdeu, o valor secreto era %d.", secret));
			}
		} catch (Exception error) {
			System.err.println(error.getMessage());
		}

	}
}
