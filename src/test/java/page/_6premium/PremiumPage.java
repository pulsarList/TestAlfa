package page._6premium;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class PremiumPage {

    private final SelenideElement getTitle = $("#banner");

    private final SelenideElement buttonBecomeACustomer =
            getTitle.$(" [href='#choose-premium-card']");
    private final SelenideElement blockInfoCard = $("[data-widget-name='BlockEmptyCard']");
    private final SelenideElement formOrderACard = $("[data-test-id='form']#form");

    public PremiumPage getTitleText() {
        getTitle.shouldHave(text("Альфа-Премиум"),
                text("Лучший премиальный банк России 6 лет подряд")).shouldBe(visible);
        return this;
    }

    public PremiumPage clickButtonBecomeACustomer() {
        buttonBecomeACustomer.click();
        return this;
    }

    public PremiumPage infoBlockCardPremium() {
        blockInfoCard.shouldHave(
                        text("Альфа-Карта Premium"), text("Особые привилегии премиального обслуживания"),
                        text("Кэшбэк до 100%"), text("на категорию, 7% в четырёх и 1% на всё"),
                        text("Переводы без комиссии"), text("по номеру телефона и с карты на карту")).shouldBe(visible)
                .$("[data-widget-name='BlockEmptyCard'] [data-widget-name='ButtonV2']").shouldBe(visible);
        return this;
    }

    public PremiumPage infoFormOrderACard() {
        formOrderACard.shouldHave(
                        text("У вас гражданство РФ?"),
                        text("Фамилия Имя Отчество"), text("Укажите точно как в паспорте"),
                        text("Дата рождения"), text("Заказать карту можно только с 21 года"),
                        text("Мобильный телефон"),
                        text("Электронная почта"),
                        text("Мы гарантируем безопасность\n" +
                                "и сохранность ваших данных"))
                .$("[data-test-id='button']").shouldBe(visible);
        return this;
    }
}
