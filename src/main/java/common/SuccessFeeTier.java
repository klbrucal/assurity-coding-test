package common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SuccessFeeTier {
    @JsonProperty("MinimumTierPrice")
    private double minimumTierPrice;

    @JsonProperty("PercentageFee")
    private double percentageFee;

	public double getMinimumTierPrice() {
		return minimumTierPrice;
	}

	public void setMinimumTierPrice(double minimumTierPrice) {
		this.minimumTierPrice = minimumTierPrice;
	}

	public double getPercentageFee() {
		return percentageFee;
	}

	public void setPercentageFee(double percentageFee) {
		this.percentageFee = percentageFee;
	}
}