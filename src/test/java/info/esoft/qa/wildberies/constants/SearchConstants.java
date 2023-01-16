package info.esoft.qa.wildberies.constants;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public interface SearchConstants {
    SelenideElement search = $x("//input[@id='searchInput']");
    SelenideElement searchResult = $x("//div[@class='searching-results__inner']");
    SelenideElement searchLogo = $x("//button[@id='applySearchBtn']");
    SelenideElement noFoundSearchResult = $x("//h1[@class='not-found-search__title']");
    SelenideElement productCardList = $x("//div[@class='product-card-list']");

}
