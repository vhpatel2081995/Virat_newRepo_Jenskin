package steps;

import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pages.LoginPage;
import pages.AddNewAccountPage;
import pages.DashboardPage;
import pages.DataBasePage;

import pages.TestBase;

public class LoginStepDefination extends TestBase {

	LoginPage loginpage;
	DashboardPage dashboardpage;
	AddNewAccountPage addnewaccountpage;
	DataBasePage databasepage;

	@Before
	public void beforeStartMethod() {
		initDriver();

	}

	@Given("User is on the techfios login page")
	public void User_is_on_the_techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		dashboardpage = PageFactory.initElements(driver, DashboardPage.class);
		addnewaccountpage = PageFactory.initElements(driver, AddNewAccountPage.class);
		databasepage = new DataBasePage();
	}

	/*
	 * @When ("User enters the {string} in the \"username\" field") public void
	 * User_enters_the_in_the_username_field(String username) {
	 * loginpage.insertUserName(username); }
	 * 
	 * @When("User enters the {string} in the \"password\" field") public void
	 * user_enters_the_in_the_username_field(String password) {
	 * loginpage.insertPassword(password); }
	 * 
	 * @When("User clicks on \"login\"") public void user_clicks_on_login() {
	 * loginpage.clickOnSignInButton(); }
	 * 
	 * @Then("User should land on Dashboard page") public void
	 * user_should_land_on_Dashboard_page() { String expectedTitle =
	 * loginpage.getPageTitle(); String ActualTitle = "Dashboard- iBilling";
	 * Assert.assertEquals(expectedTitle, ActualTitle); takeScreenShot(driver); }
	 * 
	 * @Then("User clicks on \"<bankCash>\"") public void user_clicks_on_bankCash()
	 * { dashboardpage.clickBankAndCashMenu(); }
	 * 
	 * @Then("User clicks on \"<newAccount>\"") public void
	 * user_clicks_on_newAccount() { dashboardpage.clickNewAccount(); }
	 * 
	 * @Then("User enters {string} in the \"accountTitle\" field in accounts page")
	 * public void user_enters_in_the_accountTitle_field_in_accounts_page(String
	 * accountTitle) {
	 * addnewaccountpage.enterAcccoutTitle(accountTitle+generateRandomNumber(999));
	 * }
	 * 
	 * 
	 * @Then("User enters {string} in the \"description\" field in accounts page")
	 * public void user_enters_in_the_description_field_in_accounts_page(String
	 * description) { addnewaccountpage.enterAcccoutDescription(description); }
	 * 
	 * @Then("User enters {string} in the \"initialBalance\" field in accounts page"
	 * ) public void user_enters_in_the_initialBalance_field_in_accounts_page(String
	 * initialBalance) { addnewaccountpage.enterInitialBalance(initialBalance); }
	 * 
	 * @Then("User enters {string} in the \"accountNumber\" field in accounts page")
	 * public void user_enters_in_the_accountNumber_field_in_accounts_page(String
	 * accountNumber) {
	 * addnewaccountpage.enterAccountNumber(accountNumber+generateRandomNumber(999))
	 * ; }
	 * 
	 * @Then("User enters {string} in the \"contactPerson\" field in accounts page")
	 * public void user_enters_in_the_contactPerson_field_in_accounts_page(String
	 * contactPersonName) {
	 * addnewaccountpage.enterContactPersonName(contactPersonName); }
	 * 
	 * @Then("User enters {string} in the \"Phone\" field in accounts page") public
	 * void user_enters_in_the_Phone_field_in_accounts_page(String phoneNumber) {
	 * addnewaccountpage.enterPhoneNumber(phoneNumber); }
	 * 
	 * @Then("User enters {string} in the \"internetBankingURL\" field in accounts page"
	 * ) public void
	 * user_enters_in_internetBankingURL_the_field_in_accounts_page(String
	 * internetBankingURL) {
	 * addnewaccountpage.enterInternetBankingUrl(internetBankingURL); }
	 * 
	 * @Then("User clicks on \"submit\"") public void user_clicks_on_submit() {
	 * addnewaccountpage.clickOnSubmitButton(); }
	 * 
	 * 
	 * @Then("User should be able to validate account created successfully") public
	 * void user_should_be_able_to_validate_account_created_successfully() {
	 * addnewaccountpage.validateNewAccountAdded(); }
	 * 
	 * @After public void tearDown() { driver.close(); driver.quit(); }
	 */

	@When("User enters the {string} in the {string} field")
	public void user_enters_the_in_the_field(String userInfo, String field) {

		switch (field) {
		case "username":
			loginpage.insertUserName(userInfo);
			break;

		case "password":
			loginpage.insertPassword(userInfo);
			takeScreenShot(driver);
			break;

		default:
			System.out.println("Unable to enter userInfo: " + userInfo + "in field: " + field);

//		you can use this as well --
//		   if(field.equalsIgnoreCase("Username")) {
//			 loginpage.insertUserName(userInfo);
//		 } else if(field.equalsIgnoreCase("Password")) {
//			 loginpage.insertPassword(userInfo);
//		 } else {
//			 System.out.println("Unable to enter userInfo: "+userInfo+ "in field: " + field);
//		 }
		}

	}

	// method for loginwithDataFromDataBase
	@When("User enters the {string} from Database")
	public void user_enters_the_from_Database(String userData) {
		switch (userData) {
		case "username":
			loginpage.insertUserName(databasepage.getData("username"));
			System.out.println("Username from DB: " + databasepage.getData("username"));
			break;

		case "password":
			loginpage.insertPassword(databasepage.getData("password"));
			System.out.println("password from DB: " + databasepage.getData("password"));
			// takeScreenShot(driver);
			break;

		default:
			System.out.println("Unable to enter userInfo: " + userData + "in field: ");

		}

	}

	@Then("User should land on Dashboard page")
	public void user_should_land_on_Dashboard_page() {
		String expectedTitle = loginpage.getPageTitle();
		String ActualTitle = "Dashboard- iBilling";
		Assert.assertEquals(expectedTitle, ActualTitle);
		takeScreenShot(driver);
	}

	@When("User clicks on {string}")
	public void user_clicks_on(String button) {

		switch (button) {

		case "login":
			loginpage.clickOnSignInButton();
			break;

		case "bankCash":
			dashboardpage.clickBankAndCashMenu();
			break;

		case "newAccount":
			dashboardpage.clickNewAccount();
			break;

		case "submit":
			addnewaccountpage.clickOnSubmitButton();

		default:
			System.out.println("Unable to click on: " + button);

		}

	}

	@Then("User enters {string} in the {string} field in accounts page")
	public void user_enters_in_the_field_in_accounts_page(String data, String field) {
		switch (field) {
		case "accountTitle":
			addnewaccountpage.enterAcccoutTitle(data + generateRandomNumber(999));
			break;

		case "description":
			addnewaccountpage.enterAcccoutDescription(data);
			;
			break;

		case "initialBalance":
			addnewaccountpage.enterInitialBalance(data);
			break;

		case "accountNumber":
			addnewaccountpage.enterAccountNumber(data + generateRandomNumber(999));
			;
			break;

		case "contactPerson":
			addnewaccountpage.enterContactPersonName(data + generateRandomNumber(999));
			;
			break;

		case "Phone":
			addnewaccountpage.enterPhoneNumber(data + generateRandomNumber(999));
			;
			break;

		case "internetBankingURL":
			addnewaccountpage.enterInternetBankingUrl(data);
			takeScreenShot(driver);
			break;

		default:
			System.out.println("Unable to enter userInfo: " + data + "in field: " + field);
		}
	}

	@Then("User should be able to validate account created successfully")
	public void user_should_be_able_to_validate_account_created_successfully() {
		addnewaccountpage.validateNewAccountAdded();
		takeScreenShot(driver);
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
