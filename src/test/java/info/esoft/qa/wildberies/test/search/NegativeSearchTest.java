package info.esoft.qa.wildberies.test.search;

import info.esoft.qa.wildberies.page.SearchPage;
import info.esoft.qa.wildberies.page.Settings;
import io.qameta.allure.Description;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static info.esoft.qa.wildberies.constants.SearchConstants.noFoundSearchResult;
import static info.esoft.qa.wildberies.constants.SearchConstants.searchResult;

public class NegativeSearchTest extends Settings {

    @Test
    @Description("Тест поиск несуществующего товара")
    public void checkNonExistentProductTest() throws InterruptedException {
        SearchPage searchPage = new SearchPage();
        Thread.sleep(1000);
        searchPage.clickEnterSearch("йцу");
        $(noFoundSearchResult).shouldHave(text("Ничего не нашлось по запросу «йцу»"));
    }
}
