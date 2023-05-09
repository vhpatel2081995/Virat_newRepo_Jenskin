package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DashboardPage {

	WebDriver driver;
	
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (how=How.XPATH, using = "//span[text()='Bank & Cash']") WebElement BANK_AND_CASH_ELEMENT ;
	@FindBy (how=How.XPATH, using = "//a[text()='New Account']") WebElement NEW_ACCOUNT_ELEMENT ;
	
	public void clickBankAndCashMenu() {
		BANK_AND_CASH_ELEMENT.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void clickNewAccount() {
		NEW_ACCOUNT_ELEMENT.click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
