package com.comparethemarket.insurance.pages.quote;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CriticalIllnessPage {
	
	@FindBy(id="LifeInsurance_CriticalIllnessCover_CriticalIllnessCover_YES")
	private WebElement criticalillness;
	
	@FindBy(id="LifeInsurance_CriticalIllnessCover_CriticalIllnessCover_NO")
	private WebElement noCriticalillness;
	
	@FindBy(id="LifeInsurance_CriticalIllnessCover_CriticalIllnessCoverType_A")
	private WebElement Additional;
	
	@FindBy(id="LifeInsurance_CriticalIllnessCover_CriticalIllnessCoverType_C")
	private WebElement combined;
	
	@FindBy(css=".Input.invalid")
	private WebElement additionalAmount;
	
	public WebElement criticalillnessselection() {
		return criticalillness;
	}
	public WebElement nonCriticalillnessselection() {
		return noCriticalillness;
	}
	public WebElement additionalCover() {
		return Additional;
	}
	public WebElement combinedCover() {
		return combined;
	}
	public WebElement additionalAmount() {
		return additionalAmount;
	}
}
