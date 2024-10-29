package Test_m;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Blazedemo_reg;

public class Blazedemo_regTest {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test11()
	{
		Blazedemo_reg ob=new Blazedemo_reg(driver);
		ob.setvalues("Devika", "Global", "devika@gmail.com", "Deuzzz@##", "Deuzzz@##");
		ob.register();
	}

}
