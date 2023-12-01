package page._3credits;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class CreditsPage {

    private final SelenideElement getTitle = $x("//h1");

    private final ElementsCollection allListCredits = $$("[data-widget-name='CatalogCard']");


    public CreditsPage getTitleText() {
        getTitle.shouldHave(text("Потребительские кредиты"), visible);
        return this;
    }

    public CreditsPage infoTheAllTab_cashLoan() {
        // 0 = блок "Кредит наличными"
        allListCredits.get(0).shouldHave(
                        text("Кредит наличными"),
                        text("За 2 минуты"),
                        text("До 15 млн ₽"),
                        text("От 1 до 10 лет")).shouldBe(visible)
                .$(linkText("Подробнее о кредите")).shouldBe(visible);
        allListCredits.get(0).$(linkText("Оформить заявку")).shouldBe(visible);
        return this;
    }

    public CreditsPage infoTheAllTab_onBailForAnyPurpose() {
        // 1 = блок "Кредит под залог на любые цели"
        allListCredits.get(1).shouldHave(
                        text("Кредит под залог на любые цели"),
                        text("Нужен только паспорт"),
                        text("До 15 млн ₽"),
                        text("От 1 до 10 лет")).shouldBe(visible)
                .$(linkText("Подробнее о кредите")).shouldBe(visible);
        allListCredits.get(1).$(linkText("Оформить заявку")).shouldBe(visible);
        return this;
    }

    public CreditsPage infoTheAllTab_refinancing() {
        // 2 = блок "Рефинансирование"
        allListCredits.get(2).shouldHave(
                        text("Рефинансирование"),
                        text("За 2 минуты"),
                        text("до 7,5 млн ₽"),
                        text("От 2 до 7 лет")).shouldBe(visible)
                .$(linkText("Подробнее о рефинансировании")).shouldBe(visible);
        allListCredits.get(2).$(linkText("Оформить заявку")).shouldBe(visible);
        return this;
    }

    public CreditsPage infoTheAllTab_carLoan() {
        // 3 = блок "Кредит на автомобиль"
        allListCredits.get(3).shouldHave(
                        text("Кредит на автомобиль"),
                        text("За 2 минуты"),
                        text("до 7,5 млн ₽"),
                        text("От 1 до 5 лет")).shouldBe(visible)
                .$(linkText("Подробнее о кредите")).shouldBe(visible);
        allListCredits.get(3).$(linkText("Оформить заявку")).shouldBe(visible);
        return this;
    }

    public CreditsPage infoTheAllTab_educationalLoan() {
        // 4 = блок "Образовательный кредит"
        allListCredits.get(4).shouldHave(
                        text("Образовательный кредит"),
                        text("За 2 минуты"),
                        text("отсрочка первого платежа"), text("До 45 дней"),
                        text("От 1 до 5 лет")).shouldBe(visible)
                .$(linkText("Подробнее о кредите")).shouldBe(visible);
        allListCredits.get(4).$(linkText("Оформить заявку")).shouldBe(visible);
        return this;
    }

    public CreditsPage infoTheAllTab_loanForTheConstructionOfAHouse() {
        // 5 = блок "Кредит на строительство дома"
        allListCredits.get(5).shouldHave(
                        text("Кредит на строительство дома"),
                        text("За 2 минуты"),
                        text("До 7,5 млн ₽"),
                        text("От 1 до 5 лет")).shouldBe(visible)
                .$(linkText("Подробнее о кредите")).shouldBe(visible);
        allListCredits.get(5).$(linkText("Оформить заявку")).shouldBe(visible);
        return this;
    }

    public CreditsPage infoTheAllTab_loanForRepairs() {
        // 6 = блок "Кредит на ремонт"
        allListCredits.get(6).shouldHave(
                        text("Кредит на ремонт"),
                        text("За 2 минуты"),
                        text("До 7,5 млн ₽"),
                        text("Досрочное погашение")).shouldBe(visible)
                .$(linkText("Подробнее о кредите")).shouldBe(visible);
        allListCredits.get(6).$(linkText("Оформить заявку")).shouldBe(visible);
        return this;
    }

    public CreditsPage infoTheAllTab_carLoanFromACarDealership() {
        // 7 = блок "Кредит на автомобиль из автосалона"
        allListCredits.get(7).shouldHave(
                        text("Кредит на автомобиль из автосалона"),
                        text("Новые и с пробегом"), text("из автосалона"),
                        text("До 10 млн ₽"),
                        text("От 1 до 8 лет")).shouldBe(visible)
                .$(linkText("Описание условий")).shouldBe(visible);
        allListCredits.get(7).$(linkText("Подробнее")).shouldBe(visible);
        return this;
    }

    public CreditsPage infoTheAllTab_refinancingACarLoan() {
        // 8 = блок "Рефинансирование автокредита"
        allListCredits.get(8).shouldHave(
                        text("Рефинансирование автокредита"),
                        text("Дополнительные деньги"), text("на личные нужды"),
                        text("до 7,5 млн ₽"),
                        text("От 2 до 7 лет")).shouldBe(visible)
                .$(linkText("Подробнее о кредите")).shouldBe(visible);
        allListCredits.get(8).$(linkText("Заполнить заявку")).shouldBe(visible);
        return this;
    }


    public CreditsPage getCheckedButton(int tabIndex) {
        $x("//div[@id='filter']//button[@data-test-id='tabs-list-tabTitle-" + tabIndex + "']")
                .shouldHave(cssValue("background"
                        , "rgb(18, 18, 18) none repeat scroll 0% 0% / auto padding-box border-box"));
        return this;
    }

}
