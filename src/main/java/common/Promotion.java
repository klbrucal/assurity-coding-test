package common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Promotion {
    @JsonProperty("Id")
    private int id;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Price")
    private double price;

    @JsonProperty("OriginalPrice")
    private double originalPrice;

    @JsonProperty("Recommended")
    private boolean recommended;

    @JsonProperty("MinimumPhotoCount")
    private int minimumPhotoCount;

    @JsonProperty("GoodFor2RelistsFee")
    private double goodFor2RelistsFee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public boolean isRecommended() {
		return recommended;
	}

	public void setRecommended(boolean recommended) {
		this.recommended = recommended;
	}

	public int getMinimumPhotoCount() {
		return minimumPhotoCount;
	}

	public void setMinimumPhotoCount(int minimumPhotoCount) {
		this.minimumPhotoCount = minimumPhotoCount;
	}

	public double getGoodFor2RelistsFee() {
		return goodFor2RelistsFee;
	}

	public void setGoodFor2RelistsFee(double goodFor2RelistsFee) {
		this.goodFor2RelistsFee = goodFor2RelistsFee;
	}
}
