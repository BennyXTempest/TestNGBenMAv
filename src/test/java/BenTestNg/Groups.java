package BenTestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Groups {

	public class AnnotationPriopractice {
		WebDriver driver;
		
		
		@Test(priority=1,groups= {"Sanity","Regression"})
	
		void OpenApp()
		{
			driver=new ChromeDriver();
			driver.get("https://www.demo.guru99.com/v4");
			
			
			
		}
		@Test(priority=2,groups= {"Sanity","Regression"})
		void Login()
		{
			
			driver.findElement(By.name("uid")).sendKeys("mngr514943");
			driver.findElement(By.name("password")).sendKeys("qUnatUn");
			driver.findElement(By.name("btnLogin")).click();
			WebElement Text=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee"));
			if(Text.isDisplayed())
			{
				System.out.println("Login Success");
			}
			
					
		}
		@Test(priority=3,groups= {"Regression"})

		void Search()
		{
			System.out.println("Search");
			
		}
		@Test(priority=4,groups= {"Sanity"})
		void Advsearch()
		{
			System.out.println("Advsearch");
		}
		
		
		@Test(priority=5,groups= {"Sanity"})
		void Teardown()
		{
			
			driver.close();
			
			
		}
		
		
		
	}
}
