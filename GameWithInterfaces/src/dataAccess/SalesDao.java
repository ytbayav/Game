package dataAccess;

import entities.Sales;

public class SalesDao implements SalesDaoRepository {

	@Override
	public void add(Sales sales) {
		System.out.println(
				"Oyun adi : " + sales.getGames().get(0).getGameName() + " - Kampanya adi : " + sales.getCampaign().getCampaignName()
						+ " - Müsteri adi : " + sales.getCustomer().getFirstName() +" - Toplam tutar : " + sales.getTotalPrice() + " Satis basariyla tamamlandi");

	}

	@Override
	public void list() {
		System.out.println("Listelendi");

	}

	@Override
	public void update(Sales sales) {
		System.out.println("Kampanya ad, : " + sales.getCampaign().getCampaignName() + " Müsteri adi : "
				+ sales.getCustomer().getFirstName() + " Güncellendi");

	}

	@Override
	public void delete(Sales sales) {
		System.out.println("Kampanya adi : " + sales.getCampaign().getCampaignName() + " Müsteri adi : "
				+ sales.getCustomer().getFirstName() + " Silindi");

	}

}