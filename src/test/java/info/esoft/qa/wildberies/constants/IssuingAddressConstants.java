package info.esoft.qa.wildberies.constants;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public interface IssuingAddressConstants {

    SelenideElement ButtonCiteGeolocation = $x("//body[1]/div[1]/div[1]/div[2]/div[1]/ymaps[1]/ymaps[1]/ymaps[1]/ymaps[5]/ymaps[3]/ymaps[1]/div[1]/img[1]");
    SelenideElement LocationSelectionButton = $x("//button[contains(text(),'Выбрать')]");

}
