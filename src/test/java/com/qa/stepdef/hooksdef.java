package com.qa.stepdef;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooksdef {
        WebDriver driver;

        @Before
        public void beforeScenario() {

            System.setProperty("webdriver.chrome.driver", "C:/Users/jyotirani/Downloads/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().deleteAllCookies();
        //    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
       //     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }


        @After
        public void afterScenario() {
            driver.close();
           // driver.quit();

        }


        @Given("user is already on login page")
        public void user_is_already_on_login_page() {
           driver.get("https://www.facebook.com/login/");
        }

        @When("title of login page is facebook")
        public void title_of_login_page_is_facebook() {
            String title = driver.getTitle();
            System.out.println(title);
            Assert.assertEquals("Log in to Facebook | Facebook",title);
        }

        @Then("user enters username and password")
        public void user_enters_username_and_password() {
            driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7060145691");
            driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("paraswalia");
        }

        @Then("user clicks on login button")
        public void user_clicks_on_login_button() {
            driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
        }
}
