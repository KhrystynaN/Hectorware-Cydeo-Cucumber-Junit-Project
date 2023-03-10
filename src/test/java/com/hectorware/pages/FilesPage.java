package com.hectorware.pages;

import com.hectorware.utilities.BrowserUtils;
import com.hectorware.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FilesPage extends BasePage {


    @FindBy(xpath = "//a[@data-action='menu']")
    public WebElement btn_action_icon;

    @FindBy(xpath = "//a[@data-action='Details']")
    public WebElement btn_details;

    @FindBy(xpath = "//a[@aria-controls=\"tab-commentsTabView\"]")
    public WebElement btn_comments;

    @FindBy(xpath = "//div[@contenteditable='true']")
    public WebElement input_comment;

    @FindBy(css = "input[class='submit icon-confirm has-tooltip']")
    public WebElement btn_summit;

   @FindBy(xpath = "(//div[@class='message'])[2]")
    public WebElement comment_Display_box;

   @FindBy(xpath = "//div[normalize-space()='seconds ago']")
    public WebElement txt_seconds_ago;


    @FindBy(xpath = "//div[@class='tooltip-inner']")
    public WebElement msg_error;

    @FindBy(xpath = "(//li[@class='comment'])[1]")
    public WebElement first_comment_msg;


//"C:\Users\tunar\OneDrive\Desktop\Sprint Project\Library_Credentials.pdf"
    //C:\Users\tunar\OneDrive\Desktop\Sprint Project\Library_Credentials.pdf
    //"C:\Users\tunar\OneDrive\Desktop\Sprint Project\sprint1\Screenshot 2023-02-13 220814.png"
    //C:\Users\tunar\OneDrive\Desktop\Sprint Project\sprint1\Screenshot 2023-02-13 220814.png

    }

















