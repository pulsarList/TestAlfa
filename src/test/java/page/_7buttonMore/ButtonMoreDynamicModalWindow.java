package page._7buttonMore;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class ButtonMoreDynamicModalWindow {
    private final SelenideElement branchesAndATMs = $("[href='/office/map/']");

    public void getBranchesAndATMsPage() {
        branchesAndATMs.click();
    }

}
