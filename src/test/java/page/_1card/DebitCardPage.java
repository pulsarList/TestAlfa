package page._1card;

import com.codeborne.selenide.SelenideElement;
import page.main.MainPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DebitCardPage {

    private final SelenideElement debitCardTitleText = $x("//h1");
    private final SelenideElement form = $("#form");
    private final SelenideElement linkToTheMainPage = $("[href='//alfabank.ru']");
    /////////////////////////////

    private final SelenideElement residentRusButton = $("[data-test-id='resident-resident']");
    private final SelenideElement notResidentRusButton = $("[data-test-id='resident-notResident']");
    private final SelenideElement buttonOffice = $("[data-test-id='not-resident-link']");
    /////////////////////////////

    private final SelenideElement fullNameInput = $("[name='fullName']");
    private final SelenideElement birthDateInput = $("[name='passportBirthDateField']");
    private final SelenideElement phoneInput = $("[name='phone']");
    private final SelenideElement emailInput = $("[name='email']");
    /////////////////////////////


    private final SelenideElement captionErrorFullName = $("[data-test-id='captionError-fullName']");
    private final SelenideElement captionErrorBirthDate = $("[data-test-id='captionError-passportBirthDateField']");
    private final SelenideElement captionErrorPhone = $("[data-test-id='captionError-phone']");
    /////////////////////////////

    private final SelenideElement successIconNameInput = $("[data-test-id='success-icon-fullName']");
    private final SelenideElement successIconLastNameInput = $("[data-test-id='success-icon-lastName']");
    private final SelenideElement successIconFirstNameInput = $("[data-test-id='success-icon-firstName']");
    private final SelenideElement successIconBirthInput = $("[data-test-id='success-icon-passportBirthDateField']");
    private final SelenideElement successIconPhoneInput = $("[data-test-id='success-icon-phone']");
    private final SelenideElement successIconEmailInput = $("[data-test-id='success-icon-email']");
    /////////////////////////////

    private final SelenideElement fullNameVerificationWindow = $("[data-test-id=\"three-field-fio\"]");
    /////////////////////////////
    private final SelenideElement messageSurnameField = $("[data-test-id='caption-lastName']");
    private final SelenideElement messageNameField = $("[data-test-id='caption-firstName']");
    private final SelenideElement messageMiddleName = $("[data-test-id='caption-middleName']");
    private final SelenideElement checkboxWithoutMiddleName = $("[type='checkbox']");
    /////////////////////////////

    private final SelenideElement selectGenderMan = $("[data-test-id='sex-m']");
    private final SelenideElement selectGenderWoman = $("[data-test-id='sex-f']");
    /////////////////////////////

    private final SelenideElement warningMessageBirthDate =
            $("[data-test-id='captionError-passportBirthDateField']");

    private final SelenideElement warningMessagePhoneField =
            $("[data-test-id='captionError-phone']");

    private final SelenideElement warningMessageEmailField =
            $("[data-test-id='captionError-email']");
    /////////////////////////////

    private final SelenideElement submitButton = $("[type='submit']");
    /////////////////////////////
    private final SelenideElement linkToTheTermsOfTheAgreement =
            $("[href='https://alfabank.servicecdn.ru/site-upload/93/a1/212/usloviya.pdf']");
    private final SelenideElement linkToTheContract =
            $("[href='https://alfabank.servicecdn.ru/site-upload/b9/26/2365/ct-2-9082023.pdf']");
    private final SelenideElement button_InformationAboutTheProcessingOfPersonalData =
            $x("//a[@target='_blank'][text()='согласие']");
    private final SelenideElement closeModalWindow = $("[data-test-id='modalCloseButton']");
    private final SelenideElement checkbox_IGiveMyConsent = $("[name='CheckboxGroupInForm']");


    public DebitCardPage getTitle() {
        debitCardTitleText.shouldHave(text("Заявка на дебетовую Альфа-Карту"), visible);
        return this;
    }

    public DebitCardPage getAvailabilityOfTheForm() {
        form.scrollTo().shouldBe(visible);
        return this;
    }

    public MainPage returnMainPage() {
        linkToTheMainPage.click();
        return new MainPage();
    }

    public void getResidentCheckedButton() {
        residentRusButton.shouldHave(cssValue("background"
                , "rgb(18, 18, 18) none repeat scroll 0% 0% / auto padding-box border-box"));
    }

    public DebitCardPage getNotResidentCheckedButton() {
        notResidentRusButton.click();
        notResidentRusButton.shouldHave(cssValue("background"
                , "rgb(18, 18, 18) none repeat scroll 0% 0% / auto padding-box border-box"));
        return this;
    }

    public DebitCardPage getInformationWindowForPersonsWithoutCitizenship() {
        $(byText(
                "Для оформления заявки на получение карты, пожалуйста, обратитесь в ближайшее отделение Альфа-Банка."))
                .shouldBe(visible);
        return this;
    }

    public DebitCardPage buttonOfficeVisible() {
        buttonOffice.shouldHave(text("Найти ближайшее отделение"), visible);
        return this;
    }

    /////////////////////////////////////////////////////////

    public DebitCardPage setFullName(String fullName) throws InterruptedException {
        //Thread.sleep(4000);
        fullNameInput.should(visible, Duration.ofSeconds(4)).scrollTo().setValue(fullName);
        return this;
    }

    public DebitCardPage getSuccessIconFullNameInput() {
        successIconLastNameInput.shouldBe(visible);
        successIconFirstNameInput.shouldBe(visible);
        return this;
    }

    public DebitCardPage click() {
        $x("//html").click();
        return this;
    }

    public DebitCardPage getVerificationWindow() {
        fullNameVerificationWindow.scrollTo().shouldHave(text("Проверьте, что введённые данные совпадают с паспортными"), visible);
        return this;
    }

    public DebitCardPage getMessageUnderTheLastNameField() {
        messageSurnameField.shouldHave(text("Укажите точно как в паспорте"));
        return this;
    }

    public DebitCardPage getMessageUnderTheFirstNameField() {
        messageNameField.shouldHave(text("Укажите точно как в паспорте"));
        return this;
    }

    public DebitCardPage getMessageUnderTheMiddleNameField() {
        messageMiddleName.shouldHave(text("Укажите точно как в паспорте"));
        return this;
    }

    public DebitCardPage getSelectGenderMan() {
        selectGenderMan.shouldBe(visible);
        return this;
    }

    public DebitCardPage getSelectGenderWoman() {
        selectGenderWoman.shouldBe(visible);
        return this;
    }

    public DebitCardPage checkboxMiddleNameNotSelected() {
        checkboxWithoutMiddleName.isDisplayed();
        return this;
    }

    public DebitCardPage getErrorMessageFullNameField() {
        captionErrorFullName.shouldHave(text("Поле обязательно для заполнения"), visible);
        return this;
    }


    public DebitCardPage setBirthField(int day, int month, int year) {
        String days = String.valueOf(day);
        String months = String.valueOf(month);
        String years = String.valueOf(year);
        if (Integer.parseInt(days) < 10) {
            days = "0" + days;
        }
        if (Integer.parseInt(months) < 10) {
            months = "0" + months;
        }
        String dayOf = days + months + years;
        birthDateInput.setValue(dayOf);
        return this;
    }

    public DebitCardPage getSuccessIconBirthInput() {
        successIconBirthInput.shouldBe(visible);
        return this;
    }

    public DebitCardPage getWarningMessageBirthDate() {
        warningMessageBirthDate.shouldHave(text("Указана некорректная дата"), visible);
        return this;
    }

    public DebitCardPage getErrorMessageBirthDateField() {
        captionErrorBirthDate.shouldHave(text("Поле обязательно для заполнения"), visible);
        return this;
    }


    public DebitCardPage setPhone(String phone) {
        phoneInput.setValue(phone);
        return this;
    }

    public DebitCardPage getSuccessIconPhoneInput() {
        successIconPhoneInput.shouldBe(visible);
        return this;
    }

    public DebitCardPage getWarningMessagePhoneField() {
        warningMessagePhoneField.shouldHave(text("Телефон указан неверно. Должно быть 11 цифр, например: +7 (901) 123-45-67"));
        return this;
    }

    public DebitCardPage getErrorMessagePhoneField() {
        captionErrorPhone.shouldHave(text("Поле обязательно для заполнения"), visible);
        return this;
    }


    public DebitCardPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public DebitCardPage getSuccessIconEmailInput() {
        successIconEmailInput.shouldBe(visible);
        return this;
    }

    public DebitCardPage getWarningMessageEmailField() {
        warningMessageEmailField.shouldHave(text("Email введен некорректно. Пример: example@domain.ru"), visible);
        return this;
    }

    public DebitCardPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

    ///////////////////////////////////////////////

    public void clickLinkToTheTermsOfTheAgreement() {
        linkToTheTermsOfTheAgreement.click();
    }

    public void clickLinkToTheContract() {
        linkToTheContract.click();
    }

    public void clickButton_InformationAboutTheProcessingOfPersonalData() {
        button_InformationAboutTheProcessingOfPersonalData.click();
        assertTrue(checkbox_IGiveMyConsent.isDisplayed());
        closeModalWindow.click();
    }

}
