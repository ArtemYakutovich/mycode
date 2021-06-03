package ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.UiCvPage;
import pages.UiMainPage;
import pages.UiStoriesPage;

public class UiStoriesPageTest {

    static {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\chromedriver.exe");
    }

    @Test
    public void openStoriesPage() {
        //given
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // -> Раскрыть на весь экран
        UiMainPage mainPage = new UiMainPage(driver);

        //when
        mainPage.open();
        UiStoriesPage openStoriesPage = mainPage.openStoriesPage();
        openStoriesPage.openFirstStory();


        //then
        driver.close();
    }
}
