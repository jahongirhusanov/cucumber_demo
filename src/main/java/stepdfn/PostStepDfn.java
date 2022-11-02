package stepdfn;

import io.cucumber.java.DefaultParameterTransformer;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import transform.TransformData;

public class PostStepDfn {
    @Given("^User should be logged in$")
    public void user_should_be_logged_in() {
        System.out.println("step");
    }

    @When("^I type the text in the test box$")
    public void i_type_the_text_in_the_test_box() {
        System.out.println("step");
    }

    @When("^I type the text as \"([^\"]*)\" in the test box$")
    public void i_type_the_text_as_something_in_the_test_box(String strArg1) throws Throwable {
        System.out.println("step with " + strArg1);
    }

    @Then("^The message should be get posted$")
    public void the_message_should_be_get_posted() {
        System.out.println("step");
    }

    @And("^should be present at its own wall$")
    public void should_be_present_at_its_own_wall() {
        System.out.println("step");
    }

    @And("^Click on Post button$")
    public void click_on_post_button() {
        System.out.println("step");
    }

    @When("^User supply the Youtube link as \"([^\"]*)\" in the text box$")
    public void user_supply_the_youtube_link_as_something_in_the_text_box(String strArg1) {
        System.out.println("Value is" + strArg1);
    }

    @Then("^Video should be get posted on the user wall$")
    public void video_should_be_get_posted_on_the_user_wall() {
        System.out.println("step");
    }

    @And("^the video should be proper Thumnail$")
    public void the_video_should_be_proper_thumnail() {
        System.out.println("step");
    }

}
