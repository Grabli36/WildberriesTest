package info.esoft.qa.wildberies.helpers;

import static info.esoft.qa.wildberies.constants.IssuingAddressConstants.ButtonCiteGeolocation;
import static info.esoft.qa.wildberies.constants.IssuingAddressConstants.LocationSelectionButton;

public class IssuingAddressPageObject {
    public void CheckShippingAddressFromPickupPoint() {
        ButtonCiteGeolocation.click();
        LocationSelectionButton.click();
    }
}
