import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
public class RSATest {

	@Test
	public void HomePageCheck() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setBrowserName("firefox");
		caps.setCapability(CapabilityType.BROWSER_NAME, "firefox");
		//caps.setPlatform(Platform.WIN10);
		//WebDriver driver = new ChromeDriver(); //in this you sending the request to run chromedriver not you hub, So to sending the request to hub you can use remote driver
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444"),caps); //07:11:32.114 INFO [Hub.execute] - Started Selenium Hub 4.8.3 (revision b19b418e60): http://192.168.1.4:4444
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("jyotsana");
		//driver.close();
		
	}
		
	}

