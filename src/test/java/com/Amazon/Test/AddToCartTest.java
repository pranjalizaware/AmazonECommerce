package com.Amazon.Test;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Amazon.base.BaseClassAmazon;
import com.Amazon.page.AddToCartPage;
import com.Amazon.page.SearchProduct;
import com.Amazon.page.SignUpPage;



public class AddToCartTest extends BaseClassAmazon {
	@Test
	public void AddedToCart() throws InterruptedException
	{
		SignUpPage signobj=new SignUpPage(driver);
	    signobj.signupApp();
	    Thread.sleep(2000);
		SearchProduct serachobject=new SearchProduct(driver);
		serachobject.searchBag();
		Thread.sleep(2000);
		AddToCartPage cart=new AddToCartPage(driver);
		cart.AddtoCart(driver);
		//WebElement cartNo=driver.findElement(By.linkText("8"));
		WebElement Detailedpage=driver.findElement(By.linkText("Maa Laxmi Handloom Begam Puri Khadi Cotton Saree With Running Blouse Piece, SKU_037"));
		assertEquals(true, Detailedpage.isDisplayed());
		
	}

}
