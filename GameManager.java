package oyun;


public class GameManager {
	
	private Logger[] loggers;
	
	public GameManager(Logger[] loggers) {
		this.loggers = loggers;
		
	}
	
	public void add(Game game) {
		System.out.println("Oyuna Kayýt Olundu Hesap Bilgileriniz :" +game.getId()+game.getTc()+game.getAdý()+game.getSoyadý()+game.getDoðumYýlý());
		
		Utils.runLoggers(loggers, game.getAdý());
		
	}

}
