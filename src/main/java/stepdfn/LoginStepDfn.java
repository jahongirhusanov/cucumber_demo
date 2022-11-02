package stepdfn;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class LoginStepDfn {
    @Given("User is at the login page of the application")
    public void user_is_at_the_login_page_of_the_application() {

    }

    @When("User login with the following username and password")
    public void user_login_with_the_following_username_and_password(DataTable table) {
        for (List<String> str : table.cells()) {
            for (String str1 : str) {
                System.out.println(str1);
            }
        }
    }

    @Then("User should be logged with correct username and password")
    public void user_should_be_logged_with_correct_username_and_password() {

    }
}
