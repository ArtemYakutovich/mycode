package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UiMainPage {

    private static final String PAGE_URL = "http://13.53.214.122/";

    private static final By OPEN_CONSULTATION_BUTTON_SELECTOR =
            By.xpath("//ul[@id='myMenu']//a[contains(text(), 'Консультация')]");

    private static final By OPEN_EVENT_PAGE_SELECTOR =
            By.xpath("//ul[@id='myMenu']//a[contains(text(), 'Мероприятия')]");

    private static final By OPEN_CV_PAGE_SELECTOR =
            By.xpath("//a[@href='/create-cv']");

    private static final By OPEN_PROJECTS_PAGE_SELECTOR =
            By.xpath("//ul[@id='myMenu']//a[contains(text(), 'Проекты')]");

    private static final By OPEN_STORIES_PAGE_SELECTOR =
            By.xpath("//ul[@id='myMenu']//a[contains(text(), 'Истории')]");

    private static final By OPEN_VACANCIES_PAGE_SELECTOR =
            By.xpath("//ul[@id='myMenu']//a[contains(text(), 'Вакансии')]");

    private static final By OPEN_PARTNERS_PAGE_SELECTOR =
            By.xpath("//ul[@id='myMenu']//a[contains(text(), 'Партнёры')]");








    private WebDriver driver;
    private WebDriverWait wait;

    public UiMainPage (WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 30);

    }

    public void open () {
        driver.get(PAGE_URL);
    }

    public UiConsultationPage openConsultationForm () {
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated
                (OPEN_CONSULTATION_BUTTON_SELECTOR));

        button.click();

        UiConsultationPage form = new UiConsultationPage (driver);
        return form;
    }

    public UiEventPage openEventPage () {
        WebElement button = wait.until(ExpectedConditions.presenceOfElementLocated
                (OPEN_EVENT_PAGE_SELECTOR));

        button.click();

        UiEventPage eventPage = new UiEventPage (driver);
        return eventPage;
    }

    public UiCvPage openCvPage () {
        WebElement button = wait.until(ExpectedConditions
                .presenceOfElementLocated(OPEN_CV_PAGE_SELECTOR));

        button.click();

        UiCvPage cvPage = new UiCvPage(driver);
        return cvPage;
    }

//    public UiProjectsPage openProjectsPage () {
//        WebElement button = wait.until(ExpectedConditions
//                .presenceOfElementLocated(OPEN_PROJECTS_PAGE_SELECTOR));
//
//        button.click();
//
//        UiProjectsPage projectsPage = new UiProjectsPage(driver);
//        return projectsPage;
//    }

    public UiStoriesPage openStoriesPage () {
        WebElement button = wait.until(ExpectedConditions
                .presenceOfElementLocated(OPEN_STORIES_PAGE_SELECTOR));

        button.click();

        UiStoriesPage storiesPage = new UiStoriesPage(driver);
        return storiesPage;
    }
//
//    public UiVacanciesPage openVacanciesPage () {
//        WebElement button = wait.until(ExpectedConditions
//                .presenceOfElementLocated(OPEN_VACANCIES_PAGE_SELECTOR));
//
//        button.click();
//
//        UiVacanciesPage vacanciesPage = new UiVacanciesPage(driver);
//        return vacanciesPage;
//    }

//    public UiPartnersPage openPartnersPage () {
//        WebElement button = wait.until(ExpectedConditions
//                .presenceOfElementLocated(OPEN_PARTNERS_PAGE_SELECTOR));
//
//        button.click();
//
//        UiPartnersPage partnersPage = new UiVPartnersPage(driver);
//        return partnersPage;
//    }









}
