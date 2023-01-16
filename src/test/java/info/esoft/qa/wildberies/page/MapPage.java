package info.esoft.qa.wildberies.page;

import static com.codeborne.selenide.Condition.visible;
import static info.esoft.qa.wildberies.constants.MapConstants.buttonCiteGeolocation;
import static info.esoft.qa.wildberies.constants.MapConstants.locationSelectionButton;

public class MapPage {
    public void selectShippingAddressFromPickupPoint() {
        buttonCiteGeolocation.shouldBe(visible).click();
        locationSelectionButton.shouldBe(visible).click();

    }
}
