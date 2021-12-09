package demo.demo1;

import org.testng.annotations.Test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class homepage {
	
	@Test 
	public void basePase() throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("/Users/nande/eclipse-workspace/demo1/src/main/java/demo/demo1/data.properties");
		prop.load(fis);
		System.setProperty("webdriver.chrome.driver", "/Users/nande/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
	}
}
