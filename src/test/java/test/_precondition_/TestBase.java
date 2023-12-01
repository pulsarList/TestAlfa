package test._precondition_;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.WebDriverProvider;
import helpers.Attach;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import page._1card.*;
import page._2deposits.DepositsPage;
import page._3credits.CreditsPage;
import page._4mortgage.MortgagePage;
import page._5investment.InvestmentPage;
import page._6premium.PremiumPage;
import page._7buttonMore.BranchesAndATMsPage;
import page._7buttonMore.ButtonMoreDynamicModalWindow;
import page.main.MainPage;
import page.main.calculate.CalculateCreditPage;

import static com.codeborne.selenide.Selenide.*;

public class TestBase {

    protected MainPage mainPage = new MainPage();
    protected CalculateCreditPage calculateCreditPage = new CalculateCreditPage();
    /////////
    protected BankCardPage bankCardPage = new BankCardPage();
    /////////
    protected DebitCardPage debitCardPage = new DebitCardPage();
    protected CreditCardPage creditCardPage = new CreditCardPage();
    protected DebitCardInfoPage debitCardInfoPage = new DebitCardInfoPage();
    protected CreditCardInfoPage creditCardInfoPage = new CreditCardInfoPage();
    /////////
    protected DepositsPage depositsPage = new DepositsPage();
    /////////
    protected CreditsPage creditsPage = new CreditsPage();
    /////////
    protected MortgagePage mortgagePage = new MortgagePage();
    /////////
    protected InvestmentPage investmentPage = new InvestmentPage();
    /////////
    protected PremiumPage premiumPage = new PremiumPage();
    /////////
    protected ButtonMoreDynamicModalWindow buttonMore = new ButtonMoreDynamicModalWindow();
    protected BranchesAndATMsPage branchesAndATMsPage = new BranchesAndATMsPage();
    /////////

    @BeforeAll
    static void setUp() {
        WebDriverProvider.config();
    }

    @BeforeEach
    void beforeEach() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
    }

    @AfterEach
    void close() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        Attach.browserConsoleLogs();
        Attach.addVideo();
        closeWebDriver();
    }
}
