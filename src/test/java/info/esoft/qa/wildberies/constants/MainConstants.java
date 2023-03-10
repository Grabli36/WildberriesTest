package info.esoft.qa.wildberies.constants;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public interface MainConstants {

    SelenideElement rightBannerButton = $x("//button[@aria-label='Next slide']");
    SelenideElement leftBannerButton = $x("//button[@aria-label='Previous slide']");
    SelenideElement buttonBanner = $x("//div[@class='img-plug banners-catalog-custom__container swiper-slide swiper-slide-active']//img[@name='banner_444fd7d8-9cbc-42f3-9638-0f7cbde6ce9c']");
    SelenideElement nextBannerImage = $(By.name("banner_f1e8f2dc-1f21-47ee-b91b-2581c7ca50a5"));
    SelenideElement previousBannerImage = $(By.name("banner_f957ad15-81a0-42b8-8cb7-69bfb87f008c"));
    SelenideElement showMoreButton = $x("//button[contains(text(),'Показать еще')]");
    SelenideElement newGoods = $x("(//li[@class='goods__item goods-card j-product-item'])[119]");
    SelenideElement navbar = $x("//span[contains(@class,'nav-element__burger-line')]");
    SelenideElement menuBurger = $x("//div[@class='menu-burger__main j-menu-burger-main j-menu-active']");
    SelenideElement anchor = $x("//button[contains(text(),'К началу страницы')]");
    SelenideElement buttonGeolocation = $(".simple-menu__link.simple-menu__link--address.j-geocity-link.j-wba-header-item");
    SelenideElement header = $x("//header[@class='header j-header header--custom-bg']");
    SelenideElement address = $x("//span[@class='simple-menu__link simple-menu__link--address j-geocity-link j-wba-header-item']");

}
