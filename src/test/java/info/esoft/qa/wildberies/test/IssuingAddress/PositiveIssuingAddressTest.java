package info.esoft.qa.wildberies.test.IssuingAddress;

import info.esoft.qa.wildberies.page.MainPage;
import info.esoft.qa.wildberies.page.Settings;
import io.qameta.allure.Description;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static info.esoft.qa.wildberies.constants.MainConstants.address;

public class PositiveIssuingAddressTest extends Settings {


    @Test
    @Description("Тест адреса доставки")
    public void shippingAddressFromPickupPointTest() throws InterruptedException {
        MainPage mainPageObject = new MainPage();
        Thread.sleep(3000);
        mainPageObject.clickAddressGeoCite()
                .selectShippingAddressFromPickupPoint();
        $(address).shouldHave(text("Кемеровская область, Кемерово, улица Марковцева, 10"));

    }


}
