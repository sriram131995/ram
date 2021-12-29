package org.temp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchHotel extends Raju {
	@FindBy(id="location")
	private WebElement  Location;
	

	@FindBy(id="hotels")
	private WebElement  Hotel;

	@FindBy(id="room_type")
	private WebElement  RoomType;

	@FindBy(id="room_nos")
	private WebElement  RoomNo;
	
	
	
	@FindBy(id="datepick_in")
	private WebElement Datein  ;
	
	@FindBy(id="datepick_out")
	private WebElement  Dateout;
	
	@FindBy(id="adult_room")
	private WebElement AdultRoom;

	@FindBy(id="child_room")
	private WebElement ChildRoom;
	
	@FindBy(id="Submit")
	private WebElement btnSumit;
	
	public WebElement getBtnSumit() {
		return btnSumit;
	}

	public WebElement getAdultRoom() {
		return AdultRoom;
	}

	public WebElement getChildRoom() {
		return ChildRoom;
	}

	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotel() {
		return Hotel;
	}

	public WebElement getRoomType() {
		return RoomType;
	}

	public WebElement getRoomNo() {
		return RoomNo;
	}

	public WebElement getDatein() {
		return Datein;
	}

	public WebElement getDateout() {
		return Dateout;
	}
	

	public void searchhotels(String location,String hotel,String roomtype,String noofrooms,String datein,String dateout,String noofadult,String noofchildern ) {
		
	SelectByVisibleText(getLocation(), location);
	SelectByVisibleText(getHotel(), hotel);
	SelectByVisibleText(getRoomType(), roomtype);
	SelectByVisibleText(getRoomNo(), noofrooms);
	SelectByVisibleText(getDatein(), datein);
	SelectByVisibleText(getDateout(), dateout);
 SelectByVisibleText(getAdultRoom(), noofadult);
 SelectByVisibleText(getChildRoom(), noofchildern);
	click(getBtnSumit());	
	}

	}


