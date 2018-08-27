package com.euro.mama.site.tests.appmanager;

import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class AppManager {

    WebDriver wd;

    private NavigationHelper navigationHelper;
    private FillFormHelper fillFormHelper;
    private String browser;

    public AppManager(String browser) {
        this.browser = browser;
    }

    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        if (browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        }   else if (browser.equals(BrowserType.FIREFOX)){
            wd = new FirefoxDriver();
        }   else if (browser.equals(BrowserType.IE)){
            wd = new InternetExplorerDriver();
        }
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        wd.get("http://euro-mama.com.ua/");
        fillFormHelper = new FillFormHelper(wd);
        navigationHelper = new NavigationHelper(wd);
    }

    public void stop() {
        wd.quit();
    }

    public FillFormHelper getFillFormHelper() {
        return fillFormHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
