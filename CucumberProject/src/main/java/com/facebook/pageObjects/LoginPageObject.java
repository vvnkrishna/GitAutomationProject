package com.facebook.pageObjects;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPageObject{

public static WebDriver driver;
	public Properties con;
	public Properties locat;


	public void openurl() throws Exception {

		FileInputStream fi1 = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\facebook\\repository\\configuration.properties");
		con = new Properties();
		con.load(fi1);
		FileInputStream fi2 = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\main\\java\\com\\facebook\\repository\\locators.properties");
		locat = new Properties();
		locat.load(fi2);
		if (con.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Christy\\eclipse-workspace\\CucumberProject\\com.facebook.drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			}
		else if (con.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\Christy\\eclipse-workspace\\NewProject\\com.facebook.drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("OPen IE browser");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
	}

	public void click(String xpathkey) {
		driver.findElement(By.xpath(locat.getProperty(xpathkey))).click();
	}
	
	public void sendData(String xpathkey, String data) {
		driver.findElement(By.xpath(locat.getProperty(xpathkey))).sendKeys(data);
	
	}
	public void enterusername() {
		click("EmailorPhone");
		sendData("EmailorPhone","abc@gmail.com");
	}
	
	public void enterpassword() {
		click("password");
		sendData("password","12345");
		
	}
	public void clickloginbutton() {
		click("LoginButton");
	}
	
	public void Verifylogin() {
		System.out.println("Login sucessfully");
		
	}
	
	public void close() {
		driver.close();
		
	}
}
