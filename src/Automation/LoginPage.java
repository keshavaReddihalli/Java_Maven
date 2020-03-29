package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{

@FindBy(name="q")
private WebElement unTextBox;

public LoginPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void setUserName(String un)
{
	unTextBox.sendKeys(un);
}

}



