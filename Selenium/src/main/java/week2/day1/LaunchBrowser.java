package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		// we created object driver for the class ChromeDriver
		ChromeDriver driver = new ChromeDriver();
//		EdgeDriver edriver = new EdgeDriver();
		
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		System.out.println(	driver.getTitle());
		
	driver.close();

	}
}


