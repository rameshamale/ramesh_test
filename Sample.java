package Ramesh_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("https://demo.automationtesting.in/Register.html");
    driver.findElement(By.xpath("(//input[contains(text(),'')])[1]")).sendKeys("Ramesh");
    driver.findElement(By.xpath("//input[contains(@placeholder,'Last Name')]")).sendKeys("Amale");
    driver.findElement(By.tagName("textarea")).sendKeys("A/P Begampur Tal Mohol Dis Solapur");
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ramesh.amale@ajmerainfotech.com");
    driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9960797008");
    driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
    driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
    driver.findElement(By.id("msdd")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Arabic')]")).click(); 
    driver.findElement(By.xpath("//select[@id='Skills']")).click();
    driver.findElement(By.xpath("//option[contains(text(),'Adobe InDesign')]")).click(); 
    driver.findElement(By.className("select2-selection select2-selection--single")).sendKeys("India");
    
	}
	
}
