package com.mycompany.tp06;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class LogOut01Test {

    private static SeleniumConfig config;
    private static String url = "https://www.advantageonlineshopping.com";

    private WebDriver driver;
    private Map<String, Object> vars;
    JavascriptExecutor js;

    @Before
    public void setUp() {
        
         js = (JavascriptExecutor) driver;
         vars = new HashMap<String, Object>();

    }

    @After
    public void tearDown() {
       config.getDriver().close();
    }

    @Test
    public void testLogOut01() throws InterruptedException {
        config = new SeleniumConfig();
        config.getDriver().get(url);
        WebDriver driver = config.getDriver();
        driver.get("https://www.advantageonlineshopping.com/#/");
        driver.manage().window().setSize(new Dimension(1565, 993));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("menuUser")).click();
        driver.findElement(By.name("username")).sendKeys("UserTest01");
        driver.findElement(By.name("password")).sendKeys("Test1234");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);
        driver.findElement(By.id("tabletsImg")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("18")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.name("save_to_cart")).click();
        driver.findElement(By.cssSelector("#menuCart > path")).click();
        driver.findElement(By.linkText("REMOVE")).click();
        driver.findElement(By.cssSelector(".containMiniTitle")).click();
        driver.findElement(By.cssSelector(".roboto-medium:nth-child(3)")).click();
        driver.findElement(By.id("menuUser")).click();
        assertThat(driver.findElement(By.cssSelector(".left > .ng-scope")).getText(), is("REMEMBER ME"));
    }
}
