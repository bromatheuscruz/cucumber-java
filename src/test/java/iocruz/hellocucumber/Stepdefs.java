package iocruz.hellocucumber;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class Stepdefs {

    private String today;
    private String actualAnswer;

    @Given("^today is Sunday$")
    public void today_is_Sunday() {
        // Write code here that turns the phrase above into concrete actions
        today = "Sunday";
    }

    @Given("today is Friday")
    public void today_is_Friday() {
        // Write code here that turns the phrase above into concrete actions
        today = "Friday";
    }


    @When("^I ask whether it's Friday yet$")
    public void i_ask_whether_it_s_Friday_yet() {
        // Write code here that turns the phrase above into concrete actions
        actualAnswer = ItIsFriday.isItFriday(today);
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(arg1, actualAnswer);
    }
}

class ItIsFriday {
    static String isItFriday(String today)
    {
        return "Friday".equals(today) ? "TGIF" : "Nope";
    }
}
