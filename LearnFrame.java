package week3.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {
	

public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.switchTo().frame("iframeResult");
		
	driver.findElement(By.xpath("//button[text()='Try it']")).click();
	
		
	Alert alert = driver.switchTo().alert();
		
	System.out.println(alert.getText());
	alert.accept();
	
	System.out.println(driver.findElement(By.xpath("//p[text()='You pressed OK!']")).getText());
}
}