package page._1card;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import page.main.MainPage;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class CreditCardPage {


    private final SelenideElement creditCardTitleText = $x("//h1");
    private final SelenideElement form = $("#hundredDaysForm");
    private final SelenideElement linkToTheMainPage = $("[data-test-id='Main-Header-Main-DesktopLogo']");

    //////////////////////////////////////////////


    private final SelenideElement fullNameVerificationWindow = $("[data-test-id='three-field-fio']");

    //////////////////////////////////////////////
    private final SelenideElement messageSurnameField = $("[data-test-id='caption-lastName']");
    private final SelenideElement messageNameField = $("[data-test-id='caption-firstName']");
    private final SelenideElement messageMiddleName = $("[data-test-id='caption-middleName']");
    private final SelenideElement checkboxWithoutMiddleName = $("[type='checkbox']");
    //////////////////////////////////////////////
    private final SelenideElement selectGenderMan = $("[data-test-id='sex-m']");
    private final SelenideElement selectGenderWoman = $("[data-test-id='sex-f']");

    //////////////////////////////////////////////
    private final SelenideElement warningMessagePhoneField =
            $("[data-test-id='captionError-phone']");
    private final SelenideElement warningMessageEmailField =
            $("[data-test-id='captionError-email']");
    //////////////////////////////////////////////

    private final SelenideElement submitButton =
            $("#hundredDaysForm [type='submit']");
    /////////////////////////////////////////////
    private final SelenideElement fullNameInput = $("[name='fullName']");
    private final SelenideElement phoneInput = $("[name='phone']");
    private final SelenideElement emailInput = $("[name='email']");
    //////////////////////////////////////////////

    private final SelenideElement captionErrorFullName = $("[data-test-id='captionError-fullName']");
    private final SelenideElement captionErrorEmail = $("[data-test-id='captionError-email']");
    /////////////////////////////////////////////

    private final SelenideElement successIconLastNameInput = $("[data-test-id='success-icon-lastName']");
    private final SelenideElement successIconFirstNameInput = $("[data-test-id='success-icon-firstName']");
    private final SelenideElement successIconPhoneInput = $("[data-test-id='success-icon-phone']");
    private final SelenideElement successIconEmailInput = $("[data-test-id='success-icon-email']");
    /////////////////////////////////////////////


    public CreditCardPage getTitle() {
        creditCardTitleText.shouldHave(text("Онлайн-заявка на кредитную карту"), visible);
        return this;
    }

    public CreditCardPage getAvailabilityOfTheForm() {
        form.scrollTo().shouldBe(visible);
        return this;
    }

    public MainPage returnMainPage() {
        linkToTheMainPage.click();
        return new MainPage();
    }

    /////////////////////////////////////////////

    public CreditCardPage setFullName(String fullName) {
        fullNameInput.should(visible, Duration.ofSeconds(4)).scrollTo().setValue(fullName);
        return this;
    }

    public CreditCardPage getSuccessIconFullNameInput() {
        Selenide.sleep(4000);
        successIconLastNameInput.scrollTo().shouldBe(visible, Duration.ofSeconds(2));
        successIconFirstNameInput.shouldBe(visible);
        return this;
    }

    public CreditCardPage click() {
        $x("//html").click();
        Selenide.sleep(3000);
        return this;
    }

    public CreditCardPage getVerificationWindow() {
        fullNameVerificationWindow.shouldHave(text("Проверьте, что введённые данные совпадают с паспортными"), visible);
        return this;
    }

    public CreditCardPage getMessageUnderTheLastNameField() {
        messageSurnameField.shouldHave(text("Укажите точно как в паспорте"));
        return this;
    }

    public CreditCardPage getMessageUnderTheFirstNameField() {
        messageNameField.shouldHave(text("Укажите точно как в паспорте"));
        return this;
    }

    public CreditCardPage getMessageUnderTheMiddleNameField() {
        messageMiddleName.shouldHave(text("Укажите точно как в паспорте"));
        return this;
    }

    public CreditCardPage checkboxMiddleNameNotSelected() {
        checkboxWithoutMiddleName.isDisplayed();
        return this;
    }

    public CreditCardPage getErrorMessageFullNameField() {
        captionErrorFullName.shouldHave(text("Поле обязательно для заполнения"), visible);
        return this;
    }

    public CreditCardPage getSelectGenderMan() {
        selectGenderMan.shouldBe(visible);
        return this;
    }

    public CreditCardPage getSelectGenderWoman() {
        selectGenderWoman.shouldBe(visible);
        return this;
    }

    public CreditCardPage setPhone(String phone) {
        phoneInput.setValue(phone);
        return this;
    }

    public CreditCardPage getSuccessIconPhoneInput() {
        successIconPhoneInput.shouldBe(visible);
        return this;
    }

    public CreditCardPage getWarningMessagePhoneField() {
        warningMessagePhoneField.shouldHave(text("Телефон указан неверно. Должно быть 11 цифр, например: +7 (901) 123-45-67"));
        return this;
    }

    public CreditCardPage setEmail(String email) {
        emailInput.setValue(email);
        return this;
    }

    public CreditCardPage getSuccessIconEmailInput() {
        successIconEmailInput.shouldBe(visible);
        return this;
    }

    public CreditCardPage getWarningMessageEmailField() {
        warningMessageEmailField.shouldHave(text("Email введен некорректно. Пример: example@domain.ru"), visible);
        return this;
    }

    public CreditCardPage getErrorMessageEmailField() {
        captionErrorEmail.shouldHave(text("Поле обязательно для заполнения"), visible);
        return this;
    }

    public CreditCardPage clickSubmitButton() {
        submitButton.click();
        return this;
    }

}
