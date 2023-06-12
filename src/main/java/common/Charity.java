package common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Charity {
    @JsonProperty("CharityType")
    private int charityType;

    @JsonProperty("ImageSource")
    private String imageSource;

    @JsonProperty("DarkModeImageSource")
    private String darkModeImageSource;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Tagline")
    private String tagline;

	public int getCharityType() {
		return charityType;
	}

	public void setCharityType(int charityType) {
		this.charityType = charityType;
	}

	public String getImageSource() {
		return imageSource;
	}

	public void setImageSource(String imageSource) {
		this.imageSource = imageSource;
	}

	public String getDarkModeImageSource() {
		return darkModeImageSource;
	}

	public void setDarkModeImageSource(String darkModeImageSource) {
		this.darkModeImageSource = darkModeImageSource;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTagline() {
		return tagline;
	}

	public void setTagline(String tagline) {
		this.tagline = tagline;
	}
}
