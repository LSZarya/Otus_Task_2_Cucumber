package Leson_cucumber_tho;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


import java.util.concurrent.TimeUnit;



public class MyStep extends RunCucumberTest{

//    public static EventFiringWebDriver driver;
//    protected WebDriverWait wait;
//
    @Given("Text Text Text Text")
    public void openSite() {
        driver.get("https://otus.ru/");
    }
//
//    @BeforeStep
//    public void setUp(ITestContext context) {
//        driver = new EventFiringWebDriver(setupDriver("CHROME"));
//        driver.register(new MarkBeforeClickListener());
//
//        context.setAttribute("driver", driver);
//        wait = new WebDriverWait(driver, 5);
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//
//    }
//
//    @AfterStep
//    public void teamDown() {
//        driver.quit();
//    }
//
//    public static WebDriver setupDriver(String driverType) {
//        switch (driverType) {
//            case "CHROME":
//                WebDriverManager.chromedriver().setup();
//                return new ChromeDriver();
//            case "FIREFOX":
//                WebDriverManager.firefoxdriver().setup();
//                return new FirefoxDriver();
//            case "OPERA":
//                WebDriverManager.operadriver().setup();
//                return new OperaDriver();
//            default:
//                throw new WebDriverException("тип драйвера не верный");
//        }
//    }

//    @Given("Text Text Text Text")
//    public void textTextTextText() {
//        WebDriver driver;
//
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//        driver.get("https://otus.ru/");
//
//        driver.quit();
//    }
}
