package com.stepdefinations;

import com.controller.Controller;
import com.operations.OpearionsList;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends Controller
{
	@When("^user open \"([^\"]*)\" browser$")
	public void openBrowser(String browserName) 
	{
		forEachStep("", "When user open "+browserName+" browser", OpearionsList.openBrowser, new String[] {browserName});
	}

	@When("^user enters url \"([^\"]*)\"$")
	public void enterURL(String url) 
	{
		forEachStep("", "When user enters url "+url+" ", OpearionsList.enterURL, new String[] {url});
	}

	@Then("^user will be on Applications login page$")
	public void LoginPage() 
	{
		forEachStep("objText_Login", "Then user will be on Applications login page", OpearionsList.LoginPage, new String[0]);
	}

	@When("^user enters username as \"([^\"]*)\"$")
	public void enterUserName(String userName) 
	{
		forEachStep("objInput_UserName", "When user enters username as "+userName+" ", OpearionsList.enterUserName, new String[] {userName});
	}

	@When("^user enters password as \"([^\"]*)\"$")
	public void enterPassword(String passWord) 
	{
		forEachStep("objInput_Password", "When user enters password as "+passWord+" ", OpearionsList.enterPassword, new String[] {passWord});
	}

	@When("^user clicks on submit button$")
	public void submit()
	{
		forEachStep("objButton_Submit", "When user clicks on submit button", OpearionsList.submit, new String[0]);
	}

	@Then("^user will be on application's home page$")
	public void applicationHomePage() 
	{
		forEachStep("objText_HomePage", "Then user will be on application's home page", OpearionsList.applicationHomePage, new String[0]);
	}

	@Then("^user will be on application's Login Page With error message \"([^\"]*)\"$")
	public void showErrorMessage(String errorMsg) 
	{
		forEachStep("objError_Message", "Then user will be on application's Login Page With error message "+errorMsg+" ", OpearionsList.showErrorMessage, new String[] {errorMsg});
	}

	@Then("^close the browser$")
	public void closeBrowser()
	{
	    forEachStep("", "Then close the browser", OpearionsList.closeBrowser, new String[0]);
	}
}
