package com.example.demo.page.swaglabs;

import com.example.demo.page.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

@Component
public class LoginComponent extends BaseClass {

    @FindBy(id = "user-name")
    private WebElement username;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public void login(String username, String password) {
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        this.loginButton.click();
    }

    @Override
    public boolean isAt() {
        return this.wait.until(
                webDriver -> {
                    if (this.username.isDisplayed() && this.password.isDisplayed() && this.loginButton.isDisplayed()) {
                        return true;
                    }
                    return false;
                }
        );
    }
}
