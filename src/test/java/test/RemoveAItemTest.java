package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.AddCategoryPage;
import page.BasePage;

public class RemoveAItemTest {
     WebDriver driver;
     String list="Food";
    
    @Test 
    public void validateRemoveButton() {
    	 
	 driver=BasePage.init();
	
	AddCategoryPage addCategory=PageFactory.initElements(driver, AddCategoryPage.class);
	
	addCategory.selectAListItem(list);
	
	addCategory.clickRemoveButton();
	
    Assert.assertEquals("List item is removed", addCategory.validateRemoveAListItem(list), false);
    
     }
}
