package info.esoft.qa.wildberies.page;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static info.esoft.qa.wildberies.constants.MainConstants.*;

public class MainPage {


    public void scrollBannerRight() {
        rightBannerButton.click();
    }

    public void scrollBannerLeft() {
        leftBannerButton.click();
    }

    public void showMore() throws InterruptedException {

        //вариант 1
        for (int i = 0; i < 3; i++) {
            doScroll(1500);
            Thread.sleep(1500);
        }
        showMoreButton.click();

        //Хотел попробовать без цикла сделать
        /*actions().moveByOffset( 0, 500);*/
    }

    public void doScroll(int pix) {
        Selenide.executeJavaScript("window.scrollBy(0," + pix + ")", "");
    }

    public void clickNavbar() {
        navbar.shouldBe(visible).click();
    }

    public void clickBanner() {
        buttonBanner.click();
    }

    public void pressUpButton() throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            doScroll(2500);
            Thread.sleep(1500);
        }
        anchor.click();
    }

    public boolean checkElementVisibility(SelenideElement element) {
        return element.shouldBe(visible).isDisplayed();
    }

    public IssuingAddressPage clickAddressGeoCite() {
        buttonGeolocation.shouldBe(visible).click();
        return new IssuingAddressPage();
    }


}
