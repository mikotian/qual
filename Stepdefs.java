package cucutests;

import static org.junit.Assert.assertEquals;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

public class Stepdefs {

    String dayToday;
    String answer;

    public String isitfridaytoday(){
        if(dayToday=="Friday")
        return "Yeah";
        else if(dayToday=="Thursday")
        return "Almost";
        else
        return "Nope";
    }

    @Given("^today is \"([^\"]*)\"$")
    public void today_is_(String day) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Setting Day to:"+day);
        dayToday=day;
    }

    @Given("^today is Sunday$")
    public void today_is_Sunday() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Setting Day to:Sunday");
        dayToday="Sunday";
    }

    @When("^I ask whether is's Friday yet$")
    public void i_ask_whether_is_s_Friday_yet() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        answer=isitfridaytoday();
    }

    @Then("^I should be told \"([^\"]*)\"$")
    public void i_should_be_told(String ans) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(ans, answer);
    }

    @Given("^today is Friday$")
    public void today_is_Friday() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        dayToday="Friday";
    }

}