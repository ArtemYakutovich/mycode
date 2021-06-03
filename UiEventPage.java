package pages;

import dtos.EventFormDto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UiEventPage {

// "//a[@href='/create-cv']"

    private static final By OPEN_EVENT_BUTTON_SELECTOR =
     //       By.xpath("//a[@class='events-name'");
     //       By.xpath("//a[@href='/events/27f32de8-21c3-471b-a068-efc69438f5eb']");
            By.xpath ("//div[@class='events-card']//a[@href='/events/ac5b412e-c6fb-4b0d-a5e1-b9ba1d2ee864']");
    private static final By SIGN_UP_BUTTON_SELECTOR =
            By.xpath("div[@class='buttonWrapper']//a[contains(text(), '#', 'Записаться')]");
      //      By.xpath("//a[contains(text(), 'Записаться')]");
    private static final By NAME_INPUT_SELECTOR =
            By.xpath("//input[@id ='nameEvent']");
    private static final By SURNAME_INPUT_SELECTOR =
            By.xpath("//input[@id ='surnameEvent']");
    private static final By EMAIL_INPUT_SELECTOR =
            By.xpath("//input[@id ='emailEvent']");
    private static final By WORK_STUDY_INPUT_SELECTOR =
            By.xpath("//input[@id ='jobs']");


    private WebDriver driver;
    private WebDriverWait wait;

    public UiEventPage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 500);
    }



    public UiEventPage openEvent () {
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated
                (OPEN_EVENT_BUTTON_SELECTOR));

        button.click();

        UiEventPage eventForm = new UiEventPage(driver);
        return  eventForm;
    }

    public void openEventForm () {

        WebElement link  = driver.findElement (SIGN_UP_BUTTON_SELECTOR);

        link.click();

    }





    public void fillNameInput(String name) {

        WebElement nameInput = driver.findElement(NAME_INPUT_SELECTOR);

        wait.until(ExpectedConditions.elementToBeClickable(nameInput));
        nameInput.sendKeys(name);

    }

    public void fillSurnameInput(String surname) {
        WebElement surnameInput = driver.findElement(SURNAME_INPUT_SELECTOR);
        surnameInput.sendKeys(surname);
    }

    public void fillEmailInput(String email) {
        WebElement emailInput = driver.findElement(EMAIL_INPUT_SELECTOR);
        emailInput.sendKeys(email);
    }

    public void fillWorkStudyInput (String workStudy) {
        WebElement workStudyInput = driver.findElement(WORK_STUDY_INPUT_SELECTOR);
        workStudyInput.sendKeys(workStudy);
    }



    public void fillForm (EventFormDto validFormDto) {
        fillNameInput(validFormDto.getName());
        fillSurnameInput(validFormDto.getSurname());
        fillEmailInput(validFormDto.getEmail());
        fillWorkStudyInput(validFormDto.getWorkStudy());

    }



}
