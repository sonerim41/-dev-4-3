package oyun;

public class Game {
	private int id;
	private String Tc;
	private String Adý;
	private String Soyadý;
	private int doðumYýlý;
	
	public Game(int id, String tc, String adý, String soyadý, int doðumYýlý) {

		this.id = id;
		this.Tc = tc;
		this.Adý = adý;
		this.Soyadý = soyadý;
		this.doðumYýlý = doðumYýlý;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTc() {
		return Tc;
	}

	public void setTc(String tc) {
		Tc = tc;
	}

	public String getAdý() {
		return Adý;
	}

	public void setAdý(String adý) {
		Adý = adý;
	}

	public String getSoyadý() {
		return Soyadý;
	}

	public void setSoyadý(String soyadý) {
		Soyadý = soyadý;
	}

	public int getDoðumYýlý() {
		return doðumYýlý;
	}

	public void setDoðumYýlý(int doðumYýlý) {
		this.doðumYýlý = doðumYýlý;
	}

}
