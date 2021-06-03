package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UiCvPage {



        private static final By START_DATE_SELECTOR =
                By.xpath("//input[@name='startDataJobs'}");

        private WebDriver driver;
        private WebDriverWait wait;

        public UiCvPage(WebDriver driver) {
            this.driver = driver;
            this.wait = new WebDriverWait(driver,30);
        }

        public void fillDate (String date) {
            WebElement input = wait.until(ExpectedConditions
                    .presenceOfElementLocated(START_DATE_SELECTOR));

            ((JavascriptExecutor) driver).executeScript("document.getElementsByClassName('datepicker startDataJobs form-control')[0].removeAttribute('readonly',0);");

            input.sendKeys(date);
        }

    }

