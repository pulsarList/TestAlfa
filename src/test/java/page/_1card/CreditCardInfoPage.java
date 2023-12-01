package page._1card;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class CreditCardInfoPage {

    private final SelenideElement titleText =
            $x("//div[@data-widget-name='Layout']/div/p[text()='Кредитные карты']");
    private final SelenideElement creditCardAYearWithoutInterest =
            $x("//h2//a[@href='/get-money/credit-cards/100-days/?platformId=alfasite']");
    private final SelenideElement creditCardAlfaTravel =
            $x("//h2//a[@href='/get-money/credit-cards/alfa-travel/?platformId=alfasite']");
    private final SelenideElement creditCardBeeline365DaysWithoutInterest =
            $x("//h2//a[@href='/get-money/credit-cards/beeline/?platformId=alfasite']");
    private final SelenideElement creditCardX5Pyaterochka =
            $x("//h2//a[@href='/get-money/credit-cards/x5-perekrestok-cards/?platformId=alfasite']");
    private final SelenideElement creditCardNoInterestOnEverything =
            $x("//h2//a[@href='/get-money/credit-cards/60-days-grace/?platformId=alfasite']");


    public void checkingTheDisplayOfCreditCards() {
        Selenide.sleep(2000);
        creditCardAYearWithoutInterest.scrollTo().shouldHave(text("Кредитная карта с целым годом без %"), visible);
        creditCardAlfaTravel.scrollTo().shouldHave(text("Кредитная карта Alfa Travel"), visible);
        creditCardBeeline365DaysWithoutInterest.scrollTo().shouldHave(text("Кредитная карта билайн 365 дней без %"), visible);
        creditCardX5Pyaterochka.scrollTo().shouldHave(text("Кредитные Х5 Карты Пятёрочка и Перекрёсток"), visible);
        creditCardNoInterestOnEverything.scrollTo().shouldHave(text("Кредитная карта 60 без % на всё"), visible);
    }

}
