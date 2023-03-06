package com.hectorware.step_definitions;

import com.hectorware.pages.LoginPage;
import io.cucumber.java.en.Given;

public class US03_Main_Moduls_Step_Definitions {

    LoginPage loginPage =new LoginPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        loginPage.login();
    }
}
