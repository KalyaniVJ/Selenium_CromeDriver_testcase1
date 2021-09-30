import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//selenium code
		System.setProperty("webdriver.chrome.driver","C:\\Users\\kalya\\OneDrive\\Documents\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3.org/");
		System.out.println(driver.getTitle());
	}

}
