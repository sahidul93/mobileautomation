package pages;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends MobileAPI2 {
    @FindBy(xpath = "//android.widget.EditText[@text='User name']")
    WebElement userName;

    public void sendKeyAccount() {
        userName.sendKeys("example");
    }

}
