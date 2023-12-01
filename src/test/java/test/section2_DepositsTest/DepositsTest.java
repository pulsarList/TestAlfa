package test.section2_DepositsTest;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import test._precondition_.TestBase;

import static io.qameta.allure.Allure.step;

@Tag("depositsTest")
public class DepositsTest extends TestBase {

    @Test
    @Feature("Вклады")
    @Story("раздел 'Популярные'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка списка доступных вкладов в разделе 'Популярные'")
    void shouldCumulativeProductsInformation() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Вклады' в заголовке страницы", () -> {
            mainPage.selectTheSectionDeposits();
        });
        step("Переход на страницу 'Накопительные продукты'", () -> {
            depositsPage
                    .getTitleText();
        });
        step("Проверка списка доступных вкладов в разделе 'Популярные'", () -> {
            depositsPage
                    .getCheckedButton()
                    .checkingTheDisplayOfCumulativeProducts();
        });
    }

    @Test
    @Feature("Вклады")
    @Story("раздел 'Накопительные счета'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка списка доступных вкладов в разделе 'Накопительные счета'")
    void shouldDepositsInformationAccumulativeAccounts() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Вклады' в заголовке страницы", () -> {
            mainPage.selectTheSectionDeposits();
        });
        step("Переход на страницу 'Накопительные продукты'", () -> {
            depositsPage
                    .getTitleText();
        });
        step("Клик по кнопке 'Накопительные счета'", () -> {
            depositsPage
                    .clickButtonAccumulativeAccounts();
        });
        step("Проверка списка доступных вкладов в разделе 'Накопительные счета'", () -> {
            depositsPage
                    .getCheckedButton()
                    .checkingTheDisplayOfDepositsAccumulativeAccounts();
        });
    }

    @Test
    @Feature("Вклады")
    @Story("раздел 'Вклады'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка списка доступных вкладов в разделе 'Вклады'")
    void shouldDepositsInformation() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Вклады' в заголовке страницы", () -> {
            mainPage.selectTheSectionDeposits();
        });
        step("Переход на страницу 'Накопительные продукты'", () -> {
            depositsPage
                    .getTitleText();
        });
        step("Клик по кнопке 'Вклады'", () -> {
            depositsPage
                    .clickButtonDeposits();
        });
        step("Проверка списка доступных предложений в разделе 'Вклады'", () -> {
            depositsPage
                    .getCheckedButton()
                    .checkingTheDisplayOfDeposits();
        });
    }

    @Test
    @Feature("Вклады")
    @Story("раздел 'Сервисы для накоплений'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображаемой информации в блоках из раздела 'Сервисы для накоплений'")
    void shouldServingsServicesInformation() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Вклады' в заголовке страницы", () -> {
            mainPage.selectTheSectionDeposits();
        });
        step("Переход на страницу 'Накопительные продукты'", () -> {
            depositsPage
                    .getTitleText();
        });
        step("Клик по кнопке 'Сервисы для накоплений'", () -> {
            depositsPage
                    .clickButtonServingsServices();
        });
        step("Проверка информационных блоков в разделе 'Сервисы для накоплений'", () -> {
            depositsPage
                    .getCheckedButton1()
                    .infoBlockPiggyBankForSalaries()
                    .infoBlockScheduledPayment()
                    .infoBlockMyGoals();
        });
    }

}
