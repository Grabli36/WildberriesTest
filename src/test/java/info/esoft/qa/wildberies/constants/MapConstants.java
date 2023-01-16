package info.esoft.qa.wildberies.constants;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public interface MapConstants {

    SelenideElement buttonCiteGeolocation = $x("//*[@id=\"pooList\"]/div[1]/div");
    SelenideElement locationSelectionButton = $x("//button[contains(text(),'Выбрать')]");
    SelenideElement map = $x("//div[@class='popup__content-right popup__content-right--geo-header']");

}
