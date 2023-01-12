package info.esoft.qa.wildberies.page;

import static com.codeborne.selenide.Condition.visible;
import static info.esoft.qa.wildberies.constants.IssuingAddressConstants.buttonCiteGeolocation;
import static info.esoft.qa.wildberies.constants.IssuingAddressConstants.locationSelectionButton;

public class IssuingAddressPage {
    public void selectShippingAddressFromPickupPoint() {
        buttonCiteGeolocation.shouldBe(visible).click();
        locationSelectionButton.shouldBe(visible).click();

    }
}
