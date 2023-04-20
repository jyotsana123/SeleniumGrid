import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
public class googleTest {

	@Test
	public void HomePageCheck() throws MalformedURLException
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		//caps.setBrowserName("chrome");
		caps.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		//caps.setPlatform(Platform.WIN10);
		//WebDriver driver = new ChromeDriver(); //in this you sending the request to run chromedriver not you hub, So to sending the request to hub you can use remote driver
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.4:4444"),caps); //07:11:32.114 INFO [Hub.execute] - Started Selenium Hub 4.8.3 (revision b19b418e60): http://192.168.1.4:4444
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("jyotsana");
		driver.close();
		
		
//		\* https://www.selenium.dev/documentation/grid/getting_started/
//
//			1. download selenium server jar
//			2. Make one folder in your system like selenium grid and place the jar into it
//			3. Download drivers for different browsers and keep in same folder selenium grid where your selenium server jar is placed
//			4. Open cmd prompt
//			5. Go in the folder where your selenium jar is
//			6. run command -> java -jar selenium-server-4.8.3.jar hub      -> selenium-server-4.8.3.jar is name of your selenium server jar
//			7. Open localhost:4444 in browser -> your selenium hub is started now
//			8. open one more cmd prompt
//			9.  Start the Node in Same Machine where Hub is running
//			    java -jar selenium-server-4.8.3.jar node --detect-drivers true
//
//			======================================
//			Start the Node in different Physical Machine
//			1. Connect other system with team viewer
//			2. then download selenium server jar and browser drivers in other machine and palce in the same forlder
//			3. Open cmd on other machine
//			4. Go in the folder where your selenium jar is
//			5. java -jar <SeleniumJarname> node --detect-drivers true -- 
//			   publish-events tcp://<ipaddressofhub> --subscribe-events 
//			   tcp:// <ipaddressofhub>
//			    there is two socket XPUB & XSUB , we need to ping these sockets of your hub then node will be successfully registered (in first system cmd where you started your selenium hub you can find these socket XPUB & XSUB)
//			6. Refresh your hub screen, you will get another node added of other machine.

//			=================================
//			AFter this setup, create one java project in elipse and add selenium jar into the project
//			Webdriver driver = new ChromeDriver(); - in this you sending the request to run chromedriver not you hub, So to sending the request to hub you can use remote driver

			//Webdriver driver = new RemoteWebDriver(); //this RemoteWebDriver want 2 arguments
			                                          //1. Where your hub is listening to send this request
			                                         // 2. DesiredCapabilities caps = new DesiredCapabilities(); -> this caps send in argument

			//covert project to testNg, choose parallel in parallel mode and click on finish in eclipse
			//right click on the testng.xml and run it  
		
	}
		
	}

