package page._5investment;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;

public class InvestmentPage {

    private final SelenideElement getTitle = $("[data-test-id='mainBanner']");

    private final SelenideElement buttonMoreDetailedInTheBanner =
            $("[data-test-id='mainBanner'] [data-widget-name='PublisherV2']");
    private final SelenideElement modalWindow = $("[data-test-id='modalWrapper']");
    private final SelenideElement downloadThePromotionRules =
            $("[href='https://alfabank.servicecdn.ru/site-upload/64/e8/6690/10_akcii_nachinayushchim_investoram.pdf']");

    private final SelenideElement buttonOpenAnAccountInTheBanner =
            $("[data-test-id='mainBanner'] [data-widget-name='ButtonV2']");
    private final SelenideElement formOpenAccount =
            $("[action='https://anketa.alfabank.ru/alfaform-common-land/?platformId=alfasite']");


    public InvestmentPage getTitleText() {
        getTitle.shouldHave(text("Дарим 10 акций"),
                text("Станьте инвестором топовых компаний")).shouldBe(visible);
        return this;
    }

    public InvestmentPage clickButtonMoreDetails() {
        buttonMoreDetailedInTheBanner.click();
        Selenide.sleep(4000);
        return this;
    }

    public InvestmentPage infoModalWindow() {
        modalWindow.should(appear, Duration.ofSeconds(3));

        //Проверка информации в блоке 'Как получить 10 акций в подарок?'
        modalWindow.$(" [data-test-id='accordion-header-0']").click();
        modalWindow.shouldHave(text("С 1 ноября по 29 декабря включительно откройте брокерский счёт в Альфа-Банке" +
                " и купите любые ценные бумаги на сумму от 1000 ₽."), visible);
        modalWindow.$(" [data-test-id='accordion-header-0']").click();

        //Проверка информации в блоке 'Когда мне придут акции?'
        modalWindow.$(" [data-test-id='accordion-header-1']").click();
        modalWindow.shouldHave(text("Мы начислим акции в период с 10 по 15 декабря, если вы откроете счёт и купите ценные бумаги в ноябре. " +
                "Если вы откроете брокерский счёт в декабре, мы начислим акции в период с 10 по 15 января."), visible);
        modalWindow.$(" [data-test-id='accordion-header-1']").click();

        //Проверка информации в блоке 'Мне подарят 10 акций, если у меня уже есть брокерский счёт в Альфа-Банке?'
        modalWindow.$(" [data-test-id='accordion-header-2']").click();
        modalWindow.shouldHave(text("Да, если по брокерскому счёту не было операций с 1 января по 30 октября 2023 года. " +
                "Если вы пользовались брокерским счётом в этот период, акции в подарок не начислят."), visible);
        modalWindow.$(" [data-test-id='accordion-header-2']").click();

        //Проверка информации в блоке 'На какую сумму нужно купить ценные бумаги, чтобы получить ещё 10 в подарок?
        //                             Сколько их должно быть?'
        modalWindow.$(" [data-test-id='accordion-header-3']").click();
        modalWindow.shouldHave(text("Минимальная сумма — 1000 ₽ без учёта комиссий."), visible);
        modalWindow.$(" [data-test-id='accordion-header-3']").click();

        //Проверка информации в блоке 'Если я открою два брокерских счёта, то получу 20 акций в подарок?'
        modalWindow.$(" [data-test-id='accordion-header-4']").click();
        modalWindow.shouldHave(text("Нет, один брокерский счёт — один подарок. "), visible);
        modalWindow.$(" [data-test-id='accordion-header-4']").click();

        //Проверка информации в блоке 'Если я открою счёт ИИС, то получу 10 акций в подарок?'
        modalWindow.$(" [data-test-id='accordion-header-5']").click();
        modalWindow.shouldHave(text("Нет, 10 акций дарим тем, кто откроет брокерский счёт в Альфа-Банке."), visible);
        modalWindow.$(" [data-test-id='accordion-header-5']").click();

        //Проверка информации в блоке 'Акции каких компаний я получу в подарок?'
        modalWindow.$(" [data-test-id='accordion-header-6']").click();
        modalWindow.shouldHave(text("Мы начислим 10 акций пяти крупных компаний. " +
                "Среди них АЛРОСА, Московская биржа, Роснефть, АФК Система, Газпром."), visible);
        modalWindow.$(" [data-test-id='accordion-header-6']").click();

        //Проверка информации в блоке 'Если акции компании, которые я получу, торгуются лотами, я получу 10 лотов или 10 акций?'
        modalWindow.$(" [data-test-id='accordion-header-7']").click();
        modalWindow.shouldHave(text("Вы получите 10 акций."), visible);
        modalWindow.$(" [data-test-id='accordion-header-7']").click();

        //Проверка информации в блоке 'Как продать акции, которые получил в подарок?'
        modalWindow.$(" [data-test-id='accordion-header-8']").click();
        modalWindow.shouldHave(text("Зайдите в приложение Альфа-Инвестиций или Альфа-Инвестиции Онлайн, " +
                "выберите подарочные акции каждого эмитента и нажмите на кнопку Продать всё."), visible);
        modalWindow.$(" [data-test-id='accordion-header-8']").click();

        //Проверка информации в блоке 'Сколько у меня времени, чтобы продать подаренные акции и получить за них деньги на счёт?'
        modalWindow.$(" [data-test-id='accordion-header-9']").click();
        modalWindow.shouldHave(text("В течение 100 дней с момента получения."), visible);
        modalWindow.$(" [data-test-id='accordion-header-9']").click();

        //проверка наличия информационного файла pdf об условиях акции, в модальном окне
        downloadThePromotionRules.shouldBe(visible);

        return this;
    }

    public InvestmentPage closeModalWindowMoreDetails() {
        modalWindow.$(" [data-widget-name='PublisherV2']").click();
        return this;
    }

    public InvestmentPage clickButtonOpenAccount() {
        buttonOpenAnAccountInTheBanner.click();
        return this;
    }

    public InvestmentPage formOpenAccountOnThePage() {
        formOpenAccount.shouldHave(
                        text("Откройте брокерский счёт"),
                        text("Фамилия Имя Отчество"), text("Укажите точно как в паспорте"),
                        text("Мобильный телефон"),
                        text("Дата рождения"),
                        text("Мы гарантируем безопасность\n" +
                                "и сохранность ваших данных"))
                .$("[data-test-id='button']").shouldBe(visible);
        return this;
    }

}
