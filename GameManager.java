package oyun;


public class GameManager {
	
	private Logger[] loggers;
	
	public GameManager(Logger[] loggers) {
		this.loggers = loggers;
		
	}
	
	public void add(Game game) {
		System.out.println("Oyuna Kay�t Olundu Hesap Bilgileriniz :" +game.getId()+game.getTc()+game.getAd�()+game.getSoyad�()+game.getDo�umY�l�());
		
		Utils.runLoggers(loggers, game.getAd�());
		
	}

}
