package GameStart;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class GameSave {
	public void save() {
	File f = new File("./playerInformation.txt");
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				saved();
			}
		}
		try (PrintWriter p = new PrintWriter(new FileOutputStream(f))) {
			p.println(GamePrincipal.name);
			p.println(GamePrincipal.prefix);
			p.println(GamePrincipal.xp);
			p.println(GamePrincipal.achat);
		} catch (IOException e) {
			saved();
		}
	}
	public void saved() {
	File f = new File("./playerInformation.txt");
		
		if (!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException e) {
				save();
			}
		}
		try(FileInputStream fis = new FileInputStream(f)) {l
			Scanner sc = new Scanner(fis);
			GamePrincipal.name = sc.nextLine();
			GamePrincipal.prefix = sc.nextLine();
			GamePrincipal.xp = sc.nextInt();
			GamePrincipal.achat = sc.nextInt();
		} catch (IOException e) {
			save();
		}
	}
}
