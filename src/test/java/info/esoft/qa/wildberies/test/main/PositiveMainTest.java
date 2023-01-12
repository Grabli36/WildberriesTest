package info.esoft.qa.wildberies.test.main;



import info.esoft.qa.wildberies.page.MainPage;
import info.esoft.qa.wildberies.page.Settings;
import io.qameta.allure.Description;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static info.esoft.qa.wildberies.constants.MainConstants.*;
import static info.esoft.qa.wildberies.constants.PromotionsNewYearConstants.promoTitle;
import static org.junit.Assert.assertTrue;


public class PositiveMainTest extends Settings {


    @Test
    @Description("Тест автоматического скрола банера")
    public void bannerPictureTest() throws InterruptedException {
        MainPage mainPageObject = new MainPage();
        Thread.sleep(15000);
        assertTrue(mainPageObject.checkElementVisibility(nextBannerImage));

    }

    @Test
    @Description("Тест скрола банера вправо")
    public void scrollBannerRightTest() {
        MainPage mainPageObject = new MainPage();
        mainPageObject.scrollBannerRight();
        assertTrue(mainPageObject.checkElementVisibility(nextBannerImage));
    }

    @Test
    @Description("Тест скрола банера влево")
    public void scrollBannerLeftTest() {
        MainPage mainPageObject = new MainPage();
        mainPageObject.scrollBannerLeft();
        assertTrue(mainPageObject.checkElementVisibility(previousBannerImage));
    }

    @Test
    @Description("Тест кнопки показать ещё")
    public void goodsListTest() throws InterruptedException {
        MainPage mainPageObject = new MainPage();
        mainPageObject.showMore();
        assertTrue(mainPageObject.checkElementVisibility(newGoods));
    }

    @Test
    @Description("Тест бургера")
    public void navbarTest() throws InterruptedException {
        MainPage mainPageObject = new MainPage();
        Thread.sleep(3000);
        mainPageObject.clickNavbar();
        assertTrue(mainPageObject.checkElementVisibility(menuBurger));
    }

    @Test
    @Description("Тест кликабельности банера")
    public void checkingBannerLinkTest() {
        MainPage mainPageObject = new MainPage();
        mainPageObject.clickBanner();
        $(promoTitle).shouldHave(text("Отмороженные скидки"));
    }

    @Test
    @Description("Тест якоря на галвной страницы")
    public void checkingAnchorTest() throws InterruptedException {
        MainPage mainPageObject = new MainPage();
        mainPageObject.pressUpButton();
        assertTrue(mainPageObject.checkElementVisibility(header));

    }


}
