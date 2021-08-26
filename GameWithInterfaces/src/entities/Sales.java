package entities;

import java.util.ArrayList;
import java.util.Iterator;

public class Sales {
	private int id;
	private ArrayList<Game> games;
	private Customer customer;
	private Campaign campaign;
	private double totalPrice;
	public Sales() {
		super();
	}
	public Sales(int id, ArrayList<Game> games, Customer customer, Campaign campaign, double totalPrice) {
		super();
		this.id = id;
		this.games = games;
		this.customer = customer;
		this.campaign = campaign;
		this.totalPrice = totalPrice;
	}
	public int getId() {
		return id;
	}
	public ArrayList<Game> getGames() {
		return games;
	}
	public Customer getCustomer() {
		return customer;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setGames(ArrayList<Game> games) {
		this.games = games;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setCampaign(Campaign campaign) {
		this.campaign = campaign;
	}
	public double getTotalPrice() {
		double gamesPrice = 0;
		for (Game game : games) {
			gamesPrice +=game.getUnitPrice();
		}
		totalPrice = gamesPrice*(100 - campaign.getDiscountRate()/100);
		return totalPrice;
	}
	
	

}
