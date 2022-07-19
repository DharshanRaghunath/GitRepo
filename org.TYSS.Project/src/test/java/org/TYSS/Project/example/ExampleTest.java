package org.TYSS.Project.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExampleTest {
	@Test
public void practiceTe4st() {
		String  url=System.getProperty("URL");
		String browser =System.getProperty("browser");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get(url);
		System.out.println(url);
		System.out.println(browser);
		System.out.println("method executed");
		//System.out.println("hi");
}
}
// in this program we can pass the url and browser  in the terminal and running the test scripts and the browser is launched and executed 
