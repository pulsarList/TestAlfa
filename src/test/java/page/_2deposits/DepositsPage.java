package page._2deposits;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;
import static org.openqa.selenium.By.linkText;

public class DepositsPage {
    private final SelenideElement getTitle = $("#filter");
    /////////////////////////////

    private final SelenideElement button_popular = $x("//h1/following-sibling::a[@href='/make-money/']");
    private final SelenideElement alphaContributionMaximum =
            $x("//h2//a[@href='/make-money/deposits/alfa-vklad/max/?platformId=alfasite']");
    private final SelenideElement alphaAccount =
            $x("//h2//a[@href='/make-money/savings-account/alfa/?platformId=alfasite']");
    private final SelenideElement alphaContribution =
            $x("//h2//a[@href='/make-money/deposits/alfa/?platformId=alfasite']");
    private final SelenideElement specialAccount =
            $x("//h2//a[@href='/make-money/44-fz/?platformId=alfasite']");
    /////////////////////////////

    private final SelenideElement button_accumulativeAccounts =
            $x("//h1/following-sibling::a[@href='/make-money/savings-account/']");

    private final SelenideElement airPlane =
            $x("//h2//a[@href='/make-money/savings-account/airplane/?platformId=alfasite']");
    /////////////////////////////

    private final SelenideElement button_deposits =
            $x("//h1/following-sibling::a[@href='/make-money/deposits/']");
    /////////////////////////////

    private final SelenideElement buttonServingsServices =
            $x("//h1/following-sibling::a[@href='/make-money/service-for-saving/']");
    private final SelenideElement blockPiggyBankForSalaries = $("[data-test-id='Копилка для зарплаты']");
    private final SelenideElement blockScheduledPayment = $("[data-test-id='Платёж по расписанию']");
    private final SelenideElement blockMyGoals = $("[data-test-id='Мои цели']");
    //////////////////////////////


    public DepositsPage getTitleText() {
        getTitle.shouldHave(text("Накопительные продукты"), visible);
        return this;
    }

    public void checkingTheDisplayOfCumulativeProducts() {
        alphaContributionMaximum.shouldHave(text("Альфа-Вклад Максимальный"), visible);
        alphaAccount.scrollTo().shouldHave(text("Альфа-Счёт"), visible);
        alphaContribution.shouldHave(text("Альфа-Вклад"), visible);
        specialAccount.scrollTo().shouldHave(text("Специальный счёт по 44-ФЗ"), visible);
    }

    public void checkingTheDisplayOfDepositsAccumulativeAccounts() {
        alphaAccount.shouldHave(text("Альфа-Счёт"), visible);
        airPlane.scrollTo().shouldHave(text("АэроПлан"), visible);
    }

    public void checkingTheDisplayOfDeposits() {
        alphaContributionMaximum.shouldHave(text("Альфа-Вклад Максимальный"), visible);
        alphaContribution.shouldHave(text("Альфа-Вклад"), visible);
    }

    public DepositsPage clickButtonAccumulativeAccounts() {
        button_accumulativeAccounts.click();
        return this;
    }

    public DepositsPage clickButtonDeposits() {
        button_deposits.click();
        return this;
    }

    public DepositsPage clickButtonServingsServices() {
        buttonServingsServices.click();
        return this;
    }

    public DepositsPage infoBlockPiggyBankForSalaries() {
        blockPiggyBankForSalaries.shouldHave(
                        text("Дополнительный доход к вашей зарплате:"),
                        text("— автоматические перечисления на накопительный «Альфа-Счет»."),
                        text("— до 100% от зарплаты с каждого поступления."))
                .$(linkText("Узнать больше")).shouldBe(visible);
        return this;
    }

    public DepositsPage infoBlockScheduledPayment() {
        blockScheduledPayment.shouldHave(
                        text("Автопополнение накопительного счета:"),
                        text("— для любых дебетовых счетов."),
                        text("— выбор периода, даты и суммы."))
                .$(linkText("Узнать больше")).shouldBe(visible);
        return this;
    }

    public DepositsPage infoBlockMyGoals() {
        blockMyGoals.shouldHave(
                        text("Открытие счета для достижения цели:"),
                        text("— пополнение и снятие без потери %."),
                        text("— на любой срок."))
                .$(linkText("Узнать больше")).shouldBe(visible);
        return this;
    }

    public DepositsPage getCheckedButton() {
        $x("//div[@data-widget-name='SpacerVertical']/../button").shouldHave(cssValue("background"
                , "rgb(18, 18, 18) none repeat scroll 0% 0% / auto padding-box border-box"));
        return this;
    }

    public DepositsPage getCheckedButton1() {
        $x("//div[@data-widget-name='SpacerVertical']/following-sibling::div[@id='tiles-services']/preceding-sibling::div//h1/../button")
                .shouldHave(cssValue("background", "rgb(18, 18, 18) none repeat scroll 0% 0% / auto padding-box border-box"));
        return this;
    }

}
