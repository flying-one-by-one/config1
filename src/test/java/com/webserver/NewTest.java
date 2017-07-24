package com.webserver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.ie.driver","C:\\webdriver\\IEDriverServer.exe");
	  WebDriver driver=new InternetExplorerDriver();
	  String testUrl="http://www.baidu.com";
	  driver.get(testUrl);
  
//	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	  WebElement input=driver.findElement(By.id("kw"));
//	  input.sendKeys("地球");
//	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	  WebElement search=driver.findElement(By.id("su"));
//	  System.out.println(search.getLocation());
//	  search.click();
//	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	  WebElement lick=driver.findElement(By.xpath("//*[@id=\"1\"]/h3/a"));
//	  lick.click();
//	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	  driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);  
//      System.out.println(driver.getTitle());
//      driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//       System.out.println(driver.getTitle()+"\n"+driver.getCurrentUrl());
       
//      WebDriver driver1=new ChromeDriver();
//		String url="http://www.bing.com";
//		driver1.get(url);
//		String title=driver1.getTitle();
//		String currentUrl=driver1.getCurrentUrl();
//		System.out.println(title+"\n"+currentUrl);
       
//       System.setProperty("webdriver.chrome.driver","C:\\webdriver\\chromedriver.exe");
// 	  WebDriver driver=new ChromeDriver();
// 	  //max size the browser
// 	  driver.manage().window().maximize();
// 	  String testUrl="http://cn.bing.com/";
// 	  driver.get(testUrl);
// 	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
// 	  WebElement input=driver.findElement(By.id("sb_form_q"));
// 	  input.sendKeys("selenium");
// 	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
// 	  WebElement search=driver.findElement(By.id("sb_form_go"));
// 	  System.out.print(search.getLocation());
// 	  search.click();
// 	  driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
//// 	  Thread.sleep(2000);
// 	  WebElement link=driver.findElement(By.xpath("//*[@id=\"b_results\"]/li[2]/div[1]/h2/a/strong/i/i")); 
// 	  link.click();
// 	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//// 	  Thread.sleep(5000);
// 	  driver.switchTo().window(driver.getWindowHandles().toArray(new String[0])[1]);
// 	  //get page title
// 	  System.out.println(driver.getTitle());
// 	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
// 	  System.out.println(driver.getTitle()+"\n"+driver.getCurrentUrl());
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
