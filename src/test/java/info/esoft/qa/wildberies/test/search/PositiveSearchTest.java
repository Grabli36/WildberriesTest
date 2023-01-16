package info.esoft.qa.wildberies.test.search;

import info.esoft.qa.wildberies.page.SearchPage;
import info.esoft.qa.wildberies.page.Settings;
import io.qameta.allure.Description;
import org.junit.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static info.esoft.qa.wildberies.constants.SearchConstants.productCardList;
import static info.esoft.qa.wildberies.constants.SearchConstants.searchResult;

public class PositiveSearchTest extends Settings {

    @Test
    @Description("Тест поиск в верхнем регистром")
    public void checkSearchUpperCaseTest() throws InterruptedException {
        SearchPage searchPage = new SearchPage();
        Thread.sleep(1000);
        searchPage.clickEnterSearch("ТеЛефон");
        $(searchResult).shouldHave(text("По запросу «телефон» найдено"));
    }

    @Test
    @Description("Тест поиск при нажатие на лого")
    public void checkSearchClickLogoTest() throws InterruptedException {
        SearchPage searchPage = new SearchPage();
        Thread.sleep(1000);
        searchPage.clickLogoSearch("Телефон");
        $(searchResult).shouldHave(text("По запросу «телефон» найдено"));
    }

    @Test
    @Description("Тест с не полным вводом слова")
    public void checkSearchWithIncompleteWordTest() throws InterruptedException {
        SearchPage searchPage = new SearchPage();
        Thread.sleep(1000);
        searchPage.clickLogoSearch("Тел");
        $(productCardList).shouldHave(text("Тел"));

    }

    @Test
    @Description("Тест корректность работы поисковых подсказок")
    public void checkCorrectnessOfSearchSuggestionsTest(){

    }


}
