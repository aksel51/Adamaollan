package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulities.Driver;


public class DonePages {
    public DonePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //AnaSayfa Sing in olma kısmı
    @FindBy(xpath = "//li[@id='account-menu']") public WebElement insanIcon;

    @FindBy(xpath = "//a[@class='dropdown-item']") public WebElement firstSingIn;

    @FindBy(xpath = "//input[@name='username']") public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@name='password']") public WebElement passwordTextBox;

    @FindBy(xpath = "//button[@type='submit']") public WebElement singInButton;








}
