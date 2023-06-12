package common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Category {
    @JsonProperty("CategoryId")
    private int categoryId;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Path")
    private String path;

    @JsonProperty("CanListAuctions")
    private boolean canListAuctions;

    @JsonProperty("CanListClassifieds")
    private boolean canListClassifieds;

    @JsonProperty("CanRelist")
    private boolean canRelist;

    @JsonProperty("DefaultDuration")
    private int defaultDuration;

    @JsonProperty("AllowedDurations")
    private int[] allowedDurations;

    @JsonProperty("Fees")
    private Fees fees;

    @JsonProperty("FreePhotoCount")
    private int freePhotoCount;

    @JsonProperty("MaximumPhotoCount")
    private int maximumPhotoCount;

    @JsonProperty("Charities")
    private Charity[] charities;

    @JsonProperty("Promotions")
    private Promotion[] promotions;

    @JsonProperty("EmbeddedContentOptions")
    private String[] embeddedContentOptions;

    @JsonProperty("MaximumTitleLength")
    private int maximumTitleLength;

    @JsonProperty("AreaOfBusiness")
    private int areaOfBusiness;

    @JsonProperty("DefaultRelistDuration")
    private int defaultRelistDuration;

    @JsonProperty("CanHaveSecondCategory")
    private boolean canHaveSecondCategory;

    @JsonProperty("CanBeSecondCategory")
    private boolean canBeSecondCategory;

    @JsonProperty("CanUseCounterOffers")
    private boolean canUseCounterOffers;

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isCanListAuctions() {
		return canListAuctions;
	}

	public void setCanListAuctions(boolean canListAuctions) {
		this.canListAuctions = canListAuctions;
	}

	public boolean isCanListClassifieds() {
		return canListClassifieds;
	}

	public void setCanListClassifieds(boolean canListClassifieds) {
		this.canListClassifieds = canListClassifieds;
	}

	public boolean isCanRelist() {
		return canRelist;
	}

	public void setCanRelist(boolean canRelist) {
		this.canRelist = canRelist;
	}

	public int getDefaultDuration() {
		return defaultDuration;
	}

	public void setDefaultDuration(int defaultDuration) {
		this.defaultDuration = defaultDuration;
	}

	public int[] getAllowedDurations() {
		return allowedDurations;
	}

	public void setAllowedDurations(int[] allowedDurations) {
		this.allowedDurations = allowedDurations;
	}

	public Fees getFees() {
		return fees;
	}

	public void setFees(Fees fees) {
		this.fees = fees;
	}

	public int getFreePhotoCount() {
		return freePhotoCount;
	}

	public void setFreePhotoCount(int freePhotoCount) {
		this.freePhotoCount = freePhotoCount;
	}

	public int getMaximumPhotoCount() {
		return maximumPhotoCount;
	}

	public void setMaximumPhotoCount(int maximumPhotoCount) {
		this.maximumPhotoCount = maximumPhotoCount;
	}

	public Charity[] getCharities() {
		return charities;
	}

	public void setCharities(Charity[] charities) {
		this.charities = charities;
	}

	public Promotion[] getPromotions() {
		return promotions;
	}

	public void setPromotions(Promotion[] promotions) {
		this.promotions = promotions;
	}

	public String[] getEmbeddedContentOptions() {
		return embeddedContentOptions;
	}

	public void setEmbeddedContentOptions(String[] embeddedContentOptions) {
		this.embeddedContentOptions = embeddedContentOptions;
	}

	public int getMaximumTitleLength() {
		return maximumTitleLength;
	}

	public void setMaximumTitleLength(int maximumTitleLength) {
		this.maximumTitleLength = maximumTitleLength;
	}

	public int getAreaOfBusiness() {
		return areaOfBusiness;
	}

	public void setAreaOfBusiness(int areaOfBusiness) {
		this.areaOfBusiness = areaOfBusiness;
	}

	public int getDefaultRelistDuration() {
		return defaultRelistDuration;
	}

	public void setDefaultRelistDuration(int defaultRelistDuration) {
		this.defaultRelistDuration = defaultRelistDuration;
	}

	public boolean isCanHaveSecondCategory() {
		return canHaveSecondCategory;
	}

	public void setCanHaveSecondCategory(boolean canHaveSecondCategory) {
		this.canHaveSecondCategory = canHaveSecondCategory;
	}

	public boolean isCanBeSecondCategory() {
		return canBeSecondCategory;
	}

	public void setCanBeSecondCategory(boolean canBeSecondCategory) {
		this.canBeSecondCategory = canBeSecondCategory;
	}

	public boolean isCanUseCounterOffers() {
		return canUseCounterOffers;
	}

	public void setCanUseCounterOffers(boolean canUseCounterOffers) {
		this.canUseCounterOffers = canUseCounterOffers;
	}
}