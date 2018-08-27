package com.euro.mama.site.tests.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationHelper {
    private WebDriver wd;

    public NavigationHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void goToCallBackForm() {
        click(By.id("go"));
    }

    public void goToAccountLoginPage() {
        click(By.xpath("//div[@id='banner1']//img"));
    }

    public void goToRegistrationForm() {
        click(By.xpath("//a[@class='button']"));
    }

    private void click(By locator) {
        wd.findElement(locator).click();
    }
}
