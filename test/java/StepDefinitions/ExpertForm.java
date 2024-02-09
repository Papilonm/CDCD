package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ExpertForm extends CommonMethods {

    @Given("User clicks the Talk to an Expert button")
    public void user_clicks_the_talk_to_an_expert_button() {
        WebElement ExpertBtn = driver.findElement(By.xpath("//span[text()='Talk To An Expert']"));
        ExpertBtn.click();

    }

    @Then("User fills out form with {string} and \"Test\"and {string} and {string} information from outline")


    @Then("User fills out form with {string} and {string} and {string} and {string} information from outline")
    public void user_fills_out_form_with_and_and_and_information_from_outline(String firstName, String lastName, String email, String company) {
        WebElement firstname = driver.findElement(By.xpath("//input[@name='form_fields[name]']"));
        WebElement lastname = driver.findElement(By.xpath("//input[@name='form_fields[field_345ac45]']"));
        WebElement Email = driver.findElement(By.xpath("//input[@name='form_fields[email]']"));
        WebElement Company = driver.findElement(By.xpath("//input[@name='form_fields[field_a1fbb49]']"));

        firstname.sendKeys(firstName);
        lastname.sendKeys(lastName);
        Email.sendKeys(email);
        Company.sendKeys(company);
    }

    @Then("User clicks send & success message is visible")
    public void user_clicks_send_success_message_is_visible() {
        WebElement sendBtn = driver.findElement(By.xpath("//span[text()='Send']"));
        sendBtn.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        WebElement TyMsg = driver.findElement(By.xpath("//h1[text()='Thank You!']"));
        if (TyMsg.isDisplayed()) {
            System.out.println("FORM WAS FILLED AND SENT SUCCESFULLY!!");
        }


    }

}
