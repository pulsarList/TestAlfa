package test.section3_CreditsTest;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import test._precondition_.TestBase;

import static io.qameta.allure.Allure.step;

@Tag("creditsTest")
public class CreditsTest extends TestBase {

    @Test
    @Feature("Кредиты")
    @Story("раздел 'Все'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображаемой информации в блоках о кредитах и рефинансировании в разделе 'Все'")
    void shouldInfoBlockConsumerLoans() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Кредиты' в заголовке страницы", () -> {
            mainPage.selectTheSectionCredits();
        });
        step("Переход на страницу 'Потребительские кредиты'", () -> {
            creditsPage
                    .getTitleText();
        });
        step("Проверка информации о кредитах и рефинансировании в разделе 'Все'", () -> {
            creditsPage
                    .getCheckedButton(0) // 0 = вкладка 'Все'
                    .infoTheAllTab_cashLoan()
                    .infoTheAllTab_onBailForAnyPurpose()
                    .infoTheAllTab_refinancing()
                    .infoTheAllTab_carLoan()
                    .infoTheAllTab_educationalLoan()
                    .infoTheAllTab_loanForTheConstructionOfAHouse()
                    .infoTheAllTab_loanForRepairs()
                    .infoTheAllTab_carLoanFromACarDealership()
                    .infoTheAllTab_refinancingACarLoan();
        });
    }

}
