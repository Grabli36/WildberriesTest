package info.esoft.qa.wildberies.main;



import info.esoft.qa.wildberies.helpers.MainPageObject;
import info.esoft.qa.wildberies.helpers.Settings;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static info.esoft.qa.wildberies.constants.MainConstants.*;
import static info.esoft.qa.wildberies.constants.PromotionsNewYearConstants.promoTitle;
import static org.junit.Assert.assertTrue;


public class PositiveMainTest extends Settings {


    @Test
    public void bannerPictureTest() throws InterruptedException {
        MainPageObject mainPageObject = new MainPageObject();
        Thread.sleep(15000);
        assertTrue(mainPageObject.checkElementVisibility(nextBannerImage));

    }

    @Test
    public void scrollBannerRightTest() {
        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.scrollBannerRight();
        assertTrue(mainPageObject.checkElementVisibility(nextBannerImage));
    }

    @Test
    public void scrollBannerLeftTest() {
        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.scrollBannerLeft();
        assertTrue(mainPageObject.checkElementVisibility(previousBannerImage));
    }

    @Test
    public void goodsListTest() throws InterruptedException {
        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.showMore();
        assertTrue(mainPageObject.checkElementVisibility(newGoods));
    }

    @Test
    public void navbarTest() throws InterruptedException {
        MainPageObject mainPageObject = new MainPageObject();
        Thread.sleep(3000);
        mainPageObject.clickNavbar();
        assertTrue(mainPageObject.checkElementVisibility(menuBurger));
    }

    @Test
    public void checkingBannerLinkTest() {
        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.clickBanner();
        $(promoTitle).shouldHave(text("Отмороженные скидки"));
    }

    @Test
    public void checkingAnchorTest() throws InterruptedException {
        MainPageObject mainPageObject = new MainPageObject();
        mainPageObject.pressUpButton();
        assertTrue(mainPageObject.checkElementVisibility(header));

    }


}
