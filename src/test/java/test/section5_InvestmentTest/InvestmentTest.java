package test.section5_InvestmentTest;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import test._precondition_.TestBase;

import static io.qameta.allure.Allure.step;

@Tag("investmentTest")
public class InvestmentTest extends TestBase {

    @Test
    @Feature("Инвестиции")
    @Story("модальное окно 'Ответы на вопросы'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображаемой информации по секциям 'Ответы на вопросы' в открывшемся модальном окне")
    void shouldInfoModalWindow() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Инвестиции' в заголовке страницы", () -> {
            mainPage.selectTheSectionInvestment();
        });
        step("Переход на страницу 'Инвестиции'", () -> {
            investmentPage
                    .getTitleText();
        });
        step("Клик по кнопке 'Подробнее' в баннере страницы", () -> {
            investmentPage
                    .clickButtonMoreDetails();
        });
        step("Информация по секциям 'Ответы на вопросы' " +
                "в открывшемся модальном окне", () -> {
            investmentPage
                    .infoModalWindow();
        });
        step("Клик по кнопке 'Закрыть' в модальном окне", () -> {
            investmentPage
                    .closeModalWindowMoreDetails();
        });
    }

    @Test
    @Feature("Инвестиции")
    @Story("форма заявки на открытие брокерского счёта")
    @Owner("Sergey")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка отображаемой формы для оформления заявки на открытие брокерского счёта")
    void shouldRedirectFormOpenABrokerageAccount() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Инвестиции' в заголовке страницы", () -> {
            mainPage.selectTheSectionInvestment();
        });
        step("Переход на страницу 'Инвестиции'", () -> {
            investmentPage
                    .getTitleText();
        });
        step("Клик по кнопке 'Открыть счёт' в верхнем баннере страницы", () -> {
            investmentPage
                    .clickButtonOpenAccount();
        });
        step("Переход к форме для оформления заявки на открытие брокерского счёта", () -> {
            investmentPage
                    .formOpenAccountOnThePage();
        });
    }

}
