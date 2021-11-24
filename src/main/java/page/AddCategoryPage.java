package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCategoryPage {
	WebDriver driver;
	int count=0;
	String category="Food";
	boolean deleted=false;
	
	public AddCategoryPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy (how=How.NAME, using="allbox") WebElement TOGGLE_CHECKBOX_ELEMENT;
	@FindBy (how=How.CSS, using="li>input") List<WebElement> LIST_CHECKBOX_ELEMENT;
	@FindBy (how=How.CSS, using="li") List<WebElement> LIST_ITEM_ELEMENT;
	//@FindBy (how=How.XPATH, using="//li[contains(text(),'None')]") List<WebElement> LIST_LISTNAME_ELEMENT;
	@FindBy (how=How.CSS, using="div.controls>input:nth-of-type(1)") WebElement REMOVE_BUTTON_ELEMENT;
	
	public void selectToggleAll() {
		TOGGLE_CHECKBOX_ELEMENT.click();
	}
	
	public boolean checkIfToggleSelected() {
		return TOGGLE_CHECKBOX_ELEMENT.isSelected();
	} 
	
    public boolean checkAllListItemSelected() {
    	System.out.println(LIST_CHECKBOX_ELEMENT.get(1).getText());
    	
    	for(int i=0;i<LIST_CHECKBOX_ELEMENT.size();i++) {
    		
    	if(LIST_CHECKBOX_ELEMENT.get(i).isSelected()) {
    		count++;
    	      }
    	}
    	
    	if (count==LIST_CHECKBOX_ELEMENT.size())
    		return true;
    	else
    		return false;
    }
    
    
    
    public void selectAListItem(String listname) {
    	
    	for(int i=0;i<LIST_ITEM_ELEMENT.size();i++) {
    		
        	 if(LIST_ITEM_ELEMENT.get(i).getText().contains(listname)) 
        		LIST_CHECKBOX_ELEMENT.get(i).click();	      
        }     
    	   
    }
    
   public void clickRemoveButton() {
	   REMOVE_BUTTON_ELEMENT.click();
    }
   
   public boolean validateRemoveAListItem(String listname) {
	   
	   for(int i=0;i<LIST_ITEM_ELEMENT.size();i++) {
	   if (LIST_ITEM_ELEMENT.get(i).getText().contains(listname)) {
		   deleted=false;
	       break;
	        }
	   }	   
	   return deleted;
   }
   
   
   public boolean validateRemoveAllListItem() {
	   if(LIST_ITEM_ELEMENT.size()==0)
	        return true;
	   else
		   return false;
   }
  
   
}
