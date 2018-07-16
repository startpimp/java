package GameStart;

import java.util.Random;
import java.util.Scanner;

public class Game {
	int random = 10;
	public void game() {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		Random r = new Random();
		GameTest gt = new GameTest();
		int ra = r.nextInt(random);
		System.out.println("trouve le chiffre choisis entre 0 et " + random);
		int i = 1;
		while (i >= 0) {
			String test = s.nextLine();
			if (test.equalsIgnoreCase(ra + "")) {
				System.out.println("Bravo, " + GamePrincipal.name + ", tu as gagné(e)");
				GamePrincipal.xp = GamePrincipal.xp + r.nextInt(25);
				gt.gameTest();
			}
		}
	}
}
