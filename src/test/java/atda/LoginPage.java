package atda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public By getUserNameLocator(){
        return By.id("user-name");
    }

    public void open() {
        driver.get("https://www.saucedemo.com/");
    }

    public boolean isLoaded() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(getUserNameLocator())).isDisplayed();
    }

    public void login(String username, String password) {
        driver.findElement(getUserNameLocator()).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
}
