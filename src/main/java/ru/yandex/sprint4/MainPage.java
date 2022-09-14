package ru.yandex.sprint4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {
    //локаторы вопросов о важном и ответы на них
    private By quest1 = By.id("accordion__heading-0");
    private By answerOnQuest1 = By.xpath(".//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    private By quest2 = By.id("accordion__heading-1");
    private By answerOnQuest2 = By.xpath(".//p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");
    private By quest3 = By.id("accordion__heading-2");
    private By answerOnQuest3 = By.xpath(".//p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");
    private By quest4 = By.id("accordion__heading-3");
    private By answerOnQuest4 = By.xpath(".//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");
    private By quest5 = By.id("accordion__heading-4");
    private By answerOnQuest5 = By.xpath(".//p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");
    private By quest6 = By.id("accordion__heading-5");
    private By answerOnQuest6 = By.xpath(".//p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");
    private By quest7 = By.id("accordion__heading-6");
    private By answerOnQuest7 = By.xpath(".//p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");
    private By quest8 = By.id("accordion__heading-7");
    private By answerOnQuest8 = By.xpath(".//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");
    //локатор кнопки Заказать внизу страницы
    private By orderButtonOnBottom = By.cssSelector(".Button_Button__ra12g.Button_Middle__1CSJM");
    //локатор кнопки Заказать в заголовке страницы
    private By orderButtonOnTop = By.className("Button_Button__ra12g");
    //локатор кнопки закрытия окна оповещения о использовании куки
    private By cookieButton = By.id("rcc-confirm-button");

    public MainPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void open() {
        webDriver.get("https://qa-scooter.praktikum-services.ru/");
    }

    public By getQuest1() {
        return quest1;
    }

    public By getAnswerOnQuest1() {
        return answerOnQuest1;
    }

    public By getQuest2() {
        return quest2;
    }

    public By getAnswerOnQuest2() {
        return answerOnQuest2;
    }

    public By getQuest3() {
        return quest3;
    }

    public By getAnswerOnQuest3() {
        return answerOnQuest3;
    }

    public By getQuest4() {
        return quest4;
    }

    public By getAnswerOnQuest4() {
        return answerOnQuest4;
    }

    public By getQuest5() {
        return quest5;
    }

    public By getAnswerOnQuest5() {
        return answerOnQuest5;
    }

    public By getQuest6() {
        return quest6;
    }

    public By getAnswerOnQuest6() {
        return answerOnQuest6;
    }

    public By getQuest7() {
        return quest7;
    }

    public By getAnswerOnQuest7() {
        return answerOnQuest7;
    }

    public By getQuest8() {
        return quest8;
    }

    public By getAnswerOnQuest8() {
        return answerOnQuest8;
    }

    public boolean checkIsDisplayedAnswer(By answer, By quest) {
        new WebDriverWait(webDriver, 2).until(ExpectedConditions.visibilityOfElementLocated(answer));
        return webDriver.findElement(quest).isDisplayed();
    }

    public void scrollPage(By quest) {
        WebElement element = webDriver.findElement(quest);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void clickQuest(By quest) {
        webDriver.findElement(quest).click();
    }

    public void clickOrderButtonOnBottom(By quest) {
        WebElement element = webDriver.findElement(quest);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", element);
        webDriver.findElement(orderButtonOnBottom).click();
    }

    public void clickOrderButtonOnTop() {
        webDriver.findElement(orderButtonOnTop).click();
    }

    public void clickCookieButton() {
        webDriver.findElement(cookieButton).click();
    }
}

