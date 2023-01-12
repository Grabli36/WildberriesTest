package info.esoft.qa.wildberies.IssuingAddress;

import info.esoft.qa.wildberies.helpers.MainPageObject;
import info.esoft.qa.wildberies.helpers.Settings;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static info.esoft.qa.wildberies.constants.MainConstants.address;

public class PositiveIssuingAddressTest extends Settings {


    @Test
    public void shippingAddressFromPickupPointTest() throws InterruptedException {
        MainPageObject mainPageObject = new MainPageObject();
        Thread.sleep(3000);
        mainPageObject.clickAddressGeoCite()
                .selectShippingAddressFromPickupPoint();
        $(address).shouldHave(text("Кемеровская область, Кемерово, улица Марковцева, 10"));

    }


}
