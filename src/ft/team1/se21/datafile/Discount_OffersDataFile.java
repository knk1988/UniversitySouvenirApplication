package ft.team1.se21.datafile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import ft.team1.se21.constants.Constants;
import ft.team1.se21.model.DiscountAndOffers;


public class Discount_OffersDataFile extends DataFile {
	private static Discount_OffersDataFile discount_OffersDataFile;

	private List<DiscountAndOffers> discountOffersList;

	private Discount_OffersDataFile() {
	}

	public Discount_OffersDataFile getInstance() {
		if (discount_OffersDataFile == null) {
			discount_OffersDataFile = new Discount_OffersDataFile();
		}
		return discount_OffersDataFile;
	}

	public List<DiscountAndOffers> getDiscountOffersList() {
		return discountOffersList;
	}

	public void setDiscountOffersList(List<DiscountAndOffers> discountOffersList) {
		if(discountOffersList==null){
			discountOffersList=new ArrayList<DiscountAndOffers>();
		}
		this.discountOffersList = discountOffersList;
	}

	public List<DiscountAndOffers> readDiscount_Offers(String path)
			throws IOException {
		List<String> readDiscountList = super.readFromFile(path);
		for (String item : readDiscountList) {
			String[] discountData = item.split(Constants.COMMA);
			DiscountAndOffers discountAndOffers = new DiscountAndOffers();
			discountAndOffers.setDiscountCode(discountData[0]);
			discountAndOffers.setDescription(discountData[1]);
			discountAndOffers.setStartDate(discountData[2]);
			discountAndOffers.setPeriodOfDiscount(discountData[3]);
			discountAndOffers.setPercentageDiscount(discountData[4]);
			discountAndOffers.setIsApplicableToMemberOnly(discountData[5]);
			discountOffersList.add(discountAndOffers);

		}
		return discountOffersList;
	}

	public void writeVendors(String path) throws IOException {
		List<String> items = new ArrayList<>();

		for (DiscountAndOffers discountOffers : discountOffersList) {
			StringBuilder buildDiscount = new StringBuilder();
			buildDiscount.append(discountOffers.getDiscountCode());
			buildDiscount.append(Constants.COMMA);
			buildDiscount.append(discountOffers.getDescription());
			buildDiscount.append(Constants.COMMA);
			buildDiscount.append(discountOffers.getStartDate());
			buildDiscount.append(Constants.COMMA);
			buildDiscount.append(discountOffers.getPeriodOfDiscount());
			buildDiscount.append(Constants.COMMA);
			buildDiscount.append(discountOffers.getPercentageDiscount());
			buildDiscount.append(Constants.COMMA);
			buildDiscount.append(discountOffers.getIsApplicableToMemberOnly());
			buildDiscount.append(Constants.NEWLINE);
			items.add(buildDiscount.toString());
		}
		super.writeToFile(path, items);
	}

}
