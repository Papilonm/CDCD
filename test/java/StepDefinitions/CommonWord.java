package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CommonWord extends CommonMethods {


    @Given("User finds out the most common word")
    public void user_finds_out_the_most_common_word() {
        WebElement body = driver.findElement(By.xpath("//body"));
        String WebsiteText = body.getText();
        String mostCommonWord = findWord(WebsiteText);

        System.out.println("The most common word in the website is :"+mostCommonWord);


    }


}
