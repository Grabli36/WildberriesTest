package info.esoft.qa.wildberies.page;

import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;


public class Settings {

    private static  String URL = "https://www.wildberries.ru";

    @Before
    public void setUp() {
        open(URL);
    }

    @After
    public void close() {
        closeWebDriver();
    }

}
