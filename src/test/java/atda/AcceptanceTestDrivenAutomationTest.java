//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package atda;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class AcceptanceTestDrivenAutomationTest {
    private WebDriver driver;

    @BeforeEach
    public void setup()
    {
        driver = new EdgeDriver();
    }
    @AfterEach
    public void cleanup()
    {
        driver.quit();
    }

    @Test
    public void shouldOpen()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        Assertions.assertTrue(loginPage.isLoaded());
    }

    @Test
    public void shouldLogin()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.open();
        Assertions.assertTrue(loginPage.isLoaded());

        loginPage.login("standard_user", "secret_sauce");
        Assertions.assertTrue(new ProductsPage(driver).isLoaded());
    }


   /* private WebDriver getDriver() {
        System.setProperty("webDriver.chrome.driver","resources/chromedriver");
        return new ChromeDriver();

    }*/

}

