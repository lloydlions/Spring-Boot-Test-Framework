package com.example.demo.swaglabtest;

import com.example.demo.SpringBaseTestNGTest;
import com.example.demo.page.swaglabs.SwagLabsPage;
import com.example.demo.util.ScreenShotUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

import java.io.IOException;

public class SwagLabTest extends SpringBaseTestNGTest {

    @Autowired
    private SwagLabsPage swagLabsPage;

    @Autowired
    private ScreenShotUtil screenShotUtil;

    @Test
    public void swagLabsTest() throws IOException {
        this.swagLabsPage.goTo();
        Assert.assertTrue(this.swagLabsPage.isAt());

        this.swagLabsPage.getLoginComponent().login("standard_user", "secret_sauce");
        Assert.assertTrue(this.swagLabsPage.getHomeComponent().isAt());
        Assert.assertTrue(this.swagLabsPage.getHomeComponent().getCount() > 0);
        this.screenShotUtil.takeScreenShot();
    }
}
