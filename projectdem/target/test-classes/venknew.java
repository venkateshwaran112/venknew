import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class venknew {
	public static void main(String[] args) {
		Webdriver.Chromedriver.setup();
		WebDriver driver = new Chromedriver();
		driver.get("https://www.simplilearn.com/");
		List<Webelement> path=driver.findElements(By.tagName("a"));
		for(Webelement w: path) {
			System.out.println(w);
		}
	}


}
