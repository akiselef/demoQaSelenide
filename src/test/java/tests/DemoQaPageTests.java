// в этот раз без ооп :(

package tests;

import org.junit.jupiter.api.Test;
import java.io.File;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class DemoQaPageTests {

    @Test
    void practiceFormTest () {
        open("https://demoqa.com/automation-practice-form");
        $("#firstName").setValue("User");
        $("#lastName").setValue("Name");
        $("#userEmail").setValue("a@a.com");
        $(".custom-control-label").shouldHave(text("Male")).click();
        $("#userNumber").setValue("1234567890");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("3");
        $(".react-datepicker__year-select").selectOptionByValue("2007");
        $x("//*[@class='react-datepicker__day react-datepicker__day--017']").click();
        $("#subjectsInput").setValue("English").pressEnter();
        $x("//label[text()='Music']").click();
        $x("//input[@type='file']").uploadFile(new File("src\\test\\resources\\download.jpg"));
        $("#currentAddress").setValue("ul. Pushkina, Kolotushkina app");
        $("#submit").scrollTo();
        $x("//div[text()='Select State']").click();
        $("#react-select-3-option-2").click();
        $x("//div[text()='Select City']").click();
        $("#react-select-4-option-1").click();
        $("#submit").click();
        $x("//td[text()='1234567890']").shouldBe(visible);
        $x("//td[text()='User Name']").shouldBe(visible);
        $x("//td[text()='a@a.com']").shouldBe(visible);
        $x("//td[text()='Male']").shouldBe(visible);
        $x("//td[text()='1234567890']").shouldBe(visible);
        $x("//td[text()='1234567890']").shouldBe(visible);
        $x("//td[text()='17 April,2007']").shouldBe(visible);
        $x("//td[text()='English']").shouldBe(visible);
        $x("//td[text()='Music']").shouldBe(visible);
        $x("//td[text()='download.jpg']").shouldBe(visible);
        $x("//td[text()='ul. Pushkina, Kolotushkina app']").shouldBe(visible);
        $x("//td[text()='Haryana Panipat']").shouldBe(visible);
    }

}
