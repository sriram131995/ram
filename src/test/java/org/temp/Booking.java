package org.temp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Booking extends Raju {
	@FindBy(id="search_hotel")
	private WebElement BtnSearch;

	public WebElement getBtnSearch() {
		return BtnSearch;
	}
	public void confirm() {
	 click(getBtnSearch());
	}
	}


