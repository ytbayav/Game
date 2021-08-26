package entities;

public class Game {
	
	private int id;
	private String gameName;
	private double unitPrice;
	public Game() {
		super();
	}
	public Game(int id, String gameName, double unitPrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
	}
	public int getId() {
		return id;
	}
	public String getGameName() {
		return gameName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

}
