package common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Fees {
    @JsonProperty("Bundle")
    private double bundle;

    @JsonProperty("EndDate")
    private double endDate;

    @JsonProperty("Feature")
    private double feature;

    @JsonProperty("Gallery")
    private double gallery;

    @JsonProperty("Reserve")
    private double reserve;

    @JsonProperty("Subtitle")
    private double subtitle;

    @JsonProperty("TenDays")
    private double tenDays;

    @JsonProperty("Withdrawal")
    private double withdrawal;

    @JsonProperty("HighVolume")
    private double highVolume;

    @JsonProperty("MaximumSuccessFee")
    private double maximumSuccessFee;

    @JsonProperty("SuccessFeeTiers")
    private SuccessFeeTier[] successFeeTiers;

    @JsonProperty("SecondCategory")
    private double secondCategory;

	public double getBundle() {
		return bundle;
	}

	public void setBundle(double bundle) {
		this.bundle = bundle;
	}

	public double getEndDate() {
		return endDate;
	}

	public void setEndDate(double endDate) {
		this.endDate = endDate;
	}

	public double getFeature() {
		return feature;
	}

	public void setFeature(double feature) {
		this.feature = feature;
	}

	public double getGallery() {
		return gallery;
	}

	public void setGallery(double gallery) {
		this.gallery = gallery;
	}

	public double getReserve() {
		return reserve;
	}

	public void setReserve(double reserve) {
		this.reserve = reserve;
	}

	public double getSubtitle() {
		return subtitle;
	}

	public void setSubtitle(double subtitle) {
		this.subtitle = subtitle;
	}

	public double getTenDays() {
		return tenDays;
	}

	public void setTenDays(double tenDays) {
		this.tenDays = tenDays;
	}

	public double getWithdrawal() {
		return withdrawal;
	}

	public void setWithdrawal(double withdrawal) {
		this.withdrawal = withdrawal;
	}

	public double getHighVolume() {
		return highVolume;
	}

	public void setHighVolume(double highVolume) {
		this.highVolume = highVolume;
	}

	public double getMaximumSuccessFee() {
		return maximumSuccessFee;
	}

	public void setMaximumSuccessFee(double maximumSuccessFee) {
		this.maximumSuccessFee = maximumSuccessFee;
	}

	public SuccessFeeTier[] getSuccessFeeTiers() {
		return successFeeTiers;
	}

	public void setSuccessFeeTiers(SuccessFeeTier[] successFeeTiers) {
		this.successFeeTiers = successFeeTiers;
	}

	public double getSecondCategory() {
		return secondCategory;
	}

	public void setSecondCategory(double secondCategory) {
		this.secondCategory = secondCategory;
	}
}