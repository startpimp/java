package GameStart;

import java.util.Scanner;

public class GamePrincipal {
	static String prefix = " ";
	static String name = "";
	static int xp = 0;
	static int achat = 0;
	public static void main(String[] args) {
		GameSave gs = new GameSave();
		GameAchat ga = new GameAchat();
		try {
			gs.saved();
			gs.save();
			ga.achat();
			Scanner sc = new Scanner(System.in);
			System.out.println("Entre ton nom");
			name = sc.nextLine();
			prefix = "!";
			GameTest gt = new GameTest();
			System.out.println("Le prefix est : " + prefix);
			System.out.println(name + " fait !help si tu as besoins d'aide.");
			gt.gameTest();
		} catch (Exception e) {
			System.out.println("System crashed\nSystem finished");
			System.out.println(e.getClass());
		}
	}
}
