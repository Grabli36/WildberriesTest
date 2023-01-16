package info.esoft.qa.wildberies.test.map;

import info.esoft.qa.wildberies.page.MainPage;
import info.esoft.qa.wildberies.page.Settings;
import io.qameta.allure.Description;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static info.esoft.qa.wildberies.constants.MainConstants.address;
import static info.esoft.qa.wildberies.constants.MapConstants.map;
import static org.junit.Assert.assertTrue;

public class PositiveMapTest extends Settings {


    @Test
    @Description("Тест изменить адрес доставки ")
    public void shippingAddressTest() throws InterruptedException {
        MainPage mainPageObject = new MainPage();
        Thread.sleep(3000);
        mainPageObject.clickAddressGeoCite()
                .selectShippingAddressFromPickupPoint();
        $(address).shouldHave(text("Кемеровская область, Кемерово, улица Марковцева, 10"));

    }

    @Test
    @Description("Тест карта отображается")
    public void checkMap() throws InterruptedException {
        MainPage mainPageObject = new MainPage();
        Thread.sleep(3000);
        mainPageObject.clickAddressGeoCite();
        assertTrue(mainPageObject.checkElementVisibility(map));
    }


}
