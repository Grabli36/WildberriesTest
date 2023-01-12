package info.esoft.qa.wildberies.IssuingAddress;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class PositiveIssuingAddress {

    @Before
    public void SetUp() {
        open("https://www.wildberries.ru");
    }

    @Test
    public void ChangeShippingAddressFromPickupPoint() {

    }

    @After
    public void Close() {
        closeWebDriver();
    }
}
