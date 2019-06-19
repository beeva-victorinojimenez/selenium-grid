package com.bbva.selenium.form;

import com.bbva.selenium.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class SeleniumGridPage extends BasePage {

    /* Css selectors
     * form             -->     .hello
     * input name       -->     input[id=nombre]
     * input email      -->     input[id=e-mail]
     * send button      -->     button
     * selenium skill   -->     input[name=Selenium]
     * cucumber skill   -->     input[name=Cucumber]
     * combo skills     -->     .comboSkills
     */

    SeleniumGridPage() {
        PageFactory.initElements(driver, this);
    }

    /**
     * Open specific url in navigator
     */
    void goToUrl(final String url) {
        //TODO fill
    }

    /**
     * Check that form is displayed
     */
    void checkFormDisplay() {
        //TODO fill
    }

    /*
     * Complete the form with the data
     */
    void fillFormData(final String name, final String email, final String skills) {
        //TODO fill
    }

    /*
     * Click in send button
     */
    void clickSend() {
        //TODO fill
    }

    /*
     * If response is OK check the filled data in the response page, if is KO check that isnt present
     */
    void checkResponse(String response) {
        //TODO fill
    }

}
