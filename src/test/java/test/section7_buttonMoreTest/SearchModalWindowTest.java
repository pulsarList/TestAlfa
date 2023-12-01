package test.section7_buttonMoreTest;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import test._precondition_.TestBase;

import static io.qameta.allure.Allure.step;

@Tag("modalWindow_test")
public class SearchModalWindowTest extends TestBase {

    @Test
    @Feature("Ещё")
    @Story("модальное окно")
    @Owner("Sergey")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Проверка модального окна")
    void shouldNumberOfBranchesInMoscow() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Наведение курсора мыши на секцию 'Ещё' в заголовке страницы", () -> {
            mainPage.selectTheSectionMore();
        });
        step("Проверка наличия модального окна для выбора раздела", () -> {
            mainPage.titleModalInfo();
        });
    }

}
