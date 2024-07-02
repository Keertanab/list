package list;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	
public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ajio.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("bags");
		
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-genderfilter facet-linkname-Men']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[@class='facet-linkname facet-linkname-l1l3nestedcategory facet-linkname-Men - Fashion Bags']")).click();
		
		Thread.sleep(2000);
		
		System.out.println("Number of itemes found under fashion bags Men :");
		
			System.out.println(driver.findElement(By.xpath("//div[@class='length']")).getText());	
			
			List<WebElement> brandNames = driver.findElements(By.xpath("//div[@class='brand']"));
		
			System.out.println("----------The brands available are ---------------");
			for(WebElement list : brandNames   )
			{
			System.out.println(list.getText());
			}
			
			List<WebElement> bagNames = driver.findElements(By.xpath("//div[@class='nameCls']"));
			
			System.out.println("-----------List of bag names------------");
			
			for(WebElement list : bagNames)
			{
				System.out.println(list.getText());
			}
			
			
			
}
}