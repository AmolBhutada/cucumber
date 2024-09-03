package com.edureka.cucumberdemo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(id = "username")
	private WebElement usernameField;

	@FindBy(id = "password")
	private WebElement passwordField;

	@FindBy(id = "loginBtn")
	private WebElement loginButton;

	public void login(String username, String password) {
		usernameField.sendKeys(username);
		passwordField.sendKeys(password);
		loginButton.click();

	}
}
