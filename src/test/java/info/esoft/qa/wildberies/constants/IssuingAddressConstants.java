package info.esoft.qa.wildberies.constants;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public interface IssuingAddressConstants {

    SelenideElement buttonCiteGeolocation = $x("//*[@id=\"pooList\"]/div[1]/div");
    SelenideElement locationSelectionButton = $x("//button[contains(text(),'Выбрать')]");

}
