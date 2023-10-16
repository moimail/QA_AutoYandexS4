package ru.praktikum;

import org.openqa.selenium.WebDriver;

public class BasePage extends HomePage{

    public static final String MAIN_PAGE_URL = "https://qa-scooter.praktikum-services.ru/";
    public BasePage (WebDriver driver) {
        super(driver);
    }

    public void openMainPage() {
        driver.get(MAIN_PAGE_URL);
    }


}
