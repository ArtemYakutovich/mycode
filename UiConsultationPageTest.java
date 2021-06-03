package ui;

import dtos.ConsultationFormDto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.UiConsultationPage;
import pages.UiMainPage;

public class UiConsultationPageTest {


    static {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\chromedriver.exe");
    }

    @Test
    public void testConsultation_happyPath () {
        //given
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // -> Раскрыть на весь экран
        UiMainPage mainPage = new UiMainPage(driver);

        //when
        mainPage.open();
        UiConsultationPage form = mainPage.openConsultationForm();

        ConsultationFormDto validFormDto = createValidFormDto();
        form.fillForm(validFormDto);
        //then
        driver.close();
    }

        private ConsultationFormDto createValidFormDto () {
            ConsultationFormDto dto = new ConsultationFormDto();
            dto.setName("Bob");
            dto.setSurname("Bobson");
            dto.setEmail("375447749102@yandex.ru");
            dto.setPhone("+375 44 777 5050");
            dto.setDateIndex(1);
            dto.setTimeIndex(2);
            dto.setComment("Hi there");

            return dto;

        }




    @Test
    public void testConsultation_whenWriteWithoutEmail () {
        //given
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // -> Раскрыть на весь экран
        UiMainPage mainPage = new UiMainPage(driver);

        //when
        mainPage.open();
        UiConsultationPage form = mainPage.openConsultationForm();

        ConsultationFormDto createNotWriteEmail = createNotWriteEmail();
        form.fillFormWithoutEmail(createNotWriteEmail);
        //then
        driver.close();
    }

    private ConsultationFormDto createNotWriteEmail () {
        ConsultationFormDto dto = new ConsultationFormDto();
        dto.setName("Bob");
        dto.setSurname("Bobson");
        dto.setPhone("+375 44 777 5050");
        dto.setDateIndex(1);
        dto.setTimeIndex(1);
        dto.setComment("Hi there");

        return dto;

    }


    @Test
    public void testConsultation_whenWriteWithoutName () {
        //given
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // -> Раскрыть на весь экран
        UiMainPage mainPage = new UiMainPage(driver);

        //when
        mainPage.open();
        UiConsultationPage form = mainPage.openConsultationForm();

        ConsultationFormDto createNotWriteName = createNotWriteName();
        form.fillFormWithoutName(createNotWriteName);
        //then
        driver.close();
    }

    private ConsultationFormDto createNotWriteName () {
        ConsultationFormDto dto = new ConsultationFormDto();
        dto.setSurname("Bobson");
        dto.setEmail("375447749102@yandex.ru");
        dto.setPhone("+375 44 777 5050");
        dto.setDateIndex(1);
        dto.setTimeIndex(1);
        dto.setComment("Hi there");

        return dto;

    }


    @Test
    public void testConsultation_whenWriteWithoutSurname () {
        //given
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // -> Раскрыть на весь экран
        UiMainPage mainPage = new UiMainPage(driver);

        //when
        mainPage.open();
        UiConsultationPage form = mainPage.openConsultationForm();

        ConsultationFormDto createNotWriteSurname = createNotWriteSurname();
        form.fillFormWithoutSurname(createNotWriteSurname);
        //then
        driver.close();
    }

    private ConsultationFormDto createNotWriteSurname () {
        ConsultationFormDto dto = new ConsultationFormDto();
        dto.setName("Bob");
        dto.setEmail("375447749102@yandex.ru");
        dto.setPhone("+375 44 777 5050");
        dto.setDateIndex(1);
        dto.setTimeIndex(1);
        dto.setComment("Hi there");

        return dto;

    }


    @Test
    public void testConsultation_whenWriteEnterNumberInName () {
        //given
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // -> Раскрыть на весь экран
        UiMainPage mainPage = new UiMainPage(driver);

        //when
        mainPage.open();
        UiConsultationPage form = mainPage.openConsultationForm();

        ConsultationFormDto createWriteEnterNumberInName = createWriteEnterNumberInName();
        form.fillForm(createWriteEnterNumberInName);
        //then
        driver.close();
    }

    private ConsultationFormDto createWriteEnterNumberInName () {
        ConsultationFormDto dto = new ConsultationFormDto();
        dto.setName("75050");
        dto.setSurname("Bobson");
        dto.setEmail("375447749102@yandex.ru");
        dto.setPhone("+375 44 777 5050");
        dto.setDateIndex(1);
        dto.setTimeIndex(1);
        dto.setComment("Hi there");

        return dto;

    }


    @Test
    public void testConsultation_whenWriteEnterNumberInSurname () {
        //given
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // -> Раскрыть на весь экран
        UiMainPage mainPage = new UiMainPage(driver);

        //when
        mainPage.open();
        UiConsultationPage form = mainPage.openConsultationForm();

        ConsultationFormDto createWriteEnterNumberInSurname = createWriteEnterNumberInSurname();
        form.fillForm(createWriteEnterNumberInSurname);
        //then
        driver.close();
    }

    private ConsultationFormDto createWriteEnterNumberInSurname () {
        ConsultationFormDto dto = new ConsultationFormDto();
        dto.setName("Ricardo");
        dto.setSurname("1234509");
        dto.setEmail("375447749102@yandex.ru");
        dto.setPhone("+375 44 777 5050");
        dto.setDateIndex(2);
        dto.setTimeIndex(1);
        dto.setComment("Hi there");

        return dto;

    }


    @Test
    public void testConsultation_WhenWriteInvalidEmail () {
        //given
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // -> Раскрыть на весь экран
        UiMainPage mainPage = new UiMainPage(driver);

        //when
        mainPage.open();
        UiConsultationPage form = mainPage.openConsultationForm();

        ConsultationFormDto createWhenWriteInvalidEmail = createWhenWriteInvalidEmail();
        form.fillForm(createWhenWriteInvalidEmail);
        //then
        driver.close();
    }

    private ConsultationFormDto createWhenWriteInvalidEmail () {
        ConsultationFormDto dto = new ConsultationFormDto();
        dto.setName("Bob");
        dto.setSurname("Bobson");
        dto.setEmail("375447749102@yandex.ri");
        dto.setPhone("+375 44 777 5050");
        dto.setDateIndex(3);
        dto.setTimeIndex(1);
        dto.setComment("Hi there");

        return dto;

    }








}

