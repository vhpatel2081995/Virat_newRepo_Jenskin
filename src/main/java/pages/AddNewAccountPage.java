package pages;

//import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;




public class AddNewAccountPage {

	WebDriver driver;

	public AddNewAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//h5[text()='Add New Account']")
	WebElement ADD_NEW_ACCOUNT_PAGE_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account']") //input[@id='account']
	WebElement ACCOUNT_TITLE_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement ACCOUNT_DESCRIPTION_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement INITIAL_BALANCE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement ACCOUNT_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement CONTACT_PERSON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement PHONE_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement INTERNET_BANKING_URL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary']")
	WebElement SUBMIT_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success fade in']")
	WebElement ACCOUNT_CREATION_ALERT_ELEMENT;
	
	public WebElement getPageTitleOfAddNewAccountPage() {
		return ADD_NEW_ACCOUNT_PAGE_HEADER_ELEMENT;
	}

	
//	static String insertedName;
//	public static String getInsertedName() {
//		return insertedName;
//	}
	
	public void enterAcccoutTitle(String accountTitle) {
		// insertedName = accountTitle;
		ACCOUNT_TITLE_NAME_ELEMENT.sendKeys(accountTitle);
	}

	public void enterAcccoutDescription(String description) {
		ACCOUNT_DESCRIPTION_ELEMENT.sendKeys(description);
	}

	public void enterInitialBalance(String initialBalance) {
		INITIAL_BALANCE_ELEMENT.sendKeys(initialBalance);
	}

	public void enterAccountNumber(String accountNumber) {
		ACCOUNT_NUMBER_ELEMENT.sendKeys(accountNumber);
	}

	public void enterContactPersonName(String contactPerson) {
		CONTACT_PERSON_ELEMENT.sendKeys(contactPerson);
	}

	public void enterPhoneNumber(String phoneNumber) {
		PHONE_NUMBER_ELEMENT.sendKeys(phoneNumber);
	}

	public void enterInternetBankingUrl(String internetBankingUrl) {
		INTERNET_BANKING_URL_ELEMENT.sendKeys(internetBankingUrl);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void clickOnSubmitButton() {
		SUBMIT_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	//String before_XPATH = "//tbody/tr[";
	//String after_XPATH = "]/td[1]";
	//String after_XPATH_Delete = "]/td[3]/a[2]";
	public void validateNewAccountAdded() {
		
		
		//Assert.assertTrue("validation of account not created", ACCOUNT_CREATION_ALERT_ELEMENT.isDisplayed());
		
		
		// tbody/tr[3]
		//tbody/tr[2]/td[1]
		//String before_XPATH = "//tbody/tr["; 
		//String after_XPATH = "]/td[1]"; //tbody/tr[32]/td[3]/a[2]

//		for (int i = 2; i <= 34; i++) {
//
//			String accountName = driver.findElement(By.xpath(before_XPATH + i + after_XPATH)).getText();
//			System.out.println(accountName);
//			if (accountName.equalsIgnoreCase(insertedName)) {
//				System.out.println(accountName);
//				driver.findElement(By.xpath(before_XPATH+ i + after_XPATH_Delete)).click();
//			}
//			break;
//		}
	}
}
