package org.temp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Raju {
		@FindBy(id="username")
		private WebElement txtuserName;
		@FindBy(id="password")
		private WebElement txtpassword;
		@FindBy(id="login")
		private WebElement btnlogin;
		public WebElement getTxtuserName() {
			return txtuserName;
		}
		public WebElement getTxtpassword() {
			return txtpassword;
		}
		public WebElement getBtnlogin() {
			return btnlogin;
		}

		public void login(String userName,String password ) {
			setText(getTxtuserName(),userName);
		    setText(getTxtpassword(), password);
		    click(getBtnlogin());
	}


}
