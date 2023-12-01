package page._7buttonMore;

import com.codeborne.selenide.*;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.openqa.selenium.By.linkText;

public class BranchesAndATMsPage {

    private final SelenideElement getTitleText = $x("//a[@href='/']/following-sibling::p");
    private final SelenideElement setSearchCity = $("[name='search']");
    private final ElementsCollection listCity = $$x("//form/following-sibling::div//li");
    private final SelenideElement buttonList =
            $x("//button[contains(@class, 'button__secondary_zsrtz')]/span[text()]");
    private final ElementsCollection containerListCity = $$x("//div[@data-test-id='listContainer']/div/div");

    // //div[@data-test-id="listContainer"]/div/div/p[@data-test-id="text"]/../../div
    public BranchesAndATMsPage getTitleText() {
        getTitleText.shouldHave(text("Банкоматы и офисы"));
        return this;
    }

    public BranchesAndATMsPage setCity(String city) {
        setSearchCity.setValue(city).pressEnter();
        $(withText("Только офисы")).should(visible, Duration.ofSeconds(4)).click();
        return this;
    }

    public BranchesAndATMsPage getFirstCity() {
        listCity.first().click();
        return this;
    }

    public BranchesAndATMsPage clickButtonListCity() {
        buttonList.click();
        return this;
    }



    public BranchesAndATMsPage getNumberOfBranchesFound(int expectedNumberOfBranches) throws InterruptedException {
        //Thread.sleep(4000);
        assertEquals(expectedNumberOfBranches, containerListCity.size());
        return this;
    }

}
