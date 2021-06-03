package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UiStoriesPage {

    private static final By OPEN_STORY_SELECTOR =
            By.xpath("//div[@class='storiesModalOpen']//a[contains(text(), 'Смотреть')]");


    private WebDriver driver;
    private WebDriverWait wait;

    public UiStoriesPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
    }


    public void openFirstStory() {

        WebElement link = driver.findElement(OPEN_STORY_SELECTOR);

        link.click();

    }
}