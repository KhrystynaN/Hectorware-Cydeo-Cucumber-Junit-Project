package com.hectorware.step_definitions;

import com.hectorware.pages.BaseLoginPage;
import io.cucumber.java.en.Given;

public class Main_Moduls_Step_Definitions {

    BaseLoginPage loginPage =new BaseLoginPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        loginPage.login();
    }
}
