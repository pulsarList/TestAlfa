package test.section1_CardTest;

import helpers.DataGeneration;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import test._precondition_.TestBase;

import static io.qameta.allure.Allure.step;

@Tag("creditCardTest")
public class CreditCardTest extends TestBase {

    @Test
    @Feature("Кредитные карты")
    @Story("Список доступных кредитных карт для оформления заявки")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка списка доступных кредитных карт на сайте для оформления заявки")
    void shouldCreditCardInformation() {

        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Карты' в заголовке страницы", () -> {
            mainPage.selectTheSectionTitleCard();
        });
        step("Переход на страницу банковских карт и выбор списка кредитных карт и стикеров", () -> {
            bankCardPage
                    .bankCardPage()
                    .selectInfoCreditCard();
        });
        step("Проверка списка доступных кредитных карт", () -> {
            creditCardInfoPage
                    .checkingTheDisplayOfCreditCards();
        });
    }

    @Test
    @Feature("Кредитные карты")
    @Story("Форма заявки на кредитную Альфа-Карту")
    @Owner("Sergey")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка отображения формы заявки на кредитную Альфа-Карту")
    void shouldCreditCardApplicationForm() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Карты' в заголовке страницы", () -> {
            mainPage.selectTheSectionTitleCard();
        });
        step("Переход на страницу банковских карт", () -> {
            bankCardPage
                    .bankCardPage();
        });
        step("Нажатие кнопки 'Заказать карту'", () -> {
            bankCardPage
                    .orderACreditCard();
        });
        step("Открытие формы заявки на кредитную Альфа-Карту", () -> {
            creditCardPage
                    .getTitle();
        });
        step("Проверка наличия формы на странице", () -> {
            creditCardPage
                    .getAvailabilityOfTheForm();
        });
    }

    @Test
    @Feature("Кредитные карты")
    @Story("Заполнение полей ФИО заявки на кредитную Альфа-Карту")
    @Owner("Sergey")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Заполнение полей ФИО заявки на кредитную Альфа-Карту не стандартными данными")
    void sendingAFormWithNotStandardDataInTheFullNameFieldAndOpeningTheWarningSection() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Карты' в заголовке страницы", () -> {
            mainPage.selectTheSectionTitleCard();
        });
        step("Переход на страницу банковских карт", () -> {
            bankCardPage
                    .bankCardPage();
        });
        step("Нажатие кнопки 'Заказать карту'", () -> {
            bankCardPage
                    .orderACreditCard();
        });
        step("Открытие формы заявки на кредитную Альфа-Карту", () -> {
            creditCardPage
                    .getTitle();
        });
        step("Заполнение поля ФИО не стандартными данными", () -> {
            creditCardPage
                    .setFullName("Фамилия Имя Отчество");
        });
        step("Открытие секции ФИО для проверки введённых данных", () -> {
            creditCardPage
                    .click()
                    .getVerificationWindow()
                    .getMessageUnderTheLastNameField()
                    .getMessageUnderTheFirstNameField()
                    .getMessageUnderTheMiddleNameField()
                    .checkboxMiddleNameNotSelected();
        });
        step("Проверка наличия кнопок для выбора пола", () -> {
            creditCardPage
                    .getSelectGenderWoman()
                    .getSelectGenderMan();
        });
    }

    @Test
    @Feature("Кредитные карты")
    @Story("Заполнение формы заявки на кредитную Альфа-Карту")
    @Owner("Sergey")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Заполнение формы заявки на кредитную Альфа-Карту валидными значениями")
    void verificationOfSuccessfulValidationWhenFillingOutTheFormWithValidValues() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Карты' в заголовке страницы", () -> {
            mainPage.selectTheSectionTitleCard();
        });
        step("Переход на страницу банковских карт", () -> {
            bankCardPage
                    .bankCardPage();
        });
        step("Нажатие кнопки 'Заказать карту'", () -> {
            bankCardPage
                    .orderACreditCard();
        });
        step("Открытие формы заявки на кредитную Альфа-Карту", () -> {
            creditCardPage
                    .getTitle();
        });
        step("Заполнение формы валидными значениями", () -> {
            creditCardPage
                    .setFullName("Иванов Иван Иванович")
                    .setPhone("9049044444")
                    .setEmail(DataGeneration.getEmail())
                    .click();
        });
        step("Проверка наличия иконок успешной валидации в каждом поле, после заполнения", () -> {
            creditCardPage
                    .getSuccessIconFullNameInput()
                    .getSuccessIconPhoneInput()
                    .getSuccessIconEmailInput();
        });
    }

    @Test
    @Feature("Кредитные карты")
    @Story("Заполнение поля 'Телефон' заявки на кредитную Альфа-Карту")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Заполнение поля 'Телефон' формы заявки на кредитную Альфа-Карту номером из 10ти цифр")
    void enteringAThenDigitPhoneNumber() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Карты' в заголовке страницы", () -> {
            mainPage.selectTheSectionTitleCard();
        });
        step("Переход на страницу банковских карт", () -> {
            bankCardPage
                    .bankCardPage();
        });
        step("Нажатие кнопки 'Заказать карту'", () -> {
            bankCardPage
                    .orderACreditCard();
        });
        step("Открытие формы заявки на кредитную Альфа-Карту", () -> {
            creditCardPage
                    .getTitle();
        });
        step("Заполнение формы, ввод номера телефона из 10ти цифр", () -> {
            creditCardPage
                    .setFullName("Иванов Иван Иванович")
                    .setPhone("904904444")
                    .setEmail(DataGeneration.getEmail())
                    .click();
        });
        step("Проверка наличия предупреждающего сообщения под полем 'Мобильный телефон'", () -> {
            creditCardPage
                    .getWarningMessagePhoneField();
        });
        step("Проверка наличия иконок успешной валидации в полях заполненных корректно", () -> {
            creditCardPage
                    .getSuccessIconFullNameInput()
                    .getSuccessIconEmailInput();
        });
    }

    @ParameterizedTest
    @Feature("Кредитные карты")
    @Story("Заполнение поля 'Электронная почта' заявки на кредитную Альфа-Карту")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Заполнение поля 'Электронная почта' формы заявки на кредитную Альфа-Карту невалидными значениями")
    @CsvSource({
            "emailtest@",
            "emailtest@mailru",
            "@mail.ru",
            "testaddressmail.ru",
            "testaddress@mail.99"
    })
    void emailAddressWithoutADomainName(String email) {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Карты' в заголовке страницы", () -> {
            mainPage.selectTheSectionTitleCard();
        });
        step("Переход на страницу банковских карт", () -> {
            bankCardPage
                    .bankCardPage();
        });
        step("Нажатие кнопки 'Заказать карту'", () -> {
            bankCardPage
                    .orderACreditCard();
        });
        step("Открытие формы заявки на кредитную Альфа-Карту", () -> {
            creditCardPage
                    .getTitle();
        });
        step("Заполнение формы, ввод email без доменного имени", () -> {
            creditCardPage
                    .setFullName("Иванов Иван Иванович")
                    .setPhone("9049044444")
                    .setEmail(email)
                    .click();
        });
        step("Проверка наличия предупреждающего сообщения под полем 'Электронная почта'", () -> {
            creditCardPage
                    .getWarningMessageEmailField();
        });
        step("Проверка наличия иконок успешной валидации в полях заполненных корректно", () -> {
            creditCardPage
                    .getSuccessIconFullNameInput()
                    .getSuccessIconPhoneInput();
        });
    }


    @Test
    @Feature("Кредитные карты")
    @Story("Отправка не заполненной формы заявки на кредитную Альфа-Карту")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка наличия предупреждающих сообщений, под обязательными для заполнения полями, при отправке пустой формы заявки на кредитную Альфа-Карту")
    void sendingAnIncompleteForm() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Карты' в заголовке страницы", () -> {
            mainPage.selectTheSectionTitleCard();
        });
        step("Переход на страницу банковских карт", () -> {
            bankCardPage
                    .bankCardPage();
        });
        step("Нажатие кнопки 'Заказать карту'", () -> {
            bankCardPage
                    .orderACreditCard();
        });
        step("Открытие формы заявки на кредитную Альфа-Карту", () -> {
            creditCardPage
                    .getTitle();
        });
        step("Клик по кнопке 'Продолжить'", () -> {
            creditCardPage
                    .clickSubmitButton();
        });
        step("Проверка наличия информационных сообщений под обязательными, для заполнения, полями", () -> {
            creditCardPage
                    .getErrorMessageFullNameField()
                    .getWarningMessagePhoneField()
                    .getErrorMessageEmailField();
        });
    }

    @Test
    @Feature("Кредитные карты")
    @Story("Переход на главную страницу сайта")
    @Owner("Sergey")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Переход на главную страницу сайта со страницы оформления заявки на кредитную Альфа-Карту, с помощью кнопки логотипа 'А' в шапке страницы")
    void shouldGoFromTheApplicationPageToTheMainPage() {

        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Клик на секцию 'Карты' в заголовке страницы", () -> {
            mainPage.selectTheSectionTitleCard();
        });
        step("Переход на страницу банковских карт", () -> {
            bankCardPage
                    .bankCardPage();
        });
        step("Клик по кнопке 'Заказать карту'", () -> {
            bankCardPage
                    .orderACreditCard();
        });
        step("Открытие формы заявки на кредитную Альфа-Карту", () -> {
            creditCardPage
                    .getTitle();
        });
        step("Клик по логотипу 'А' в верхней части страницы", () -> {
            creditCardPage
                    .returnMainPage();
        });
        step("Переход к главной странице сайта", () -> {
            mainPage
                    .mainPage();
        });
    }

}
