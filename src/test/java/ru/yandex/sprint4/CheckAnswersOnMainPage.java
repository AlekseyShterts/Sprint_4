package ru.yandex.sprint4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CheckAnswersOnMainPage extends BaseUITest {

    @Before
    public void closeCookie() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.clickCookieButton();
    }

    @Test
    public void checkQuest1OnMainPage() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.scrollPage(mainPage.getQuest1());
        mainPage.clickQuest(mainPage.getQuest1());
        boolean isDisplayed = mainPage.checkIsDisplayedAnswer(mainPage.getAnswerOnQuest1(), mainPage.getQuest1());
        Assert.assertTrue("Answer on quest 1 is not displayed", isDisplayed);
    }

    @Test
    public void checkQuest2OnMainPage() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.scrollPage(mainPage.getQuest2());
        mainPage.clickQuest(mainPage.getQuest2());
        boolean isDisplayed = mainPage.checkIsDisplayedAnswer(mainPage.getAnswerOnQuest2(), mainPage.getQuest2());
        Assert.assertTrue("Answer on quest 2 is not displayed", isDisplayed);
    }

    @Test
    public void checkQuest3OnMainPage() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.scrollPage(mainPage.getQuest3());
        mainPage.clickQuest(mainPage.getQuest3());
        boolean isDisplayed = mainPage.checkIsDisplayedAnswer(mainPage.getAnswerOnQuest3(), mainPage.getQuest3());
        Assert.assertTrue("Answer on quest 3 is not displayed", isDisplayed);
    }

    @Test
    public void checkQuest4OnMainPage() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.scrollPage(mainPage.getQuest4());
        mainPage.clickQuest(mainPage.getQuest4());
        boolean isDisplayed = mainPage.checkIsDisplayedAnswer(mainPage.getAnswerOnQuest4(), mainPage.getQuest4());
        Assert.assertTrue("Answer on quest 4 is not displayed", isDisplayed);
    }

    @Test
    public void checkQuest5OnMainPage() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.scrollPage(mainPage.getQuest5());
        mainPage.clickQuest(mainPage.getQuest5());
        boolean isDisplayed = mainPage.checkIsDisplayedAnswer(mainPage.getAnswerOnQuest5(), mainPage.getQuest5());
        Assert.assertTrue("Answer on quest 5 is not displayed", isDisplayed);
    }

    @Test
    public void checkQuest6OnMainPage() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.scrollPage(mainPage.getQuest6());
        mainPage.clickQuest(mainPage.getQuest6());
        boolean isDisplayed = mainPage.checkIsDisplayedAnswer(mainPage.getAnswerOnQuest6(), mainPage.getQuest6());
        Assert.assertTrue("Answer on quest 6 is not displayed", isDisplayed);
    }

    @Test
    public void checkQuest7OnMainPage() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.scrollPage(mainPage.getQuest7());
        mainPage.clickQuest(mainPage.getQuest7());
        boolean isDisplayed = mainPage.checkIsDisplayedAnswer(mainPage.getAnswerOnQuest7(), mainPage.getQuest7());
        Assert.assertTrue("Answer on quest 7 is not displayed", isDisplayed);
    }

    @Test
    public void checkQuest8OnMainPage() {
        MainPage mainPage = new MainPage(webDriver);
        mainPage.open();
        mainPage.scrollPage(mainPage.getQuest8());
        mainPage.clickQuest(mainPage.getQuest8());
        boolean isDisplayed = mainPage.checkIsDisplayedAnswer(mainPage.getAnswerOnQuest8(), mainPage.getQuest8());
        Assert.assertTrue("Answer on quest 8 is not displayed", isDisplayed);
    }

}
