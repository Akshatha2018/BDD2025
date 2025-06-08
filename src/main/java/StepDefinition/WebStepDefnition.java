package StepDefinition;

import Utility.Actions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class WebStepDefnition
{
    @Given("I Launch the chrome browser")
        public void launchChromeBrowser()
        {
            Actions.launchChrome();
        }
}
