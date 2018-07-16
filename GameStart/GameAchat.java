package GameStart;

import java.util.Timer;
import java.util.TimerTask;

public class GameAchat {
	Timer t = new Timer();
	public void achat() {
		if (GamePrincipal.achat >= 1) {
			GamePrincipal.xp = GamePrincipal.xp - 20;
			t.schedule(new TimerTask() {

				@Override
				public void run() {
					GamePrincipal.xp = GamePrincipal.xp + 10;
				}
			}, 1000, 1000);
		}
	}
}
