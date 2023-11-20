package Week10day20;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebook {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/'");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Avinash");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("AvinashYogabalan");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8778496446");
		
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Avinash@950025");
		
		WebElement findElement = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		
		Select Dropdown =new Select(findElement);
		
		Dropdown.selectByVisibleText("2");
		
		WebElement findElement2 = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		
		Select Dropdown2=new Select(findElement2);
		
		Dropdown2.selectByVisibleText("Sep");
		
		WebElement findElement3 = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select Dropdown3 =new Select(findElement3);
		
		Dropdown3.selectByVisibleText("1999");
		
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		//driver.close();
		
	}

}
