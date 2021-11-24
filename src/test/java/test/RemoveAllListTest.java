package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.AddCategoryPage;
import page.BasePage;

public class RemoveAllListTest {
	
	WebDriver driver;

   
   @Test 
   public void validateRemoveAllItemsInTheList() {
   	 
	 driver=BasePage.init();
	
	AddCategoryPage addCategory=PageFactory.initElements(driver, AddCategoryPage.class);
	
	addCategory.selectToggleAll();
	
	Assert.assertEquals("Validate All List items Selected", addCategory.checkAllListItemSelected(), true);
	
	addCategory.clickRemoveButton();
	
	Assert.assertEquals("Validate All List items are removed", addCategory.validateRemoveAllListItem(), true);
	
	
	
	
	
	
	

}

}