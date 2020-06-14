import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
public class AppTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver =  new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://18.221.10.90:8140/");
		
		Thread.sleep(4000);
		
		System.out.println("Test Execution Ended");
		String aboutUsText = driver.findElement(By.id("About Us")).getText();
		if(aboutUsText.contentEquals("About Us")) {
			System.out.println("Test Passed");
		}
		else {
			System.out.println("Test Failed");
		}
		
		driver.close();
	}

}
