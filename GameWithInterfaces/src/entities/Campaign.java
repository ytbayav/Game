package entities;

public class Campaign {
	
	private int id;
	private String campaignName;
	private double discountRate;
	
	
	public Campaign(int id, String campaignName, double discountRate) {
		super();
		this.id = id;
		this.campaignName = campaignName;
		this.discountRate = discountRate;
	}
	public Campaign() {
		super();
	}
	public int getId() {
		return id;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	

}
