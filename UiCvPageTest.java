package ui;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.UiCvPage;
import pages.UiMainPage;

public class UiCvPageTest {

    static {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\chromedriver.exe");
    }

    @Test
    public void openCvPage() {
        //given
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // -> Раскрыть на весь экран
        UiMainPage mainPage = new UiMainPage(driver);

        //when
        mainPage.open();
        UiCvPage openCvPage = mainPage.openCvPage();


        //then
        driver.close();
    }
}
