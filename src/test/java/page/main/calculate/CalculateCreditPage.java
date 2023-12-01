package page.main.calculate;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.cssValue;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static java.lang.Math.round;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculateCreditPage {

    private final SelenideElement inputCreditAmount = $("#creditAmount");
    private final SelenideElement selectCreditAmount = $("[name='creditAmount'][type='range']");
    private final SelenideElement loanTerm_1year = $("[data-test-id='creditTerm-1']");
    private final SelenideElement loanTerm_2years = $("[data-test-id='creditTerm-2']");
    private final SelenideElement loanTerm_3years = $("[data-test-id='creditTerm-3']");
    private final SelenideElement loanTerm_4years = $("[data-test-id='creditTerm-4']");
    private final SelenideElement loanTerm_5years = $("[data-test-id='creditTerm-5']");
    /////////////////////////////////////////////////
    private final SelenideElement monthlyLoanPayment =
            $x("//div[@id='1']//span[@data-test-id=\"popover-target\"]/following-sibling::p[@data-test-id=\"text\"]");
    private final SelenideElement monthlyLoanPayment_5Years =
            $x("//div[@id='1']//div/following-sibling::p[@data-test-id=\"text\"]");
    //     //button[@data-test-id='btnMinus']/../../../p
    //     //button[@data-test-id='btnMinus']/../../p
    //     //div/span/following-sibling::p
    //     //div[@id='1']//span[@data-test-id="popover-target"]/following-sibling::p[@data-test-id="text"]
    //     //div[@id='1']//span/following-sibling::p
    private final SelenideElement interestRate_percent =
            $x("//button[@data-test-id='btnMinus']/../../../../../following-sibling::div//span");
    //     //button[@data-test-id='btnMinus']/../../../../../following-sibling::div//span

    ////button[@data-test-id='btnMinus']/../../../../following-sibling::div//span
    //     //button[@data-test-id='btnMinus']/../../../../following-sibling::div//span


    public CalculateCreditPage clearAndSetLoanAmount(int loanAmount) {
        inputCreditAmount.sendKeys(Keys.CONTROL + "a");
        inputCreditAmount.sendKeys(Keys.BACK_SPACE);
        inputCreditAmount.setValue(String.valueOf(loanAmount));
        return this;
    }

    public CalculateCreditPage setYears(int years) {
        switch (years) {
            case 1:
                loanTerm_1year.click();
                break;
            case 2:
                loanTerm_2years.click();
                break;
            case 3:
                loanTerm_3years.click();
                break;
            case 4:
                loanTerm_4years.click();
                break;
            case 5:
                loanTerm_5years.click();
                break;
            default:
                break;
        }
        return this;
    }

    public CalculateCreditPage getInterestRate(int percent) {
        assertEquals(String.valueOf(percent), interestRate_percent.getText().substring(0, 1));
        return this;
    }

    public CalculateCreditPage getMonthlyLoanPayment(int payment, int variantDom) {
        if (variantDom == 1) {
            String actual = monthlyLoanPayment.getText()
                    .substring(0, String.valueOf(payment).length() + 1)
                    .replace(" ", "");
            assertEquals(String.valueOf(payment), actual);
        }
        if (variantDom == 2) {
            String actual = monthlyLoanPayment_5Years.getText()
                    .substring(0, String.valueOf(payment).length() + 1)
                    .replace(" ", "");
            assertEquals(String.valueOf(payment), actual);
        }
        return this;
    }

    public CalculateCreditPage getCheckedButton(int tabIndex) {
        $x("//div[@data-test-id='grid']//button[@data-test-id='creditTerm-" + tabIndex + "']")
                .shouldHave(cssValue("background"
                        , "rgb(18, 18, 18) none repeat scroll 0% 0% / auto padding-box border-box"));
        return this;
    }

    public double calculate(int loanAmount, double interestRate, int period, int variantDOM) {
        double interestRateMonth = interestRate / (12 * 100);
        double ratio = (interestRateMonth * Math.pow(1 + interestRateMonth, period) /
                (Math.pow(1 + interestRateMonth, period) - 1));
        double IntermediateResult = ratio * loanAmount;
        double paymentAmount = (IntermediateResult * period) / period;
        if (variantDOM == 1) {
            int other = Integer.parseInt(monthlyLoanPayment.scrollTo().getText()
                    .substring(0, String.valueOf((int) paymentAmount).length() + 1)
                    .replace(" ", ""));
            return round((int) ((other - paymentAmount) + paymentAmount));
        }
        if (variantDOM == 2) {
            int other = Integer.parseInt(monthlyLoanPayment_5Years.scrollTo().getText()
                    .substring(0, String.valueOf((int) paymentAmount).length() + 1)
                    .replace(" ", ""));
            return round((int) ((other - paymentAmount) + paymentAmount));
        }
        return -1;
    }

}
