package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AuthenticationPage{
    private WebDriver driver;

    @FindBy(css = "form#login-form input[type='email'] ")
    private WebElement emailTextfield;

    @FindBy(css = "form#login-form input[type='password'] ")
    private WebElement passwordTextfield;

    @FindBy(css = "form#login-form button[type='submit'] ")
    private WebElement loginButton;


    public AuthenticationPage(WebDriver driver) {
      this.driver = driver;

      // This call sets the WebElement fields.
      PageFactory.initElements(driver, this);
    }

    public void fillInEmail(String email){
        emailTextfield.sendKeys(email);
    }

    public void fillInPassword(String password){
        passwordTextfield.sendKeys(password);
    }

    public void clickSubmitButton(){
        loginButton.click();
    }

    public void login(String email, String password) {
        emailTextfield.sendKeys(email);
        passwordTextfield.sendKeys(password);
        loginButton.click();
    }
}

