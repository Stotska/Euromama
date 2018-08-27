package com.euro.mama.site.tests.tests;

import com.euro.mama.site.tests.model.RegistrationFormData;
import org.testng.annotations.Test;

public class RegistrationFormTest extends TestBase {

    @Test
    public void testRegistrationForm(){
        app.getNavigationHelper().goToAccountLoginPage();
        app.getNavigationHelper().goToRegistrationForm();
        app.getFillFormHelper().fillRegistrationForm(new RegistrationFormData("Иван Иванович", "Иванов", "ivan@gmail.com", "0971234546", "пр.Ленина, 38", "Харьков", "ivan2018", "ivan2018"));
        app.getFillFormHelper().submitRegistrationForm();
    }
}
