package page._4mortgage;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class MortgagePage {

    private final SelenideElement getTitle = $x("//h1");

    private final ElementsCollection allListMortgage = $$("[data-widget-name='CatalogCard']");

    private final SelenideElement newBuildings =
            $x("//h2//a[@href='/get-money/mortgage/novostrojki/?platformId=alfasite']");

    public MortgagePage getTitleText() {
        getTitle.shouldHave(text("Ипотека онлайн"), visible);
        return this;
    }

    public MortgagePage infoTheAllTab_newBuildings() {
        //0 - блок 'Новостройки'
        allListMortgage.get(0).scrollTo()
                .shouldHave(
                        text("Новостройки"),
                        text("Одобряем больше"), text("чем в других банках"),
                        text("от 20,1%"), text("Первоначальный взнос")).shouldBe(visible, Duration.ofSeconds(4))
                .$(linkText("Подробные условия")).shouldBe(visible);
        allListMortgage.get(0).$(linkText("Заполнить заявку")).shouldBe(visible);
        return this;
    }

    public MortgagePage infoTheAllTab_MortgageOnAHouse() {
        clickDropDown();
        //1 - блок 'Ипотека на дом'
        allListMortgage.get(1).scrollTo()
                .shouldHave(
                        text("Ипотека на дом"),
                        text("Одобряем больше"), text("чем в других банках"),
                        text("до 30 лет"), text("срок кредита"),
                        text("от 30%"), text("первоначальный взнос")).shouldBe(visible, Duration.ofSeconds(4))
                .$(linkText("Подробные условия")).shouldBe(visible);
        allListMortgage.get(1).$(linkText("Заполнить заявку")).shouldBe(visible);
        return this;
    }

    public MortgagePage infoTheAllTab_MortgageRefinancing() {
        clickDropDown();
        //2 - блок 'Рефинансирование ипотеки'
        allListMortgage.get(2).scrollTo()
                .shouldHave(
                        text("Рефинансирование ипотеки"),
                        text("до 70 млн ₽"), text("сумма кредита"),
                        text("до 30 лет"), text("срок кредита"),
                        text("до 80%"), text("максимальный размер кредита")).shouldBe(visible, Duration.ofSeconds(4))
                .$(linkText("Подробные условия")).shouldBe(visible);
        allListMortgage.get(2).$(linkText("Заполнить заявку")).shouldBe(visible);
        return this;
    }

    public MortgagePage infoTheAllTab_forTheConstructionOfAHouse() {
        clickDropDown();
        //3 - блок 'На строительство дома'
        allListMortgage.get(3).scrollTo()
                .shouldHave(
                        text("На строительство дома"),
                        text("до 30 млн ₽"), text("сумма кредита"),
                        text("до 30 лет"), text("срок кредита"),
                        text("от 20,1%"), text("первоначальный взнос")).shouldBe(visible, Duration.ofSeconds(4))
                .$(linkText("Подробные условия")).shouldBe(visible);
        allListMortgage.get(3).$(linkText("Заполнить заявку")).shouldBe(visible);
        return this;
    }

    public MortgagePage infoTheAllTab_farEasternMortgage() {
        clickDropDown();
        //4 - блок 'Дальневосточная ипотека'
        allListMortgage.get(4).scrollTo()
                .shouldHave(
                        text("Дальневосточная ипотека"),
                        text("до 6 млн ₽"), text("сумма кредита"),
                        text("до 20 лет"), text("срок кредита"),
                        text("от 20,1%"), text("первоначальный взнос")).shouldBe(visible, Duration.ofSeconds(4))
                .$(linkText("Подробные условия")).shouldBe(visible);
        allListMortgage.get(4).$(linkText("Заполнить заявку")).shouldBe(visible);
        return this;
    }

    public MortgagePage infoTheAllTab_secondaryHousing() {
        clickDropDown();
        //0 - блок 'Вторичное жильё'
        allListMortgage.get(0).scrollTo()
                .shouldHave(
                        text("Вторичное жильё"),
                        text("От 20,1% стоимости"), text("Первоначальный взнос"),
                        text("Одобряем больше"), text("чем в других банках")).shouldBe(visible, Duration.ofSeconds(4))
                .$(linkText("Подробные условия")).shouldBe(visible);
        allListMortgage.get(0).$(linkText("Заполнить заявку")).shouldBe(visible);
        return this;
    }

    public MortgagePage infoTheAllTab_familyMortgage() {
        clickDropDown();
        //0 - блок 'Семейная ипотека'
        allListMortgage.get(0).scrollTo()
                .shouldHave(
                        text("Семейная ипотека"),
                        text("Одобряем больше"), text("чем в других банках"),
                        text("до 30 млн ₽"), text("сумма кредита"),
                        text("от 20,1%"), text("первоначальный взнос")).shouldBe(visible, Duration.ofSeconds(4))
                .$(linkText("Подробные условия")).shouldBe(visible);
        allListMortgage.get(0).$(linkText("Заполнить заявку")).shouldBe(visible);
        return this;
    }

    public MortgagePage infoTheAllTab_refinancing() {
        clickDropDown();
        //0 - блок 'Рефинансирование ипотеки'
        allListMortgage.get(0).scrollTo()
                .shouldHave(
                        text("Рефинансирование ипотеки"),
                        text("до 70 млн ₽"), text("сумма кредита"),
                        text("до 30 лет"), text("срок кредита"),
                        text("до 80%"), text("максимальный размер кредита")).shouldBe(visible, Duration.ofSeconds(4))
                .$(linkText("Подробные условия")).shouldBe(visible);
        allListMortgage.get(0).$(linkText("Заполнить заявку")).shouldBe(visible);
        return this;
    }

    public MortgagePage infoTheAllTab_privateHome() {
        clickDropDown();
        //0 - блок 'На строительство дома'
        allListMortgage.get(0).scrollTo()
                .shouldHave(
                        text("На строительство дома"),
                        text("до 30 млн ₽"), text("сумма кредита"),
                        text("до 30 лет"), text("срок кредита"),
                        text("от 20,1%"), text("первоначальный взнос")).shouldBe(visible, Duration.ofSeconds(4))
                .$(linkText("Подробные условия")).shouldBe(visible);
        allListMortgage.get(0).$(linkText("Заполнить заявку")).shouldBe(visible);
        return this;
    }

    public void clickDropDown() {
        $("[data-test-id='drop-down-title-link']").click();
    }

    public MortgagePage clickButtonNewBuilding() {
        $("[data-test-id='tabs-list-tabTitle-1']").should(visible, Duration.ofSeconds(3)).click();
        return this;
    }

    public MortgagePage clickButtonSecondary() {
        $("[data-test-id='tabs-list-tabTitle-2']").should(visible, Duration.ofSeconds(3)).click();
        return this;
    }

    public MortgagePage clickButtonFamilyMortgage() {
        $("[data-test-id='tabs-list-tabTitle-3']").should(visible, Duration.ofSeconds(3)).click();
        return this;
    }

    public MortgagePage clickButtonRefinancing() {
        $("[data-test-id='tabs-list-tabTitle-4']").should(visible, Duration.ofSeconds(3)).click();
        return this;
    }

    public MortgagePage clickButtonPrivateHome() {
        $("[data-test-id='tabs-list-tabTitle-5']").should(visible, Duration.ofSeconds(3)).click();
        return this;
    }


    public MortgagePage getCheckedButton(int tabIndex) {
        $x("//div[@data-test-id='tabs-list']//button[@data-test-id='tabs-list-tabTitle-" + tabIndex + "']")
                .shouldHave(cssValue("background"
                        , "rgb(18, 18, 18) none repeat scroll 0% 0% / auto padding-box border-box"))
                .should(visible, Duration.ofSeconds(3));
        return this;
    }

}
