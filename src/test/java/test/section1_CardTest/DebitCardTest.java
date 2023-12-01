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

@Tag("debitCardTest")
public class DebitCardTest extends TestBase {

    @Test
    @Feature("Дебетовые карты")
    @Story("Список доступных дебетовых карт для оформления заявки")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка списка доступных дебетовых карт на сайте для оформления заявки")
    void shouldDebitCardInformation() {
        step("Открытие главной страницы", () -> {
            mainPage.mainPage();
        });
        step("Нажатие на секцию 'Карты' в заголовке страницы", () -> {
            mainPage.selectTheSectionTitleCard();
        });
        step("Переход на страницу банковских карт и  выбор списка дебетовых карт и стикеров", () -> {
            bankCardPage
                    .bankCardPage()
                    .selectInfoDebitCard();
        });
        step("Проверка списка доступных дебетовых карт и стикеров с возможностью выбора", () -> {
            debitCardInfoPage
                    .getTitle()
                    .checkingTheDisplayOfDebitCards();
        });
    }

    @Test
    @Feature("Дебетовые карты")
    @Story("Форма заявки на дебетовую Альфа-Карту")
    @Owner("Sergey")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Проверка отображения формы заявки на дебетовую Альфа-Карту")
    void shouldDebitCardApplicationForm() {
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
                    .orderADebitCard();
        });
        step("Открытие формы заявки на дебетовую Альфа-Карту", () -> {
            debitCardPage
                    .getTitle();
        });
        step("Проверка наличия формы на странице", () -> {
            debitCardPage
                    .getAvailabilityOfTheForm();
        });
    }

    @Test
    @Feature("Дебетовые карты")
    @Story("Заполнение полей ФИО заявки на дебетовую Альфа-Карту")
    @Owner("Sergey")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Заполнение полей ФИО заявки на дебетовую Альфа-Карту не стандартными данными")
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
                    .orderADebitCard();
        });
        step("Открытие формы заявки на дебетовую Альфа-Карту", () -> {
            debitCardPage
                    .getTitle();
        });
        step("Проверка выбрана ли по умолчанию кнопка 'Да' в разделе Гражданство РФ", () -> {
            debitCardPage
                    .getResidentCheckedButton();
        });
        step("Заполнение поля ФИО не стандартными данными", () -> {
            debitCardPage
                    .setFullName("Фамилия Имя Отчество");
        });
        step("Открытие секции ФИО для проверки введённых данных", () -> {
            debitCardPage
                    .click()
                    .getVerificationWindow()
                    .getMessageUnderTheLastNameField()
                    .getMessageUnderTheFirstNameField()
                    .getMessageUnderTheMiddleNameField()
                    .checkboxMiddleNameNotSelected();
        });
        step("Проверка наличия кнопок для выбора пола", () -> {
            debitCardPage
                    .getSelectGenderWoman()
                    .getSelectGenderMan();
        });
    }

    @Test
    @Feature("Дебетовые карты")
    @Story("Заполнение формы заявки на дебетовую Альфа-Карту")
    @Owner("Sergey")
    @Severity(SeverityLevel.BLOCKER)
    @DisplayName("Заполнение формы заявки на дебетовую Альфа-Карту валидными значениями")
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
                    .orderADebitCard();
        });
        step("Открытие формы заявки на дебетовую Альфа-Карту", () -> {
            debitCardPage
                    .getTitle();
        });
        step("Заполнение формы валидными значениями", () -> {
            debitCardPage
                    .setFullName("Иванов Иван Иванович")
                    .setBirthField(1, 1, 1990)
                    .setPhone("9049044444")
                    .setEmail(DataGeneration.getEmail())
                    .click();
        });
        step("Проверка наличия иконок успешной валидации в каждом поле, после заполнения", () -> {
            debitCardPage
                    .getSuccessIconFullNameInput()
                    .getSuccessIconBirthInput()
                    .getSuccessIconPhoneInput()
                    .getSuccessIconEmailInput();
        });
    }

    @Test
    @Feature("Дебетовые карты")
    @Story("Заполнение поля 'Дата рождения' заявки на дебетовую Альфа-Карту")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Заполнение поля 'Дата рождения' формы заявки на дебетовую Альфа-Карту не наступившей датой")
    void enteringTheDateOfBirthThatHasNotOccurred() {
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
                    .orderADebitCard();
        });
        step("Открытие формы заявки на дебетовую Альфа-Карту", () -> {
            debitCardPage
                    .getTitle();
        });
        step("Заполнение формы, ввод не наступившей даты", () -> {
            debitCardPage
                    .setFullName("Иванов Иван Иванович")
                    .setBirthField(1, 1, 2990)
                    .setPhone("9049044444")
                    .setEmail(DataGeneration.getEmail())
                    .click();
        });
        step("Проверка наличия предупреждающего сообщения под полем 'Дата рождения'", () -> {
            debitCardPage
                    .getWarningMessageBirthDate();
        });
        step("Проверка наличия иконок успешной валидации в полях заполненных корректно", () -> {
            debitCardPage
                    .getSuccessIconFullNameInput()
                    .getSuccessIconPhoneInput()
                    .getSuccessIconEmailInput();
        });
    }

    @Test
    @Feature("Дебетовые карты")
    @Story("Заполнение поля 'Телефон' заявки на дебетовую Альфа-Карту")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Заполнение поля 'Телефон' формы заявки на дебетовую Альфа-Карту номером из 10ти цифр")
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
                    .orderADebitCard();
        });
        step("Открытие формы заявки на дебетовую Альфа-Карту", () -> {
            debitCardPage
                    .getTitle();
        });
        step("Заполнение формы, ввод номера телефона из 10ти цифр", () -> {
            debitCardPage
                    .setFullName("Иванов Иван Иванович")
                    .setBirthField(1, 1, 1990)
                    .setPhone("904904444")
                    .setEmail(DataGeneration.getEmail())
                    .click();
        });
        step("Проверка наличия предупреждающего сообщения под полем 'Мобильный телефон'", () -> {
            debitCardPage
                    .getWarningMessagePhoneField();
        });
        step("Проверка наличия иконок успешной валидации в полях заполненных корректно", () -> {
            debitCardPage
                    .getSuccessIconFullNameInput()
                    .getSuccessIconBirthInput()
                    .getSuccessIconEmailInput();
        });
    }

    @ParameterizedTest
    @Feature("Дебетовые карты")
    @Story("Заполнение поля 'Электронная почта' заявки на дебетовую Альфа-Карту")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Заполнение поля 'Электронная почта' формы заявки на дебетовую Альфа-Карту невалидными значениями")
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
                    .orderADebitCard();
        });
        step("Открытие формы заявки на дебетовую Альфа-Карту", () -> {
            debitCardPage
                    .getTitle();
        });
        step("Заполнение формы, ввод email без доменного имени", () -> {
            debitCardPage
                    .setFullName("Иванов Иван Иванович")
                    .setBirthField(1, 1, 1990)
                    .setPhone("9049044444")
                    .setEmail(email)
                    .click();
        });
        step("Проверка наличия предупреждающего сообщения под полем 'Электронная почта'", () -> {
            debitCardPage
                    .getWarningMessageEmailField();
        });
        step("Проверка наличия иконок успешной валидации в полях заполненных корректно", () -> {
            debitCardPage
                    .getSuccessIconFullNameInput()
                    .getSuccessIconBirthInput()
                    .getSuccessIconPhoneInput();
        });
    }

    @Test
    @Feature("Дебетовые карты")
    @Story("Отправка не заполненной формы заявки на дебетовую Альфа-Карту")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка наличия предупреждающих сообщений, под обязательными для заполнения полями, при отправке пустой формы заявки на дебетовую Альфа-Карту")
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
                    .orderADebitCard();
        });
        step("Открытие формы заявки на дебетовую Альфа-Карту", () -> {
            debitCardPage
                    .getTitle();
        });
        step("Клик по кнопке 'Продолжить'", () -> {
            debitCardPage
                    .clickSubmitButton();
        });
        step("Проверка наличия информационных сообщений под обязательными, для заполнения, полями", () -> {
            debitCardPage
                    .getErrorMessageFullNameField()
                    .getErrorMessageBirthDateField()
                    .getErrorMessagePhoneField();
        });
    }

    @Test
    @Feature("Дебетовые карты")
    @Story("Информационное окно для лиц не имеющих гражданства РФ")
    @Owner("Sergey")
    @Severity(SeverityLevel.NORMAL)
    @DisplayName("Проверка содержания информационного окна для лиц не имеющих гражданства РФ")
    void verificationOfAMessageForStatelessPersons() {
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
                    .orderADebitCard();
        });
        step("Открытие формы заявки на дебетовую Альфа-Карту", () -> {
            debitCardPage
                    .getTitle();
        });
        step("Клик по кнопке 'Нет' при выборе гражданства", () -> {
            debitCardPage
                    .getNotResidentCheckedButton();
        });
        step("Проверка содержания информационного окна для лиц не имеющих гражданства РФ", () -> {
            debitCardPage
                    .getNotResidentCheckedButton()
                    .getInformationWindowForPersonsWithoutCitizenship()
                    .buttonOfficeVisible();
        });
    }

    @Test
    @Feature("Дебетовые карты")
    @Story("Переход на главную страницу сайта")
    @Owner("Sergey")
    @Severity(SeverityLevel.MINOR)
    @DisplayName("Переход на главную страницу сайта со страницы оформления заявки на дебетовую Альфа-Карту, с помощью кнопки логотипа 'А' в шапке страницы")
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
                    .orderADebitCard();
        });
        step("Открытие формы заявки на дебетовую Альфа-Карту", () -> {
            debitCardPage
                    .getTitle();
        });
        step("Клик по логотипу 'А' в верхней части страницы", () -> {
            debitCardPage
                    .returnMainPage();
        });
        step("Переход к главной странице сайта", () -> {
            mainPage
                    .mainPage();
        });
    }

}
