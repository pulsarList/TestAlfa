package page._1card;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class DebitCardInfoPage {

    private final SelenideElement titleText = $x("//h1");
    private final SelenideElement debitAlphaCard =
            $x("//h2//a[@href='/everyday/debit-cards/alfacard/?platformId=alfasite']");
    private final SelenideElement alphaSticker =
            $x("//h2//a[@href='/lp/retail/dc/nfc/?platformId=alfasite']");
    private final SelenideElement debitAlphaCardPremium =
            $x("//h2//a[@href='/everyday/debit-cards/alfacard-premium/?platformId=alfasite']");
    private final SelenideElement debitCardAlphaTravel =
            $x("//h2//a[@href='/everyday/debit-cards/travel/?platformId=alfasite']");
    private final SelenideElement debitCardAlphaTravelPremium =
            $x("//h2//a[@href='/everyday/debit-cards/travel-premium/?platformId=alfasite']");
    private final SelenideElement stickerAlphaTravel =
            $x("//h2//a[@href='/lp/retail/dc/nfc-travel/?platformId=alfasite']");
    private final SelenideElement debitCardAeroflot =
            $x("//h2//a[@href='/everyday/debit-cards/aeroflot/?platformId=alfasite']");
    private final SelenideElement debitCardAeroflotWorldSupreme =
            $x("//h2//a[@href='/everyday/debit-cards/aeroflot-premium/?platformId=alfasite']");
    private final SelenideElement childrenCard =
            $x("//h2//a[@href='/everyday/debit-cards/childcard/?platformId=alfasite']");
    private final SelenideElement cardForFamilyAndFriends =
            $x("//h2//a[@href='/everyday/family/family-card/?platformId=alfasite']");
    private final SelenideElement stickerForChildren =
            $x("//h2//a[@href='/lp/retail/dc/nfc-kids/?platformId=alfasite']");


    public DebitCardInfoPage getTitle() {
        titleText.shouldHave(text("Дебетовые карты"), visible);
        return this;
    }

    public void checkingTheDisplayOfDebitCards() {
        debitAlphaCard.shouldHave(text("Дебетовая Альфа-Карта"), visible);
        alphaSticker.scrollTo().shouldHave(text("Альфа-Стикер"), visible);
        debitAlphaCardPremium.shouldHave(text("Дебетовая Альфа-Карта Premium"), visible);
        debitCardAlphaTravel.scrollTo().shouldHave(text("Дебетовая карта Alfa Travel"), visible);
        debitCardAlphaTravelPremium.shouldHave(text("Дебетовая карта Alfa Travel Premium"), visible);
        stickerAlphaTravel.scrollTo().shouldHave(text("Стикер Alfa Travel"), visible);
        debitCardAeroflot.shouldHave(text("Дебетовая карта Аэрофлот"), visible);
        debitCardAeroflotWorldSupreme.scrollTo().shouldHave(text("Дебетовая карта Аэрофлот Мир Supreme"), visible);
        childrenCard.shouldHave(text("Детская карта"), visible);
        cardForFamilyAndFriends.scrollTo().shouldHave(text("Карта для родных и близких"), visible);
        stickerForChildren.shouldHave(text("Стикер для детей"), visible);
    }

}
