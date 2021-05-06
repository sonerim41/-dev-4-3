package oyun;


public class Main {

	public static void main(String[] args) {
		
		
		Logger[] loggers = {new SatýsLogger(), new KampanyaLogger()};
		
		GameManager gameManager = new GameManager(loggers);
		
		Game soner = new Game(1, " Tc:00000000000", " Adý: Soner.", " Soyadý: Memiþ.", 1994);
		
		gameManager.add(soner);

	}

}
