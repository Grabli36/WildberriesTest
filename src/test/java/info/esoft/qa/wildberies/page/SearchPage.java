package info.esoft.qa.wildberies.page;

import static com.codeborne.selenide.Condition.visible;
import static info.esoft.qa.wildberies.constants.SearchConstants.search;
import static info.esoft.qa.wildberies.constants.SearchConstants.searchLogo;

public class SearchPage {
    public void clickEnterSearch(String product){
        search.shouldBe(visible).setValue(product).pressEnter();
    }

    public void clickLogoSearch(String product){
        search.shouldBe(visible).setValue(product);
        searchLogo.shouldBe(visible).click();
    }
}
