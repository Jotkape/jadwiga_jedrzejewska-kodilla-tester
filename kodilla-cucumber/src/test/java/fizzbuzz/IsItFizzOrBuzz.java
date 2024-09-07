package fizzbuzz;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.MonthDay;

import static fizzbuzz.NumberChecker.checkFizzBuzz;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static seasonchecker.SeasonChecker.checkIfSummer;

public class IsItFizzOrBuzz {
    private int number;
    private String answer;

    @Given("number is {int}")
    public void number_is_something(int number) {
        this.number = number;
    }

    @When("I ask whether it's divisible by 3 or 5")
    public void i_ask_whether_it_s_fizz_or_buzz() {
        this.answer = checkFizzBuzz(this.number);
    }

    @Then("I should get answer {string}")
    public void i_should_get_answer(String string) {
        assertEquals(string, this.answer);
    }
}
