package test.section4_MortgageTest;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import test._precondition_.TestBase;

import static io.qameta.allure.Allure.step;

@Tag("mortgageTest")
public class MortgageTest extends TestBase {

    @Test
    @Feature("Ипотека")
    @Story("раздел 'Новостройки'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображаемой информации по программам ипотеки в блоке 'Новостройки'")
    void shouldInfoNewBuildingsTabNewBuilding() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Ипотека' в заголовке страницы", () -> {
            mainPage.selectTheSectionMortgage();
        });
        step("Переход на страницу 'Ипотека онлайн'", () -> {
            mortgagePage
                    .getTitleText();
        });
        step("Клик по кнопке 'Новостройка'", () -> {
            mortgagePage
                    .clickButtonNewBuilding();
        });
        step("Информация по программам ипотеки в блоке 'Новостройки'", () -> {
            mortgagePage
                    .infoTheAllTab_newBuildings();
        });
    }

    @Test
    @Feature("Ипотека")
    @Story("раздел 'Ипотека на дом'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображаемой информации по программам ипотеки в блоке 'Ипотека на дом'")
    void shouldInfoMortgageOnAHouseTabNewBuilding() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Ипотека' в заголовке страницы", () -> {
            mainPage.selectTheSectionMortgage();
        });
        step("Переход на страницу 'Ипотека онлайн'", () -> {
            mortgagePage
                    .getTitleText();
        });
        step("Клик по кнопке 'Новостройка'", () -> {
            mortgagePage
                    .clickButtonNewBuilding();
        });
        step("Информация по программам ипотеки в блоке 'Ипотека на дом'", () -> {
            mortgagePage
                    .infoTheAllTab_MortgageOnAHouse();
        });
    }

    @Test
    @Feature("Ипотека")
    @Story("раздел 'Рефинансирование ипотеки'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображаемой информации по программам ипотеки в блоке 'Рефинансирование ипотеки'")
    void shouldInfoMortgageRefinancingTabNewBuilding() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Ипотека' в заголовке страницы", () -> {
            mainPage.selectTheSectionMortgage();
        });
        step("Переход на страницу 'Ипотека онлайн'", () -> {
            mortgagePage
                    .getTitleText();
        });
        step("Клик по кнопке 'Новостройка'", () -> {
            mortgagePage
                    .clickButtonNewBuilding();
        });
        step("Информация по программам ипотеки в блоке 'Рефинансирование ипотеки'", () -> {
            mortgagePage
                    .infoTheAllTab_MortgageRefinancing();
        });
    }

    @Test
    @Feature("Ипотека")
    @Story("раздел 'На строительство дома'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображаемой информации по программам ипотеки в блоке 'На строительство дома'")
    void shouldInfoForTheConstructionOfAHouseTabNewBuilding() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Ипотека' в заголовке страницы", () -> {
            mainPage.selectTheSectionMortgage();
        });
        step("Переход на страницу 'Ипотека онлайн'", () -> {
            mortgagePage
                    .getTitleText();
        });
        step("Клик по кнопке 'Новостройка'", () -> {
            mortgagePage
                    .clickButtonNewBuilding();
        });
        step("Информация по программам ипотеки в блоке 'На строительство дома'", () -> {
            mortgagePage
                    .infoTheAllTab_forTheConstructionOfAHouse();
        });
    }

    @Test
    @Feature("Ипотека")
    @Story("раздел 'Дальневосточная ипотека'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображаемой информации по программам ипотеки в блоке 'Дальневосточная ипотека'")
    void shouldInfoFarEasternMortgageTabNewBuilding() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Ипотека' в заголовке страницы", () -> {
            mainPage.selectTheSectionMortgage();
        });
        step("Переход на страницу 'Ипотека онлайн'", () -> {
            mortgagePage
                    .getTitleText();
        });
        step("Клик по кнопке 'Новостройка'", () -> {
            mortgagePage
                    .clickButtonNewBuilding();
        });
        step("Информация по программам ипотеки в блоке 'Дальневосточная ипотека'", () -> {
            mortgagePage
                    .infoTheAllTab_farEasternMortgage();
        });
    }

    @Test
    @Feature("Ипотека")
    @Story("раздел 'Вторичное жильё'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображаемой информации по программам ипотеки в блоке 'Вторичное жильё'")
    void shouldInfoSecondaryHousingTabSecondary() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Ипотека' в заголовке страницы", () -> {
            mainPage.selectTheSectionMortgage();
        });
        step("Переход на страницу 'Ипотека онлайн'", () -> {
            mortgagePage
                    .getTitleText();
        });
        step("Клик по кнопке 'Вторичка'", () -> {
            mortgagePage
                    .clickButtonSecondary();
        });
        step("Информация по программам ипотеки в блоке 'Вторичное жильё'", () -> {
            mortgagePage
                    .infoTheAllTab_secondaryHousing();
        });
    }

    @Test
    @Feature("Ипотека")
    @Story("раздел 'Семейная ипотека'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображаемой информации по программам ипотеки в блоке 'Семейная ипотека'")
    void shouldInfoFamilyMortgageTabFamilyMortgage() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Ипотека' в заголовке страницы", () -> {
            mainPage.selectTheSectionMortgage();
        });
        step("Переход на страницу 'Ипотека онлайн'", () -> {
            mortgagePage
                    .getTitleText();
        });
        step("Клик по кнопке 'Семейная ипотека'", () -> {
            mortgagePage
                    .clickButtonFamilyMortgage();
        });
        step("Информация по программам ипотеки в блоке 'Семейная ипотека'", () -> {
            mortgagePage
                    .infoTheAllTab_familyMortgage();
        });
    }

    @Test
    @Feature("Ипотека")
    @Story("раздел 'Рефинансирование ипотеки'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображаемой информации по программам ипотеки в блоке 'Рефинансирование ипотеки'")
    void shouldInfoMortgageRefinancingTabRefinancing() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Ипотека' в заголовке страницы", () -> {
            mainPage.selectTheSectionMortgage();
        });
        step("Переход на страницу 'Ипотека онлайн'", () -> {
            mortgagePage
                    .getTitleText();
        });
        step("Клик по кнопке 'Рефинансирование'", () -> {
            mortgagePage
                    .clickButtonRefinancing();
        });
        step("Информация по программам ипотеки в блоке 'Рефинансирование ипотеки'", () -> {
            mortgagePage
                    .infoTheAllTab_refinancing();
        });
    }

    @Test
    @Feature("Ипотека")
    @Story("раздел 'На строительство дома'")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка отображаемой информации по программам ипотеки в блоке 'На строительство дома'")
    void shouldInfoForTheConstructionOfAHouseTabPrivateHome() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Ипотека' в заголовке страницы", () -> {
            mainPage.selectTheSectionMortgage();
        });
        step("Переход на страницу 'Ипотека онлайн'", () -> {
            mortgagePage
                    .getTitleText();
        });
        step("Клик по кнопке 'Частный дом'", () -> {
            mortgagePage
                    .clickButtonPrivateHome();
        });
        step("Информация по программам ипотеки в блоке 'На строительство дома'", () -> {
            mortgagePage
                    .infoTheAllTab_privateHome();
        });
    }

}
