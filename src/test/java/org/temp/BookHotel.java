package org.temp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookHotel  extends Raju{
	@FindBy(id="first_name")
	private WebElement txtfirstname  ;

	@FindBy(id="last_name")
	private WebElement  txtlastname ;

	@FindBy(id="address")
	private WebElement txtaddress  ;

	@FindBy(id="cc_num")
	private WebElement txtcreditno;

	@FindBy(id="cc_type")
	private WebElement dDnccardtype ;

	@FindBy(id="cc_exp_month")
	private WebElement dDnexperym ;

	

	@FindBy(id="cc_exp_year")
	private WebElement dDnexperyy ;


	@FindBy(id="cc_cvv")
	private WebElement txtccvno ;

	@FindBy(id="book_now")
	private WebElement clickbook ;

	public WebElement getTxtfirstname() {
		return txtfirstname;
	}

	public WebElement getTxtlastname() {
		return txtlastname;
	}

	public WebElement getTxtaddress() {
		return txtaddress;
	}

	public WebElement getTxtcreditno() {
		return txtcreditno;
	}

	public WebElement getdDnccardtype() {
		return dDnccardtype;
	}

	public WebElement getdDnexperym() {
		return dDnexperym;
	}

	public WebElement getdDnexperyy() {
		return dDnexperyy;
	}

	public WebElement getTxtccvno() {
		return txtccvno;
	}

	public WebElement getClickbook() {
		return clickbook;
	}
	

	public void Bookshotel(String FirstName,String LastName,String Address,String CreditCard,String CardType,String ExpiryMnth,String ExpiryYear,String ccv) {
setText(getTxtfirstname(), FirstName);
setText(getTxtlastname(), LastName);
setText(getTxtaddress(), Address);
setText(getTxtcreditno(), CreditCard);	
SelectByVisibleText(getdDnccardtype(), CardType);
SelectByVisibleText(getdDnexperym(), ExpiryMnth);
SelectByVisibleText(getdDnexperyy(), ExpiryYear);
setText(getTxtccvno(), ccv);	
click(getClickbook());
	
	}}


