package com.euro.mama.site.tests.model;

public class CallBackFormData {
    private final String name;
    private final String phone;
    private final String question;
    private final String capture;

    public CallBackFormData(String name, String phone, String question, String capture) {
        this.name = name;
        this.phone = phone;
        this.question = question;
        this.capture = capture;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getQuestion() {
        return question;
    }

    public String getCapture() {
        return capture;
    }
}
