package com.select;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectall {
	
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://etrain.info/train/Chennai-Sf-Exp-12604/schedule");
		
	driver.findElement(By.xpath("//input[@id='bartrainid']")).sendKeys("chennai");
	
	WebDriverWait wit = new  WebDriverWait(driver,Duration.ofSeconds(2000));
			List<WebElement> opto = wit.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='et_autocomplete']")));

	for(int i=0; i<=opt.size(); i++){
		
		System.out.println(opt.get[i].getText());


		
	}
	
	}}
