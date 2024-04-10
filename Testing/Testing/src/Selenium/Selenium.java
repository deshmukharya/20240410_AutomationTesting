package Selenium;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import org.openqa.selenium.*;
//import org.openqa.selenium.By;
//import org.openqa.selenium.webDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://schooledn.py.gov.in/admission/hsc.html");
		driver.get("https://www.redbus.com/");	
		/*WebElement dg =driver.findElement(By.id("draggable"));
		WebElement dp =driver.findElement(By.id("draggable"));
		Actions act=new action(driver);
		*/
		Actions actions = new Actions(driver);

		// Find the elements
		WebElement cl = driver.findElement(By.xpath("//A[@href='/info/redcare'][text()='Help']"));
		WebElement cl2 = driver.findElement(By.xpath("//I[@class='icon-close']/self::I"));
		actions.click(cl).perform();
//		Thread.sleep(1500);
//		actions.moveToElement(cl2).perform();
//		Thread.sleep(1500);
		actions.click(cl2).perform();
		//WebElement cl2 = driver.findElement(By.xpath("//a[@href='#'][text()='Government']"));
		
		
		 // Find the draggable element
		/*Actions actions = new Actions(driver);

		// Find the elements
		WebElement cl = driver.findElement(By.xpath("//a[@href='#'][text()='Schools']"));
		WebElement cl2 = driver.findElement(By.xpath("//a[@href='#'][text()='Government']"));
		WebElement cl3 = driver.findElement(By.xpath("//a[@href='../schools/stateGovt.html'][text()='State Govt']"));

		// Perform a series of actions in the correct order
		// Move to the first element and click on it
		actions.click(cl).perform();
		actions.moveToElement(cl2).perform();
		actions.click(cl2).perform();
		// Move to the second element and click on it
		actions.moveToElement(cl3).perform();
		// Move to the third element and click on it
		actions.click(cl3).perform();
*/
		// Perform the actions
		//driver.findElement(By.linkText("Calorie Calculator")).click(); 

		/*WebElement el=driver.findElement(By.id("draggable")); 

		Select sl= new Select(el);

		sl.selectByIndex(2);

		List<WebElement> l=sl.getOptions();

		l.size();

		for (int i=0;i<l.size();i++)

		{

		String k=l.get(i).getText();
		System.out.println(k);
		}*/
		//ID
		//driver.findElement(By.id("calcSearchTerm")).sendKeys("Calculator");
		//driver.findElement(By.xpath("//span[@id='bluebtn']")).click();
		//XPATH
		//driver.findElement(By.xpath("//input[@id='csex2']")).click();
		//TAGNAME[@ATTRIBUTE='ATTRIBUTE VALUE']
		
		//CLASS
		//driver.findElement(By.className("//DIV[@class='hicon'"));
		
		 // NAME
       // driver.findElement(By.cssSelector("input[name='scirdsetting']")).click();

        // LINK TEXT
        //driver.findElement(By.cssSelector("a[href='/mortgage-calculator.html']")).click();

        // PARTIAL LINK TEXT
        //driver.findElement(By.cssSelector("a[href*='cal']")).click();

        // TAGNAME
       // driver.findElement(By.cssSelector("div#menu a")).click();

        // ATTRIBUTE (using attribute value)
        //driver.findElement(By.cssSelector("input[value='rad']")).click();	

	}

}
