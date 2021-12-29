package org.temp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotel extends Raju {
	@FindBy(id="radiobutton_1")
	private WebElement btnRadio;
	@FindBy(id="continue")
	private WebElement btnContinue;
	public WebElement getBtnRadio() {
		return btnRadio;
	}
	public WebElement getBtnContinue() {
		return btnContinue;
	}
	public void select() {
		click(getBtnRadio());
		click(getBtnContinue());
	}
	}



