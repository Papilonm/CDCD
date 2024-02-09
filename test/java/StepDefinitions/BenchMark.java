package StepDefinitions;

import Utils.CommonMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BenchMark extends CommonMethods {

    @Given("User navigates to website")
    public void user_navigates_to_website() {
        openBrowser();
        driver.manage().window().maximize();
        driver.get("https://mcim24x7.com/");
    }

    @Then("Lear nmore benchmark is present")
    public void lear_nmore_benchmark_is_present() {
        WebElement benchmark = driver.findElement(By.xpath("//span[text()='Learn more']"));
        if (benchmark.isEnabled() && benchmark.isDisplayed()) {
            System.out.println("BENCHMARK IS ENABLED AND DISPLAYED");
        }

    }

    @Then("Benchmark is clickable and redirects you to a different webpage")
    public void benchmark_is_clickable_and_redirects_you_to_a_different_webpage() {

        WebElement benchmark = driver.findElement(By.xpath("//span[text()='Learn more']"));
        benchmark.click();
        System.out.println("BENCHMARK WAS CLICKABLE AND REDIRECTED USER");

        driver.close();

    }

}
