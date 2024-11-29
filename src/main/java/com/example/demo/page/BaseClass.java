package com.example.demo.page;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Abstract class which will be extended by all the page classes and force the implementation of isAt method.
 */

public abstract class BaseClass {

    @Autowired
    protected WebDriver driver;

    @Autowired
    protected WebDriverWait wait;

    @PostConstruct
    public void init() {
        PageFactory.initElements(this.driver, this);
    }

    public abstract boolean isAt();
}
