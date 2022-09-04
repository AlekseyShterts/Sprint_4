package ru.yandex.sprint4;

import org.openqa.selenium.WebDriver;

public abstract class  BasePage {
    protected final WebDriver webDriver;

    protected BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
}
