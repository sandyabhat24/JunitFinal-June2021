package test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;
import page.AddCategoryPage;
import page.BasePage;


public class ToggleAllTest extends BasePage {
	WebDriver driver;
	
	@Test
	public void validateToggleAllCheckBox() {
		
		driver=BasePage.init();
		
		AddCategoryPage addCategory=PageFactory.initElements(driver, AddCategoryPage.class);
		
		
		addCategory.selectToggleAll();
	    
		Assert.assertEquals("Validate Toggle All Selected", addCategory.checkIfToggleSelected(), true);
		
		
		Assert.assertEquals("Validate All List items Selected", addCategory.checkAllListItemSelected(), true);
		
	//	BasePage.tearDown();
		
	}

}
