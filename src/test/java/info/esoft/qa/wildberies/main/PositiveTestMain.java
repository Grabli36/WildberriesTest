package info.esoft.qa.wildberies.main;


import info.esoft.qa.wildberies.helpers.MainPageObject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static info.esoft.qa.wildberies.constants.MainConstants.*;
import static info.esoft.qa.wildberies.constants.PromotionsNewYearConstants.PromoTitle;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


public class PositiveTestMain {


    @Before
    public void SetUp() {
        open("https://www.wildberries.ru");
    }

    @Test
    public void BannerPictureTest() throws InterruptedException {
        MainPageObject mainPageObject = new MainPageObject();
        Thread.sleep(15000);
        assertTrue(mainPageObject.ElementVisibility(NextBannerImage));

    }

    @Test
    public void ScrollBannerRightTest() {
        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.ScrollBannerRight();
        assertTrue(mainPageObject.ElementVisibility(NextBannerImage));
    }


    @Test
    public void ScrollBannerLeftTest() {
        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.ScrollBannerLeft();
        assertTrue(mainPageObject.ElementVisibility(PreviousBannerImage));
    }

    @Test
    public void GoodsListTest() throws InterruptedException {
        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.ShowMore();
        assertTrue(mainPageObject.ElementVisibility(NewGoods));
    }

    @Test
    public void NavbarTest() throws InterruptedException {
        MainPageObject mainPageObject = new MainPageObject();
        Thread.sleep(3000);
        mainPageObject.ClickNavbar();
        assertTrue(mainPageObject.ElementVisibility(MenuBurger));
    }

    @Test
    public void CheckingBannerLink() {
        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.ClickBanner();
        $(PromoTitle).shouldHave(text("Отмороженные скидки"));
    }

    @Test
    public void CheckingAnchor() throws InterruptedException{
        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.PressUpButton();
        assertTrue(mainPageObject.ElementVisibility(Header));

    }

    @After
    public void Close() {
        closeWebDriver();
    }
}
