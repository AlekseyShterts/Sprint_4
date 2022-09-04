package ru.yandex.sprint4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AboutRentPage extends BasePage {
    //локатор поля Дата доставки
    private final By dateDeliveryField = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    //локатор поля Период оренды
    private final By periodRentField = By.xpath(".//div[@class='Dropdown-placeholder']");
    //локатор чек-бокса выбора черного цвета для самоката
    private final By blackColorCheckBox = By.id("black");
    //локатор чек-бокса выбора серого цвета для самоката
    private final By greyColorCheckBox = By.id("grey");
    //локатор поля Комментарий
    private final By commentField = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    //локатор кнопки Заказать
    private final By OrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    //локатор кнопки подтверждения заказа "Да"
    private final By approveOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    //локатор окна подтверждения заказа
    private final By approvedOrderWindow = By.cssSelector(".Order_ModalHeader__3FDaJ");

    public AboutRentPage(WebDriver webDriver) {
        super(webDriver);
    }
    public boolean checkIsDisplayedApprovedOrderWindow () {
        new WebDriverWait(webDriver,2).until(ExpectedConditions.visibilityOfElementLocated(approvedOrderWindow));
        return webDriver.findElement(approvedOrderWindow).isDisplayed();
    }
    public void setDateDeliveryField(String date) {
        webDriver.findElement(dateDeliveryField).click();
        webDriver.findElement(By.xpath(".//div[text()='"+date+"']")).click();
    }
    public void setPeriodRentField(String period) {
        webDriver.findElement(periodRentField).click();
        //локатор нужного срока аренды
        webDriver.findElement(By.xpath(".//div[text()='"+period+"']")).click();
    }
    public void setBColorCheckBox(String color) {
        if (color.equals("black"))
            {webDriver.findElement(blackColorCheckBox).click();}
        else
            {webDriver.findElement(greyColorCheckBox).click();}
    }
    public void setCommentField(String comment) {
        webDriver.findElement(commentField).click();
        webDriver.findElement(commentField).sendKeys(comment);
    }
    public void clickOrderButton() {
        webDriver.findElement(OrderButton).click();
    }
    public void clickApproveOrderButton() {
        webDriver.findElement(approveOrderButton).click();
    }
    public void inputAboutRentDataForm(String date, String period, String color, String comment){
        setDateDeliveryField(date);
        setPeriodRentField(period);
        setBColorCheckBox(color);
        setCommentField(comment);
    }

    public abstract static class BasePage {
        protected WebDriver webDriver;
        protected BasePage (WebDriver webDriver) {
            this.webDriver = webDriver;
        }
    }
}
