package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class Blazedemo_reg {
	WebDriver driver;
	By blaname=By.id("name");
	By blacompany=By.id("company");
	By blaemail=By.id("email");
	By blapassword=By.id("password");
	By blaconfirm=By.id("password-confirm");
	By blareg=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	
	public Blazedemo_reg(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String name,String company,String email,String Password,String Confirm)
	{
		driver.findElement(blaname).sendKeys(name);
		driver.findElement(blacompany).sendKeys(company);
		driver.findElement(blaemail).sendKeys(email);
		driver.findElement(blapassword).sendKeys(Password);
		driver.findElement(blaconfirm).sendKeys(Confirm);
	}
	public void register()
	{
		driver.findElement(blareg).click();
	}

}
