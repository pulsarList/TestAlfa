package test.mainPageTest;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import test._precondition_.TestBase;
import test.mainPageTest.dataTestCreditCaculate.DataCreditCalculate;

import static io.qameta.allure.Allure.step;

@Tag("mainPageTest")
public class MainPageTest extends TestBase implements DataCreditCalculate {

    @ParameterizedTest(name =
            "The results of calculating the monthly payment at the loan amount: {0} and loan term {1}")
    @MethodSource("dataForTheCreditCalculator")
    @Feature("Кредитный калькулятор")
    @Story("Рассчёт ежемесячного платежа")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Рассчёт ежемесячного платежа с выбором суммы кредита и срока кредитования")
    void checkingTheMonthlyLoanPaymentWhenChoosingTheLoanTerm(
            int loanAmount, int years, int checkedButton, int period, int variantDom
            //variantDom - при выборе срока кредитования на 5_лет -> меняется структура DOM дерева, как следствие и локатор
    ) {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Ввод размера кредита в поле 'сумма кредита'", () -> {
            calculateCreditPage.clearAndSetLoanAmount(loanAmount);
        });
        step("Клик по кнопке 'год' с учётом желаемого срока кредитования", () -> {
            calculateCreditPage.setYears(years);
        });
        step("Проверка, что кнопка выбрана: цвет кнопки - чёрный", () -> {
            calculateCreditPage.getCheckedButton(checkedButton);
        });
        step("Сравнение отображаемой суммы ежемесячного платежа на сайте, " +
                "с значением рассчитанным по формуле, из метода 'calculate', с теми же введёнными параметрами", () -> {
            calculateCreditPage
                    .getMonthlyLoanPayment
                            ((int) calculateCreditPage
                                    .calculate(loanAmount, 4, period, variantDom), variantDom);
        });
    }

}
