package org.temp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelBooking extends Raju {
	@FindBy(id="'//a[contains(text(),'Booked Itinerary')]'")
	private WebElement clckItenary;
	@FindBy(id="btn_id_518459")
	private WebElement clckOrderId;
	public WebElement getClckItenary() {
		return clckItenary;
	}
	public WebElement getClckOrderId() {
		return clckOrderId;
	}
	public void login() {
		click(clckItenary);
		click(clckOrderId);
	}

}


