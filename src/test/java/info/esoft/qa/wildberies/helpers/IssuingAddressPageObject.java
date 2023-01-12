package info.esoft.qa.wildberies.helpers;

import static com.codeborne.selenide.Condition.visible;
import static info.esoft.qa.wildberies.constants.IssuingAddressConstants.buttonCiteGeolocation;
import static info.esoft.qa.wildberies.constants.IssuingAddressConstants.locationSelectionButton;

public class IssuingAddressPageObject {
    public void selectShippingAddressFromPickupPoint() {
        buttonCiteGeolocation.shouldBe(visible).click();
        locationSelectionButton.shouldBe(visible).click();

    }
}
