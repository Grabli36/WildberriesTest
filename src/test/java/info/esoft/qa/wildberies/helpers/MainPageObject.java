package info.esoft.qa.wildberies.helpers;


import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static info.esoft.qa.wildberies.constants.MainConstants.*;

public class MainPageObject {


    public  void ScrollBannerRight() {
        RightBannerButton.click();
    }

    public  void ScrollBannerLeft() {
        LeftBannerButton.click();
    }

    public  void ShowMore() throws InterruptedException {

        //вариант 1
        for (int i = 0; i < 2; i++) {
            doScroll(1500);
            Thread.sleep(1500);
        }
        ShowMoreButton.click();

        //Хотел попробовать без цикла сделать
        /*actions().moveByOffset( 0, 500);*/
    }

    public  void doScroll(int pix) {
        Selenide.executeJavaScript("window.scrollBy(0," + pix + ")", "");
    }

    public  void ClickNavbar()  {
        Navbar.shouldBe(visible).click();
    }

    public void  ClickBanner(){
        ButtonBanner.click();
    }

    public void PressUpButton() throws InterruptedException {
        for (int i = 0; i < 2; i++) {
            doScroll(2500);
            Thread.sleep(1500);
        }
        Anchor.click();
    }

    public boolean ElementVisibility(SelenideElement element){
        return element.shouldBe(visible).isDisplayed();
    }




}
