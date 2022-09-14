package ru.yandex.sprint4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class CheckPositiveCompleteOrder extends BaseUITest {
    private final String name;
    private final String secondName;
    private final String address;
    private final String station;
    private final String phone;
    private final String date;
    private final String period;
    private final String color;
    private final String comment;

    public CheckPositiveCompleteOrder(String name, String secondName, String address, String station, String phone, String date, String period, String color, String comment) {
        this.name = name;
        this.secondName = secondName;
        this.address = address;
        this.station = station;
        this.phone = phone;
        this.date = date;
        this.period = period;
        this.color = color;
        this.comment = comment;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getDataForPositiveCompleteOrder() {
        return new Object[][]{
                {"Александр", "Невский", "Чудское озеро 1", "Беговая", "89990006767", "10", "сутки", "black", "Тут был Саня!"},
                {"Дмитрий", "Иванович", "Куликово поле 2", "Трубная", "+79990006767", "21", "четверо суток", "gray", "Тут был Димон!"}
        };
    }

    @Before
    public void closeCookie() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickCookieButton();
    }

    @Test
    public void checkPositiveCompleteOrderWithTopButtonOrder() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickOrderButtonOnTop();
        ClientDataPage clientDataPage = new ClientDataPage(webDriver);
        clientDataPage.inputClientDataForm(name, secondName, address, station, phone);
        clientDataPage.clickNextButton();
        AboutRentPage aboutRentPage = new AboutRentPage(webDriver);
        aboutRentPage.inputAboutRentDataForm(date, period, color, comment);
        aboutRentPage.clickOrderButton();
        aboutRentPage.clickApproveOrderButton();
        boolean isDisplayed = aboutRentPage.checkIsDisplayedApprovedOrderWindow();
        Assert.assertTrue("Approved order window is not displayed", isDisplayed);
    }

    @Test
    public void checkPositiveCompleteOrderWithBottomButtonOrder() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickOrderButtonOnBottom(mainPage.getQuest1());
        ClientDataPage clientDataPage = new ClientDataPage(webDriver);
        clientDataPage.inputClientDataForm(name, secondName, address, station, phone);
        clientDataPage.clickNextButton();
        AboutRentPage aboutRentPage = new AboutRentPage(webDriver);
        aboutRentPage.inputAboutRentDataForm(date, period, color, comment);
        aboutRentPage.clickOrderButton();
        aboutRentPage.clickApproveOrderButton();
        boolean isDisplayed = aboutRentPage.checkIsDisplayedApprovedOrderWindow();
        Assert.assertTrue("Approved order window is not displayed", isDisplayed);
    }
}
