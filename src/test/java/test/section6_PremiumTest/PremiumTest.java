package test.section6_PremiumTest;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import test._precondition_.TestBase;

import static io.qameta.allure.Allure.step;

@Tag("premiumCardTest")
public class PremiumTest extends TestBase {

    @Test
    @Feature("Премиум")
    @Story("блок 'Альфа-Карта Premium'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображаемой информации о карте в блоке 'Альфа-Карта Premium'")
    void shouldInfoCardPremium() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Премиум' в заголовке страницы", () -> {
            mainPage.selectTheSectionPremium();
        });
        step("Переход на страницу 'Премиум'", () -> {
            premiumPage
                    .getTitleText();
        });
        step("Клик по кнопке 'Стать клиентом' в баннере страницы", () -> {
            premiumPage
                    .clickButtonBecomeACustomer();
        });
        step("Переход к информационному блоку 'Альфа-Карта Premium'", () -> {
            premiumPage
                    .infoBlockCardPremium();
        });
    }

    @Test
    @Feature("Премиум")
    @Story("форма на оформление альфа-карты Premium")
    @Owner("Sergey")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка отображаемой формы на оформление альфа-карты Premium")
    void shouldInfoFormOrderACard() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Премиум' в заголовке страницы", () -> {
            mainPage.selectTheSectionPremium();
        });
        step("Переход на страницу 'Премиум'", () -> {
            premiumPage
                    .getTitleText();
        });
        step("Клик по кнопке 'Стать клиентом' в баннере страницы", () -> {
            premiumPage
                    .clickButtonBecomeACustomer();
        });
        step("Переход к форме на оформление альфа-карты Premium", () -> {
            premiumPage
                    .infoFormOrderACard();
        });
    }
}
