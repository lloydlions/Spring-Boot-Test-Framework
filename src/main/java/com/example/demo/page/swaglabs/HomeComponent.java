package com.example.demo.page.swaglabs;

import com.example.demo.page.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HomeComponent extends BaseClass {

    @FindBy(xpath="//*[@class=\"inventory_item\"]")
    private List<WebElement> inventoryItem;

    public int getCount() {
        return inventoryItem.size();
    }

    @Override
    public boolean isAt() {
        return this.wait.until(webDriver -> !this.inventoryItem.isEmpty());
    }
}
