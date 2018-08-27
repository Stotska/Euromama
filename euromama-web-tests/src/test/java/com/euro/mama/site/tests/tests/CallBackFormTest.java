package com.euro.mama.site.tests.tests;

import com.euro.mama.site.tests.model.CallBackFormData;
import org.testng.annotations.Test;

public class CallBackFormTest extends TestBase {

    @Test
    public void testCallBackForm() {
        app.getNavigationHelper().goToCallBackForm();
        app.getFillFormHelper().fillCallBackForm(new CallBackFormData("Lisa", "12345678910", "Hello", "9351"));
        app.getFillFormHelper().submitCallBackForm();
    }

}
