package oyun;

public class Game {
	private int id;
	private String Tc;
	private String Ad�;
	private String Soyad�;
	private int do�umY�l�;
	
	public Game(int id, String tc, String ad�, String soyad�, int do�umY�l�) {

		this.id = id;
		this.Tc = tc;
		this.Ad� = ad�;
		this.Soyad� = soyad�;
		this.do�umY�l� = do�umY�l�;
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

	public String getAd�() {
		return Ad�;
	}

	public void setAd�(String ad�) {
		Ad� = ad�;
	}

	public String getSoyad�() {
		return Soyad�;
	}

	public void setSoyad�(String soyad�) {
		Soyad� = soyad�;
	}

	public int getDo�umY�l�() {
		return do�umY�l�;
	}

	public void setDo�umY�l�(int do�umY�l�) {
		this.do�umY�l� = do�umY�l�;
	}

}
