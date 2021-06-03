package ui;


import dtos.EventFormDto;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.UiEventPage;
import pages.UiMainPage;

public class UiEventPageTest {


    static {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\chromedriver.exe");
    }

    @Test
    public void testEvent_happyPath () {
        //given
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // -> Раскрыть на весь экран
        UiMainPage mainPage = new UiMainPage(driver);
        UiEventPage eventPage = new UiEventPage(driver);


        //when
        mainPage.open();
        mainPage.openEventPage();
        eventPage.openEvent();

        UiEventPage uiEventPage = new UiEventPage(driver);
        uiEventPage.openEventForm();








        //then
        //driver.close();
    }




//    private EventFormDto createValidFormDto () {
//        EventFormDto dto = new EventFormDto();
//        dto.setName("Bob");
//        dto.setSurname("Bobson");
//        dto.setEmail("375447749102@yandex.ru");
//        dto.setWorkStudy("Yes");
//
//        return dto;

//    }
}
