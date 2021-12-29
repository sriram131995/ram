package org.temp;
	import java.io.IOException;


	import org.junit.AfterClass;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import org.junit.Assert;;
	public class Ram extends Raju {

		static //static //static LibGlobal global=new LibGlobal();
			//public static void main(String[] args) throws IOException, InterruptedException {
		 Raju global=new Raju();
				@BeforeClass
				
				
				public static void beforeClass() {
					global.getDriver();
					
					global.loadurl("http://adactinhotelapp.com/");
					
					global.maximize();
							
				}
				@Test
				public void Other() throws IOException {
					String name = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 0);
					global.setText(global.findElementById("Username"), name);
				
				
				    String pass = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 1);
					global.setText(global.findElementById("passWord"), pass);
					WebElement findElementById3 = global.findElementById("login");
					global.click(findElementById3);
					
					WebElement loginpage = driver.findElement(By.xpath("//input[@value='ramsujay!']"));
					String uname = loginpage.getAttribute("value");
					Assert.assertEquals("login text", "ramsujay!", uname);
					
					//System.out.println("true");
					//Assert.assertEquals("Login", "Ram", name);
					String locationName = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 2);
					WebElement dwnLocation = global.findElementById("Location");
					global.SelectByVisibleText(dwnLocation, locationName);
					
					String selectHotel = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 3);
					WebElement dwnSelectHotel = global.findElementById("hotels");
					global.SelectByVisibleText(dwnSelectHotel, selectHotel);
					
					
					String rooomType = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 4);
					
					WebElement dwnRoom = global.findElementById("room_type");
					global.SelectByVisibleText(dwnRoom, rooomType);
					
					String noOfRooms = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 5);
					WebElement dwnRooms = global.findElementById("room_nos");
					global.SelectByVisibleText(dwnRooms, noOfRooms);
					
					String adultsPerRooom = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 6);
					WebElement dwnadults = global.findElementById("adult_room");
					global.SelectByVisibleText(dwnadults, adultsPerRooom);
					
					
					String childrenPerRoom = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 7);
					WebElement dwnChildren = global.findElementById("adult_room");
					global.SelectByVisibleText(dwnChildren, childrenPerRoom);
					
					
					
					WebElement btnSearch = global.findElementById("Submit");
					global.click(btnSearch);
					
					WebElement selecthtl = driver.findElement(By.xpath("//td[@class='login_title']"));
					String slct = selecthtl.getText();
					Assert.assertEquals("Select htl", "Select Hotel", slct);
					
					WebElement btnClick = global.findElementById("radiobutton_0");
					global.click(btnClick);
					
					
					WebElement btnCountinue = global.findElementById("continue");
					global.click(btnCountinue);
					
					WebElement bookhtl = driver.findElement(By.xpath("(//td[@class='login_title'])[2]"));
					String book = bookhtl.getText();
					Assert.assertEquals("Book htl", "Book A Hotel", book);
					String firstName = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 8);
					WebElement txtName = global.findElementById("first_name");
					global.setText(txtName, firstName);
					
					String lastName = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 9);
					WebElement txtLastName = global.findElementById("last_name");
					global.setText(txtLastName, lastName);
					
					String biilingAdrs = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 10);
					WebElement txtAdrs = global.findElementById("address");
					global.setText(txtAdrs, biilingAdrs);
					
					
					
					
				String cardNo = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 11);
				WebElement txtCardNo = global.findElementById("cc_num");
				global.setText(txtCardNo, cardNo);
				
				String cardType = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 12);
				WebElement dwnCardType = global.findElementById("cc_type");
				global.SelectByVisibleText(dwnCardType, cardType);

				
				
				
				String expiryDate = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 13);
				WebElement dwnExpiryDate = global.findElementById("cc_exp_month");
				global.SelectByVisibleText(dwnExpiryDate, expiryDate);
				
				String expiryYear = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 14);
				WebElement dwnExpiryYear = global.findElementById("cc_exp_year");
				global.SelectByVisibleText(dwnExpiryYear, expiryYear);
				
				
				String ccvNum = global.getData("C:\\Users\\vigne\\eclipse-workspace\\class\\src\\Excel\\adactin hotel1.xlsx", "ramu", 1, 15);
				WebElement txtCcvNum = global.findElementById("cc_cvv");
				global.setText(txtCcvNum, ccvNum);
				WebElement bookcnfrm = driver.findElement(By.xpath("(//td[@colspan='2'])[3]"));
				String cnfrm = bookcnfrm.getText();
				//System.out.println(cnfrm);
				Assert.assertEquals("Booking Cnfrm", "Back", cnfrm);
				
				WebElement btnBookNow = global.findElementById("book_now");
				global.click(btnBookNow);
	            
				
				}
				
				@AfterClass
				public static void afterClass() {
					global.quit();
				}
			
		
			}
			



