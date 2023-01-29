package pageobjects;

import baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class HomePage extends BaseClass {
    public HomePage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(css="#recently-sold > div.row > div > h1")
    WebElement homePageVerifyText;

   public boolean homePageText(){
       return  homePageVerifyText.isDisplayed();
   }

}
