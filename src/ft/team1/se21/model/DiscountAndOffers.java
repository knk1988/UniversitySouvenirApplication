package ft.team1.se21.model;

public class DiscountAndOffers {
	private String discountCode;
	private String description;
	private String startDate;
	private String periodOfDiscount;
	private String percentageDiscount;
	private String isApplicableToMemberOnly;
	public String getDiscountCode() {
		return discountCode;
	}
	public void setDiscountCode(String discountCode) {
		this.discountCode = discountCode;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getPeriodOfDiscount() {
		return periodOfDiscount;
	}
	public void setPeriodOfDiscount(String periodOfDiscount) {
		this.periodOfDiscount = periodOfDiscount;
	}
	public String getPercentageDiscount() {
		return percentageDiscount;
	}
	public void setPercentageDiscount(String percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}
	public String getIsApplicableToMemberOnly() {
		return isApplicableToMemberOnly;
	}
	public void setIsApplicableToMemberOnly(String isApplicableToMemberOnly) {
		this.isApplicableToMemberOnly = isApplicableToMemberOnly;
	}
	
	

}
