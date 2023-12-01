package page._1card;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public class BankCardPage {

    private final SelenideElement textPageBankCard = $("[data-widget-name='Heading']");

    private final SelenideElement debitCardInformationButton =
            $x("//h2[@data-test-id='text']//a[@href='/everyday/debit-cards/?platformId=alfasite']");

    private final SelenideElement orderDebitCardButton =
            $("[href='/everyday/debit-cards/alfacard-short2/?platformId=alfasite']");

    private final SelenideElement creditCardInformationButton =
            $x("//h2[@data-test-id='text']//a[@href='/get-money/credit-cards/?platformId=alfasite']");

    private final SelenideElement orderCreditCardButton =
            $("[href='/get-money/credit-cards/zayavka/?platformId=alfasite']");


    public BankCardPage bankCardPage() {
        textPageBankCard.shouldHave(text("Банковские карты"), visible);
        return this;
    }

    public void selectInfoDebitCard() {
        debitCardInformationButton.shouldHave(text("Дебетовые карты")).shouldBe(visible).click();
    }

    public void selectInfoCreditCard() {
        creditCardInformationButton.scrollTo().shouldHave(text("Кредитные карты")).shouldBe(visible).click();
    }

    public DebitCardPage orderADebitCard() {
        orderDebitCardButton.shouldHave(text("Заказать карту"), visible).click();
        return new DebitCardPage();
    }

    public void orderACreditCard() {
        orderCreditCardButton.shouldHave(text("Заказать карту"), visible).click();
    }

}
