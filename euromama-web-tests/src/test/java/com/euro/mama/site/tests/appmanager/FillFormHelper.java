package com.euro.mama.site.tests.appmanager;

import com.euro.mama.site.tests.model.CallBackFormData;
import com.euro.mama.site.tests.model.RegistrationFormData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FillFormHelper {

    WebDriver wd;
    public FillFormHelper(WebDriver wd) {
        this.wd = wd;
    }

    //begin**** CALL BACK FORM
    public void fillCallBackForm(CallBackFormData callBackFormData) {
        type(By.name("fio"), callBackFormData.getName());
        type(By.name("email"), callBackFormData.getPhone());
        type(By.name("ask"), callBackFormData.getQuestion());
        type(By.name("pr"), callBackFormData.getCapture());
    }

    public void submitCallBackForm() {
        click(By.cssSelector("input.bt1"));
    }
    //end**** CALL BACK FORM

    private void type(By locator, String text) {
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }
    private void click(By locator) {
        wd.findElement(locator).click();
    }

    //begin**** REGISTRATION FORM
    public void fillRegistrationForm(RegistrationFormData registrationFormData) {
        type(By.name("firstname"), registrationFormData.getFirstname());
        type(By.name("lastname"), registrationFormData.getLastname());
        type(By.name("email"), registrationFormData.getEmail());
        type(By.name("telephone"), registrationFormData.getTelephone());
        type(By.name("address_1"), registrationFormData.getAddress());
        type(By.name("city"), registrationFormData.getCity());
        if (!select("//select[@name='country_id']")) {
            click(By.xpath("//option[@value='220']"));
        }
        if (!select("//select[@name='zone_id']")) {
            click(By.xpath("//option[@value='3487']"));
        }
        type(By.name("password"), registrationFormData.getPassword());
        type(By.name("confirm"), registrationFormData.getConfirmpassword());
        if (!agreement("agree")) {
            click(By.name("agree"));
        }
    }

    private boolean agreement(String locator) {
        return wd.findElement(By.name(locator)).isSelected();
    }

    private boolean select(String locator) {
        return wd.findElement(By.xpath(locator)).isSelected();
    }

    public void submitRegistrationForm() {
        wd.findElement(By.cssSelector("input.button")).click();
    }
    //end**** REGISTRATION FORM
}
