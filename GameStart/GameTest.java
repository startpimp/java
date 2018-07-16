package GameStart;

import java.util.Scanner;

public class GameTest {
	public void gameTest() {
		GameSave gs = new GameSave();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Game g = new Game();
		GameHelp gh = new GameHelp();
		int a = 1;
		while (a >= 0) {
			String text = sc.nextLine();
			if (text.equalsIgnoreCase(GamePrincipal.prefix + "game")) {
				g.game();
			} else if (text.equalsIgnoreCase(GamePrincipal.prefix + "random")) {
				System.out.println("Entre 0 et combien veut-tu que le chiffre random ce fasse");
				g.random = sc.nextInt();
			} else if (text.equalsIgnoreCase(GamePrincipal.prefix + "help")) {
				gh.helped();
			} else if (text.equalsIgnoreCase(GamePrincipal.prefix + "xp")) {
				System.out.println("Ton xp est de : " + GamePrincipal.xp);
			} else if (text.equalsIgnoreCase(GamePrincipal.prefix + "achat")) {
				System.out.println("L'achat coûte 20 xp pour 10 xp/s\nFait ok pour comfirmé l'achat");
				text = sc.nextLine();
				if (text.equalsIgnoreCase("ok")) {
					GameAchat ga = new GameAchat();
					System.out.println("Achat comfirmé");
					GamePrincipal.achat = 1;
					ga.achat();
				} else {
					System.out.println("Achat non comfirmé");
				}
			} else if (text.equalsIgnoreCase(GamePrincipal.prefix + "save")) {
				gs.save();
				System.out.println("Parti sauvegarder");
			}
		}
	}
}
