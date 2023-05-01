
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class HomeWork
{

    @Test
    void successFullFormTest () {
        open("https://github.com/");
        $("[placeholder='Search GitHub']").setValue("Selenide").pressEnter();
        $("[data-search-type='Wikis']").click();
        $("#wiki_search_results").shouldHave(text("SoftAssertions"));
        $("#wiki_search_results").$(byText("SoftAssertions")).click();
        $("#repo-content-turbo-frame").shouldHave(text("Using JUnit5 extend test class"));
    }
}