package seleniumGrid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Test1 {
public static void main(String[] args) throws MalformedURLException {
	//  Step 1: load the url class
	URL url =new URL("http://localhost:4444/wd/hub");
	
   // set the driver capabilities
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setBrowserName("chrome");
	cap.setPlatform(Platform.WINDOWS);
	// instantiate the remote RemoteWebDriver 
	RemoteWebDriver driver = new RemoteWebDriver(url, cap);
	// launch the application
	driver.get("https://gmail.com");
			
}
}
