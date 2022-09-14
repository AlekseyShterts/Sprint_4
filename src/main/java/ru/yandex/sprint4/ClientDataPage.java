package ru.yandex.sprint4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClientDataPage extends BasePage {
    //локатор поля ввода имени
    private By nameField = By.xpath(".//input[@placeholder='* Имя']");
    //локатор поля ввода фамилии
    private By secondNameField = By.xpath(".//input[@placeholder='* Фамилия']");
    //локатор поля ввода адреса доставки заказа
    private By addressField = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    //локатор поля ввода станции метро
    private By subwayStationField = By.xpath(".//input[@placeholder='* Станция метро']");
    //локатор поля ввода контактного телефона
    private By phoneField = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    //локатор кнопки Далее
    private By nextButton = By.xpath(".//button[text()='Далее']");

    public ClientDataPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void setNameField(String name) {
        webDriver.findElement(nameField).click();
        webDriver.findElement(nameField).sendKeys(name);
    }

    public void setSecondNameField(String secondName) {
        webDriver.findElement(secondNameField).click();
        webDriver.findElement(secondNameField).sendKeys(secondName);
    }

    public void setAddressField(String address) {
        webDriver.findElement(addressField).click();
        webDriver.findElement(addressField).sendKeys(address);
    }

    public void setSubwayStationField(String station) {
        webDriver.findElement(subwayStationField).click();
        //локатор нужной станции метро
        webDriver.findElement(By.xpath(".//div[text()='" + station + "']")).click();
    }

    public void setPhoneField(String phone) {
        webDriver.findElement(phoneField).click();
        webDriver.findElement(phoneField).sendKeys(phone);
    }

    public void clickNextButton() {
        webDriver.findElement(nextButton).click();
    }

    public void inputClientDataForm(String name, String secondName, String address, String station, String phone) {
        setNameField(name);
        setSecondNameField(secondName);
        setAddressField(address);
        setSubwayStationField(station);
        setPhoneField(phone);
    }
}