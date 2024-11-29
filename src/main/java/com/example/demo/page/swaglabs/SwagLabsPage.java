package com.example.demo.page.swaglabs;

import com.example.demo.page.BaseClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwagLabsPage extends BaseClass {


    @Autowired
    private LoginComponent loginComponent;

    @Autowired
    private HomeComponent homeComponent;

    @Value("${application.url}")
    private String applicationUrl;

    public void goTo(){
        this.driver.get(applicationUrl);
    }

    public LoginComponent getLoginComponent() {
        return loginComponent;
    }

    public HomeComponent getHomeComponent() {
        return homeComponent;
    }

    @Override
    public boolean isAt() {
        return this.loginComponent.isAt();
    }
}
