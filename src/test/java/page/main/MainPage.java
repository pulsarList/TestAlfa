package page.main;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import page._1card.BankCardPage;
import page._2deposits.DepositsPage;
import page._3credits.CreditsPage;
import page._4mortgage.MortgagePage;
import page._5investment.InvestmentPage;
import page._7buttonMore.ButtonMoreDynamicModalWindow;
import test.section6_PremiumTest.PremiumTest;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private final String mainPageText = "Кредитная карта Год без %";
    private final SelenideElement buttonLogo = $("[data-test-id='Main-Header-Main-DesktopLogo']");
    private final SelenideElement textOfMainPage = $x("//h2[@data-test-id='text']//span[contains(text(), 'Кредитная карта')]");
    private final ElementsCollection sectionHeader = $$x("//section/span");


    private final SelenideElement titleModalInfo1 = $("[title='Информация']");
    private final SelenideElement titleModalInfo2 = $("[title='Сервисы']");
    private final SelenideElement titleModalInfo3 = $("[title='Проекты']");

    public MainPage titleModalInfo() {
        Selenide.sleep(2000);
        titleModalInfo1.shouldHave(text("Информация"), visible);
        titleModalInfo2.shouldHave(text("Сервисы"), visible);
        titleModalInfo3.shouldHave(text("Проекты"), visible);
        return new MainPage();
    }

    public void mainPage() {
        open("https://alfabank.ru");
        buttonLogo.shouldBe(visible);
        textOfMainPage.parent().shouldHave(text(mainPageText), visible);
    }

    public BankCardPage selectTheSectionTitleCard() {
        // 0 - Карты
        sectionHeader.get(0).click();
        return new BankCardPage();
    }

    public DepositsPage selectTheSectionDeposits() {
        // 1 - Вклады
        sectionHeader.get(1).click();
        return new DepositsPage();
    }

    public CreditsPage selectTheSectionCredits() {
        // 2 - Кредиты
        sectionHeader.get(2).click();
        return new CreditsPage();
    }

    public MortgagePage selectTheSectionMortgage() {
        // 3 - Ипотека
        sectionHeader.get(3).click();
        return new MortgagePage();
    }

    public InvestmentPage selectTheSectionInvestment() {
        // 4 - Инвестиции
        sectionHeader.get(4).click();
        return new InvestmentPage();
    }

    public PremiumTest selectTheSectionPremium() {
        // 5 - Премиум
        sectionHeader.get(5).click();
        return new PremiumTest();
    }

    public ButtonMoreDynamicModalWindow selectTheSectionMore() {
        // 6 - Ещё
        sectionHeader.get(6).hover();
        return new ButtonMoreDynamicModalWindow();
    }

}
