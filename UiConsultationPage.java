package pages;

import dtos.ConsultationFormDto;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class UiConsultationPage {


    private static final By NAME_INPUT_SELECTOR = By.xpath("//input[@id ='name']");
    private static final By SURNAME_INPUT_SELECTOR = By.xpath("//input[@id ='surname']");
    private static final By EMAIL_INPUT_SELECTOR = By.xpath("//input[@id ='email']");
    private static final By PHONE_INPUT_SELECTOR = By.xpath("//input[@id ='tel']");
    private static final By IS_STUDENT_CHECKBOX_SELECTOR = By.xpath("//label[@for ='studentStep']");
    private static final By GROUP_NUMBER_INPUT_SELECTOR = By.xpath("//input[@id ='numberGroup']");
    private static final By COMMENT_INPUT_SELECTOR = By.xpath("//textarea[@id ='exampleFormControlTextarea1']");
    private static final By SUBMIT_BUTTON_SELECTOR = By.xpath("//button[@id ='submit']");
    private static final By SELECT_DAY_SELECTOR = By.xpath("//select[@id='inputStateDay']");
    private static final By SELECT_TIME_SELECTOR = By.xpath("//select[@id='inputStateTime']");


    private WebDriver driver;
    private WebDriverWait wait;

    public UiConsultationPage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);
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

    public void fillPhoneInput(String phone) {
        WebElement phoneInput = driver.findElement(PHONE_INPUT_SELECTOR);
        phoneInput.sendKeys(phone);
    }

    public void clickCheckbox(boolean isStudent) {
        WebElement checkbox = driver.findElement(IS_STUDENT_CHECKBOX_SELECTOR);
        checkbox.click();
        //checkbox.isSelected()
    }

    public void fillGroupNumberInput(String number) {
        WebElement groupNumberInput = driver.findElement(GROUP_NUMBER_INPUT_SELECTOR);
        groupNumberInput.sendKeys(number);
    }

    public void fillCommentInput(String comment) {
        WebElement commentInput = driver.findElement(COMMENT_INPUT_SELECTOR);
        commentInput.sendKeys(comment);
    }


    public void clickSubmitButton() {
        WebElement submitButton = driver.findElement(SUBMIT_BUTTON_SELECTOR);
        submitButton.click();
    }


    public void selectDay (int index) {
        WebElement daySelector = driver.findElement(SELECT_DAY_SELECTOR);

        Select select = new Select(daySelector);
        select.selectByIndex(index);
    }
    public void selectTime (int index) {
        WebElement timeSelector = driver.findElement(SELECT_TIME_SELECTOR);
        Select select = new Select(timeSelector);

        List<WebElement> options = select.getOptions();
        for (int i = 0; i < 50|| options.isEmpty(); i++) {
            System.out.println("Жду...");
            options = select.getOptions();
        }

        select.selectByIndex(index);
    }

    public void fillForm (ConsultationFormDto validFormDto) {
        fillNameInput(validFormDto.getName());
        fillSurnameInput(validFormDto.getSurname());
        fillEmailInput(validFormDto.getEmail());
        fillPhoneInput(validFormDto.getPhone());
        fillCommentInput(validFormDto.getComment());
        selectDay(validFormDto.getDateIndex());
        selectTime(validFormDto.getTimeIndex());
        clickSubmitButton();
    }

    public void fillFormWithoutEmail (ConsultationFormDto createNotWriteEmail) {
        fillNameInput(createNotWriteEmail.getName());
        fillSurnameInput(createNotWriteEmail.getSurname());
        fillPhoneInput(createNotWriteEmail.getPhone());
        fillCommentInput(createNotWriteEmail.getComment());
        selectDay(createNotWriteEmail.getDateIndex());
        selectTime(createNotWriteEmail.getTimeIndex());
        clickSubmitButton();
    }


    public void fillFormWithoutName (ConsultationFormDto createNotWriteName) {

        fillSurnameInput(createNotWriteName.getSurname());
        fillEmailInput(createNotWriteName.getEmail());
        fillPhoneInput(createNotWriteName.getPhone());
        fillCommentInput(createNotWriteName.getComment());
        selectDay(createNotWriteName.getDateIndex());
        selectTime(createNotWriteName.getTimeIndex());
        clickSubmitButton();
    }


    public void fillFormWithoutSurname (ConsultationFormDto createNotWriteSurname) {

        fillNameInput(createNotWriteSurname.getName());
        fillEmailInput(createNotWriteSurname.getEmail());
        fillPhoneInput(createNotWriteSurname.getPhone());
        fillCommentInput(createNotWriteSurname.getComment());
        selectDay(createNotWriteSurname.getDateIndex());
        selectTime(createNotWriteSurname.getTimeIndex());
        clickSubmitButton();
    }
}
